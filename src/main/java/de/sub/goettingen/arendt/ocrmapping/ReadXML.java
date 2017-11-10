package de.sub.goettingen.arendt.ocrmapping;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import de.sub.goettingen.arendt.input.generated.BlockType;
import de.sub.goettingen.arendt.input.generated.CharParamsType;
import de.sub.goettingen.arendt.input.generated.Document;
import de.sub.goettingen.arendt.input.generated.Document.Page;
import de.sub.goettingen.arendt.input.generated.FormattingType;
import de.sub.goettingen.arendt.input.generated.LineType;
import de.sub.goettingen.arendt.input.generated.ParagraphType;
import de.sub.goettingen.arendt.input.generated.TextType;
import de.sub.goettingen.arendt.output.generated.Body;
import de.sub.goettingen.arendt.output.generated.Hi;
import de.sub.goettingen.arendt.output.generated.P;
import de.sub.goettingen.arendt.output.generated.Pb;
import de.sub.goettingen.arendt.output.generated.TEI;
import de.sub.goettingen.arendt.output.generated.Text;
import de.sub.goettingen.arendt.output.generated.Unclear;

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
 * Here we read the XML input and map it to the TEI XML
 * 
 * @author Johannes Biermann, SUB Göttingen
 * @version 1.0
 */
public class ReadXML {
	
	/**
	 * Just for local tests within the IDE without using the Cli interface
	 */
	public static void main(String args[]) throws Exception {
		
		TEI tei = convert2Tei("/tmp/ocr_1504081850380.xml", true);
		
		OutputXML.writeXMLOutputToStdout(tei);
	}
	
	/**
	 * 
	 * @param filepath
	 * @return
	 */
	private static Document unMarshallInputFile(String filepath) {
		File file = new File(filepath);
		Document inputDocument = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			inputDocument = (Document) jaxbUnmarshaller.unmarshal(file);
		}catch (Exception e){
			System.out.println("Problem parsing input file");
			e.printStackTrace();
			System.exit(-1);
		}
		
