package de.sub.goettingen.arendt.ocrmapping;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

/**
 * This class is responsible for parsing the command line options,
 * traversing through directories and calling the conversion methods.
 * 
 * @author Johannes Biermann, SUB Göttingen
 * @version 1.0
 */
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameters;

import de.sub.goettingen.arendt.output.generated.TEI;


public class Cli {

	@Parameters(commandDescription = "Process a single XML File")
	public static class CommandSingle {
		@Parameter(names = { "-i", "--input" }, description = "The source XML OCR File from ABBYY", required = true)
		private String inputFile = null;
		
		@Parameter(names = { "-o", "--output" }, description = "The path and filename to the generated TEI output file", required = true)
		private String outputFile = null;	
		
		@Parameter(names = { "-lb", "--linebreak" }, description = "Add line breaks to p elements", required = false)
		private boolean lineBreak = true;		
		
		@Parameter(names = { "-f", "--foreign" }, description = "Add foreign elements to output", required = false)
		private boolean foreignElements = false;			
		
		@Parameter(names = { "-h", "--help" }, description = "print this message", help = true)
		private boolean help;	
	}
	
	@Parameters(commandDescription = "Process recursively a whole directory")
	public static class CommandDir {
		@Parameter(names = { "-d", "--dir" }, description = "The start path of the directory for processing the files", required = true)
		private String path = null;
				
		@Parameter(names = { "-lb", "--nolinebreak" }, description = "Add line break to p elements", required = false)
		private boolean lineBreak = true;
		
		@Parameter(names = { "-f", "--foreign" }, description = "Add foreign elements to output", required = false)
		private boolean foreignElements = false;				
		
		@Parameter(names = { "-s", "--specific" }, description = "Do very project specific directory scanning (outside of this project do NOT set this option to true)", required = false)
		private boolean specificWalk = false;
		
		@Parameter(names = { "-p", "--pattern" }, description = "The regex pattern for matching the OCR xml files", required = false)
		private String pattern = "ocr_(.*).xml";		
		
		@Parameter(names = { "-h", "--help" }, description = "print this message", help = true)
		private boolean help;	
	}	
	
	static CommandSingle commandSingle;
	static CommandDir commandDir;
	private int cntr;

	
	public static void main(String[] args) {
		Cli main = new Cli();
		commandSingle = new CommandSingle();
		commandDir = new CommandDir();
		
		
		JCommander jc = JCommander.newBuilder()
			    .addObject(main)
			    .addCommand("file", commandSingle)
			    .addCommand("dir", commandDir)
			    .build();
		jc.setProgramName("Finereader XML to basic TEI converter");
		try {
			jc.parse(args);
		} catch (ParameterException e) {
			jc.usage();
			System.out.println(e.getMessage());
			System.out.println("Parameter missing or invalid, cannot start.");
			System.exit(-1);
		}
		
		if (jc.getParsedCommand() != null) {
		  if (jc.getParsedCommand().equals("file")) {
			main.runSingle();
		  }else if (jc.getParsedCommand().equals("dir")) {
			main.rundDirectory();
		  }
		}else {
			jc.usage();
			System.exit(-1);
		}

    }

    private void runSingle() {
    		long start = System.currentTimeMillis();
        System.out.println("Start to process Input File " + Cli.commandSingle.inputFile + " into " + Cli.commandSingle.outputFile);
        
        try {
			TEI tei = ReadXML.convert2Tei(Cli.commandSingle.inputFile, 
					Cli.commandSingle.lineBreak, 
					null, Cli.commandSingle.foreignElements);
			boolean success = OutputXML.writeXMLOutput(tei, Cli.commandSingle.outputFile);
			if (success == false) {
				System.out.println("Failure on writing XML output");
				System.exit(-1);			
			}
				
		} catch (Exception e) {
			System.out.println("Failure on processing " + Cli.commandSingle.inputFile );
			e.printStackTrace();
			System.exit(-1);
		}
        
        long duration = (System.currentTimeMillis()) - start;
        
        System.out.println("Finished processing. Duration: " + duration +" ms");
        
    }
    
    private void rundDirectory() {
		Path start = Paths.get(Cli.commandDir.path);

		try {
			Files.walkFileTree(start, new FileVisitor<Path>() {
				
				public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
					return FileVisitResult.CONTINUE;
				}

				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					
					if (file.getFileName().toString().matches(Cli.commandDir.pattern)) {
						Cli.this.cntr++;
						long start = System.currentTimeMillis();
						System.out.println("file found at path: " + file.toAbsolutePath());
						System.out.println("\tStart to process Input File " + file.getFileName().toString() + " into TEI");
						String teiFilePath = null;
						String documentId = "";
						
						// project specific Filename and path setting
						// dir is structured like
						// IV-NUMBER/IV-NUMBER_tif <- scans
						// IV-NUMBER/ocr <- ocr data
						// IV-NUMBER/IV-NUMBER_xml <- input data
						// create DIR IV-NUMBER/ocr/IV-NUMBER_TEI
						// with file IV-NUMBER_TEI_Originalfilename.xml
						if (Cli.commandDir.specificWalk) {
							String newTEIDirname = file.getParent().getFileName().toString().replace("_xml", "_TEI");
							documentId = "Volume-"+newTEIDirname;
							Path newTEIDir= file.getParent().resolveSibling(newTEIDirname);

							String teiFilename = newTEIDirname +"_"+ file.getFileName().toString().replace("ocr_", "");
							teiFilePath = Paths.get(newTEIDir.toString(), teiFilename).toString();
												
							if (!Files.exists(newTEIDir)) {
							    try {
							        Files.createDirectory(newTEIDir);
							        System.out.println("\tCreated new output directory "+newTEIDir.toString());
							    } catch (IOException e) {
							    		System.err.println("\tFailed to create TEI output directory");
							        System.err.println(e);
							        return FileVisitResult.CONTINUE;
							    }
							}							
						}else {
							// generic dir traverse, just append TEI and use the original file name
							// and save it into the same dir
							String teiFilename = "TEI-"+file.getFileName().toString();
							documentId = getBaseName(file.getFileName().toString());
							teiFilePath = Paths.get(file.getParent().toString(), teiFilename).toString();							
						}		

						
						try {
							TEI tei = ReadXML.convert2Tei(file.toAbsolutePath().toString(), Cli.commandDir.lineBreak,
									documentId, Cli.commandDir.foreignElements);
							
							boolean success = OutputXML.writeXMLOutput(tei, teiFilePath);
							if (success == false) {
								System.out.println("Failure on writing XML output");
								return FileVisitResult.CONTINUE;
							}

						} catch (Exception e) {
							System.out.println("\tFailure on processing " + file.getFileName().toString());
							e.printStackTrace();
							return FileVisitResult.CONTINUE;
						}

						long duration = (System.currentTimeMillis()) - start;
						System.out.println("\tTEI file is on " + teiFilePath.toString());
						
						System.out.println("\tFinished processing. Duration: " + duration + " ms");					
						
						return FileVisitResult.CONTINUE;
					}

					return FileVisitResult.CONTINUE;
				}

				public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
					System.out.println("visit file failed: " + file);
					return FileVisitResult.CONTINUE;
				}

				public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Finished, processed " + cntr + " files");
    }
    
    public static String getBaseName(String fileName) {
        int index = fileName.lastIndexOf('.');
        if (index == -1) {
            return fileName;
        } else {
            return fileName.substring(0, index);
        }
    }   

}
