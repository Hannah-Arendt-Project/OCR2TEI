package de.sub.goettingen.arendt.ocrmapping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.sax.SAXSource;

import de.sub.goettingen.arendt.beans.PreprocessInfo;
import de.sub.goettingen.arendt.input.generated.BlockType;
import de.sub.goettingen.arendt.input.generated.CharParamsType;
import de.sub.goettingen.arendt.input.generated.Document;
import de.sub.goettingen.arendt.input.generated.Document.Page;
import de.sub.goettingen.arendt.input.generated.FormattingType;
import de.sub.goettingen.arendt.input.generated.LineType;
import de.sub.goettingen.arendt.input.generated.ParagraphType;
import de.sub.goettingen.arendt.input.generated.TextType;
import de.sub.goettingen.arendt.output.generated.Body;
import de.sub.goettingen.arendt.output.generated.Foreign;
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
		Locale.setDefault(Locale.ENGLISH);
		//TEI tei = convert2Tei("/tmp/ocr_1504081850380.xml", true);
		TEI tei = convert2Tei("/Users/Johannes/Documents/Arendt/oc2tei/cloud/Hannah-Arendt/Scans/Band-XIV-NL/XIV-NL-02/ocr-03/Arendt-XIV-NL-02-03_xml/ocr_1504604413610.xml", 
				true, "Lokaltest", true);

		OutputXML.writeXMLOutputToStdout(tei);
	}
	
	/**
	 * This is the main conversion method. It loops around the instantiated beans from the input
	 * XML to java objects. 
	 * @param inputFilePath the path to the input XML document
	 * @param lineBreakToP if newlines should be added to the p elements, only for better readability of the p elements
	 * @return
	 * @throws Exception
	 */
	public static TEI convert2Tei (String inputFilePath, 
			boolean lineBreakToP, 
			String documentId,
			boolean handleForeign) throws Exception {


		PreprocessXML ppxml = new PreprocessXML();
		SAXSource inputDocumentXML = ppxml.readXML(inputFilePath);
		PreprocessInfo preprocessInfo = ppxml.preprocessXML(inputDocumentXML);
		
		Document inputDocument = ppxml.unMarshallInputFile(inputDocumentXML);
		
		String mainLanguage = preprocessInfo.getMainLanguage();
		String mainLanguageCode = preprocessInfo.getLanguageMapping().get(mainLanguage);
		
		// this class represents the output XML
		TEI oTei = OutputXML.getTEIHeader(mainLanguageCode, documentId);
		
		Text oText = new Text();
		
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
			// also if we have a document Id (CLI) option we add this as prefix, too.
			if (documentId != null)
				oPb.setN(documentId + "-" + String.format("%08d", pageNumber));
			else
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
							
							// here we collect the text for the paragraph
							String oParagraphText = "";
							// some flags used for whitespace handling
							int lineCounter = 0;
							String lineBreakText = "";
							// the line elements marks a line on the original document
							for (LineType iLineType : iParagraphType.getLine()) {
								
								// here we store the text for the current line
								String iLine = "";
								// flag to indicate we should do not do a whitespace detection for this line
								boolean hadLinebreak = false;
								
								if (lineBreakText.length() > 0) {
									iLine = lineBreakText;
									lineBreakText = "";
								}
	
								// then follows 1-N formating types, so it spans
								// either the entire line , single characters or whole words, depending on the formating
								// used on the original text
								for (FormattingType iFormatingType : iLineType.getFormatting()) {
									
									// see if there is a special formating
									Hi oHi = handleFormatingInstruction(iFormatingType);
									Foreign oForeign = handleLanguageTag(iFormatingType, preprocessInfo, handleForeign);
									
									// now each individual character (charParams) is encoded in XML, remove this
									for (int i = 0; i < iFormatingType.getContent().size(); i++) {
										Serializable sChar = iFormatingType.getContent().get(i);
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
											hadLinebreak = true;
											//continue;
										}else if (iCharParamsType.isSuspicious()) {	
										// the unclear message from OCR is per character
										// since it is an inner type, just wrap the character with the XML
										// unclear element and continue the loop
											Unclear oUnclear = new Unclear();
											oUnclear.setReason("illegible");
											oUnclear.setCert("unknown");
											oUnclear.setContent(iCharacter);

											if (oHi != null && oForeign == null) {
												// if we have a special formating, just add the unclear to the formating
												if (oParagraphText.length() > 0 || iLine.length() > 0) {
													// to get a proper XML we need to add the current text to the P element
													// and then add our special XML type
													oHi.getContent().add(oParagraphText+iLine);
													oParagraphText = "";
													iLine = "";
												}
												oHi.getContent().add(oUnclear);	
												
											}else if (oHi != null && oForeign != null) {
													// if we have a special formating and a foreign element
													if (oParagraphText.length() > 0 || iLine.length() > 0) {
														// to get a proper XML we need to add the current text to the P element
														// and then add our special XML type
														oForeign.getContent().add(oParagraphText+iLine);
														//oHi.getContent().add(oForeign);
														oParagraphText = "";
														iLine = "";
													}
													//oHi.getContent().add(oUnclear);		
													oForeign.getContent().add(oUnclear);
											}else if (oHi == null && oForeign != null) {
												// if we have a foreign element surrounding
												if (oParagraphText.length() > 0 || iLine.length() > 0) {
													// to get a proper XML we need to add the current text to the P element
													// and then add our special XML type
													oForeign.getContent().add(oParagraphText+iLine);
													oParagraphText = "";
													iLine = "";
												}
												oForeign.getContent().add(oUnclear);												
											}else {
												// to get a proper XML we need to add the current text to the P element
												// and then add our special XML type												
												if (oParagraphText.length() > 0 || iLine.length() > 0) {
													oP.add(oParagraphText+iLine);
													oParagraphText = "";
													iLine = "";
												}
												oP.add(oUnclear);
											}
											//continue;	

										}else{
											// append the individual characters to the line
											iLine += iCharacter;
										}
									}						
									
									// special formating instruction
									// finish the current text, add the special XML type
									// Handle foreign elements
									if (oHi != null && oForeign == null) {
										oHi.getContent().add(oParagraphText+iLine);
										oP.add(oHi);
										oParagraphText = "";
										iLine = "";
									}else if (oHi != null && oForeign != null) {
										oForeign.getContent().add(oParagraphText+iLine);
										oHi.getContent().add(oForeign);
										oP.add(oHi);
										oParagraphText = "";
										iLine = "";										
									}else if (oHi == null && oForeign != null) {
										// finereader does mark single whitespaces as foreign elements
										// ignore such elements
										// else set the current text as foreign element
										if (!(oParagraphText+iLine).equals(" ")) {
											oForeign.getContent().add(oParagraphText+iLine);
											oP.add(oForeign);	
											oParagraphText = "";
											iLine = "";	
										}								
									}
									
								}
								
								// whitespace handling
								// the OCR often misses to add a whitespace at the line end.
								// But not every time. Do some detection here
								if (iLine.length() > 0) {
									
									// get the last character of the current line
									char currentLastCharOfLine = iLine.substring(iLine.length()-1, iLine.length()).toCharArray()[0];
							
									// see if this line had a line seperator - then add no whitespace
									// check if whitespace is present and check if this is the last line of the paragraph, then add no whitespace
									if (hadLinebreak == false
											&& !Character.isSpaceChar(currentLastCharOfLine) 
											&& lineCounter < (iParagraphType.getLine().size()-1)) {
										iLine += " ";
									}
									if (hadLinebreak == true && lineBreakToP) {
										Pattern p = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
										StringBuilder lineReverse = new StringBuilder(iLine).reverse();
										Matcher m = p.matcher(lineReverse);
										if (m.find()) {
										      lineBreakText = new StringBuilder(m.group(0)).reverse().toString();
										      
										      iLine =  new StringBuilder(lineReverse.substring(m.end(), 
										    		  lineReverse.length())).reverse().toString();										      
										}
									}
									hadLinebreak = false;										
								}								
								
								// for better readability of the output add a line break
								if (iLine.length() > 0 && lineBreakToP)
									iLine += "\n";
								
								oParagraphText +=iLine;
								
								lineCounter++;
							}
							// add any left over text to the P element (e.g. just plain format)
							if (oParagraphText.length() > 0)
								oP.add(oParagraphText);
							
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
	
	private static Foreign handleLanguageTag(FormattingType formating, PreprocessInfo info, boolean handleForeign) {
		
		Foreign foreign = null;
		if (info.getNumberOfLanguages() > 1 && handleForeign) {
			if (!formating.getLang().equalsIgnoreCase(info.getMainLanguage())) {
				foreign = new Foreign();
				foreign.setLang(info.getLanguageMapping().get(formating.getLang()));	
			}
		}		
		return foreign;
		
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