		return inputDocument;
	}

	/**
	 * This is the main conversion method. It loops around the instantiated beans from the input
	 * XML to java objects. 
	 * @param inputFilePath the path to the input XML document
	 * @param lineBreakToP if newlines should be added to the p elements, only for better readability of the p elements
	 * @return
	 * @throws Exception
	 */
	public static TEI convert2Tei (String inputFilePath, boolean lineBreakToP) throws Exception {

		Document inputDocument = unMarshallInputFile(inputFilePath);
		
		// this class represents the output XML
		TEI oTei = OutputXML.getTEIHeader(null);
		
		Text oText = new Text();
		//oText.setLang("en");
		
		// tei body
		Body oBody = new Body();
		
		// the XML structure
		// here https://abbyy.technology/en:features:ocr:xml
		// and here https://ocrsdk.com/documentation/specifications/xml-scheme-recognized-document/
		
		int pageNumber = 1;
		for (Page iPage : inputDocument.getPage()) {
			// we are at the page level here
			
			Pb oPb = new Pb();
			// if the images has been correctly labeled like 000001.tif etc
			// this should exactly represent that file. We can't get the original filename from the XML
			oPb.setN(String.format("%06d", pageNumber));
			oBody.getPOrAbOrPb().add(oPb);
			
			// the XML has Text, Table, Picture, Barcode, Separator, SeparatorsBox
			// picture are just coordinates, for TEI we could insert a blank Figure for later editing
			// Separator is just like a bigger blank thing
			// currently only text blocks are supported
			for (BlockType iBlockType : iPage.getBlock()) {
				
				if (iBlockType.getBlockType().equalsIgnoreCase("Text")) {
					// the text tag just surrounds the elements, no mapping needed here, there is one element per block
					for (TextType iTextType : iBlockType.getText()) {
						
						// now we are at the paragraph level
						for (ParagraphType iParagraphType : iTextType.getPar()) {
							// start tei output p
							List<Object> oP = new ArrayList<Object>();
							
							// the line elements marks a line on the original document
							String outputString = "";
							for (LineType iLineType : iParagraphType.getLine()) {
	
								// then follows 1-N formating types, so it spans
								// either the entire line , single characters or whole words, depending on the formating
								// used on the original text
								for (FormattingType iFormatingType : iLineType.getFormatting()) {
									
									// see if there is a special formating
									Hi oHi = handleFormatingInstruction(iFormatingType);
									
									// now each individual character (charParams) is encoded in XML, remove this
									for (Serializable sChar : iFormatingType.getContent()) {
										// since it does just return a list of serializable objects, we need
										// to see if it is an JAXB element and cast it to an JAXBElement, the list
										// contains also newlines we need to ignore
										if (sChar.getClass().getTypeName() != "javax.xml.bind.JAXBElement") 
											continue;
										
										JAXBElement<?> e = (JAXBElement<?>) sChar;
										// now we need to cast the generic JAXBElement into the XML Representation of CharParamsType
										// according to the XSD this is the only type
										// there is some word type mentioning on the graph from the documentation, but no
										// of the xml files has this type
										CharParamsType iCharParamsType = (CharParamsType) e.getValue();
										// each charParams contains only one element, get first item of the list
										String iCharacter = (String) iCharParamsType.getContent().get(0);

										// Finereader encodes the linebreaks withing words with ¬, remove this char
										// we don't need the output line by line in TEI
										if (iCharacter.equals("¬")) {
											continue;
										}else if (iCharParamsType.isSuspicious()) {									
										// the unclear message from OCR is per character
										// since it is an inner type, just wrap the character with the XML
										// unclear element and continue the loop
											Unclear oUnclear = new Unclear();
											oUnclear.setReason("illegible");
											oUnclear.setCert("unknown");
											oUnclear.setContent(iCharacter);
											
											if (oHi != null) {
												// if we have a special formating, just add the unclear to the formating
												if (outputString.length() > 0) {
													oHi.getContent().add(outputString);
													outputString = "";
												}
												oHi.getContent().add(oUnclear);
											}else {
												if (outputString.length() > 0) {
													oP.add(outputString);
													outputString = "";
												}
												oP.add(oUnclear);
											}
											continue;	

										}else{
											outputString += iCharacter;
										}
									}										
									
									// special formating instruction
									if (oHi != null) {
										oHi.getContent().add((outputString));
										oP.add(oHi);
										outputString = "";
									}
									
								}
								// for better readability of the output add a line break
								if (outputString.length() > 0 && lineBreakToP)
									outputString += "\n";
							}
							// add any left over text to the P element (e.g. just plain format)
							if (outputString.length() > 0)
								oP.add(outputString);
							
							// add the P element to the TEI
							oBody.getPOrAbOrPb().add(getP(oP));

						}
							
							
					}

				}

					
			}// end blocktype text
			pageNumber++;

		}

		oText.setBody(oBody);
		oTei.setText(oText);
				
		return oTei;
		
	}
	
	/**
	 * See if we need to wrap the output with special formating instruction or not
	 * @param formating
	 * @return
	 */
	private static Hi handleFormatingInstruction(FormattingType formating) {
		Hi oHi = new Hi();
		if (formating.isItalic() ) {
			oHi.setRend("italic");
		}else if (formating.isBold()) {
			oHi.setRend("bold");
		}
		else if (formating.isUnderline()) {
			oHi.setRend("underline");
		}else if (formating.isStrikeout()) {
			oHi.setRend("strikethrough");
		//}else if (formating.isSubscript()) {
		//	oHi.setRend("subscript"); // we dont have this in our output xsd defined
		}else if (formating.isSuperscript()) {
			oHi.setRend("super");
		}else {
			return null;
		}
		
		return oHi;
		
	}
	
	// this is a really dirty hack. If you add mixed content elements in JAXB
	// and two following elements are string[1] and string[2], it inserts a blank between
	// the string. If another xml element follows a string, there is no whitespace
	// -> so simplify the list by combining all text entries before any other xml
	// element is started
	private static P getP(List<Object> list) {
				
		P p = new P();

		String content = "";
		boolean wasString = false;
		
		for (int i=0; i<list.size(); i++) {
			Object o = list.get(i);
			if (o.getClass().getName().equals("java.lang.String")) {
				content += o;
				wasString = true;
			}else {
				if (wasString) {
					p.getContent().add(content);
					wasString = false;
					content = "";
				}
				p.getContent().add(o);
			}
			if (i == list.size()-1 && content.length() > 0) {
				p.getContent().add(content);
			}
		}	
		
		
		return p;
	}
	

}
