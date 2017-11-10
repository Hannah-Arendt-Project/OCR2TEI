package de.sub.goettingen.arendt.ocrmapping;
import java.io.File;
import java.math.BigInteger;
import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.sub.goettingen.arendt.output.generated.Creation;
import de.sub.goettingen.arendt.output.generated.EditionStmt;
import de.sub.goettingen.arendt.output.generated.EditorialDecl;
import de.sub.goettingen.arendt.output.generated.EncodingDesc;
import de.sub.goettingen.arendt.output.generated.FileDesc;
import de.sub.goettingen.arendt.output.generated.LangUsage;
import de.sub.goettingen.arendt.output.generated.Language;
import de.sub.goettingen.arendt.output.generated.P;
import de.sub.goettingen.arendt.output.generated.ProfileDesc;
import de.sub.goettingen.arendt.output.generated.ProjectDesc;
import de.sub.goettingen.arendt.output.generated.PublicationStmt;
import de.sub.goettingen.arendt.output.generated.RefsDecl;
import de.sub.goettingen.arendt.output.generated.SourceDesc;
import de.sub.goettingen.arendt.output.generated.TEI;
import de.sub.goettingen.arendt.output.generated.TeiHeader;
import de.sub.goettingen.arendt.output.generated.TitleStmt;

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
 * Here we offer methods to write a default TEI header into the output XML
 * and do the XML marshalling.
 * 
 * @author Johannes Biermann, SUB Göttingen
 * @version 1.0
 */
public class OutputXML {

	
	/**
	 * writes the TEI XML head element
	 * it is not very nice, JAXB does not create builders
	 * a plugin like https://github.com/mklemm/jaxb2-rich-contract-plugin
	 * would be nicer, but for the main contents we don't have that many nested elements
	 * like in the TEI header
	 * @return
	 */
	public static TEI getTEIHeader(String mainLang) {
		TEI tei = new TEI();
		
		if (mainLang != null)
			tei.setLang(mainLang);
		TeiHeader teiHeader = new TeiHeader();
		
		FileDesc fileDesc = new FileDesc();
		TitleStmt titleStmt = new TitleStmt();
		titleStmt.setTitle("Automatic OCR transformation, please change title");
		fileDesc.setTitleStmt(titleStmt);
		EditionStmt editionStmt = new EditionStmt();
		editionStmt.setP(new P());
		fileDesc.setEditionStmt(editionStmt);

		fileDesc.setExtent(new BigInteger("0"));
		PublicationStmt publicationStmt = new PublicationStmt();
		publicationStmt.setP(new P());
		fileDesc.setPublicationStmt(publicationStmt);
		SourceDesc sourceDesc = new SourceDesc();
		sourceDesc.setP(new P());
		fileDesc.setSourceDesc(sourceDesc);
		teiHeader.setFileDesc(fileDesc);
		
		EncodingDesc encodingDesc = new EncodingDesc();
		EditorialDecl editorialDecl = new EditorialDecl();
		editorialDecl.setP(new P());
		encodingDesc.setEditorialDecl(editorialDecl);
		ProjectDesc projectDesc = new ProjectDesc();
		projectDesc.setP(new P());
		encodingDesc.setProjectDesc(projectDesc);
		RefsDecl refsDecl = new RefsDecl();
		refsDecl.setP(new P());
		encodingDesc.setRefsDecl(refsDecl);
		teiHeader.setEncodingDesc(encodingDesc);
		
		ProfileDesc profileDesc = new ProfileDesc();
		Creation creation = new Creation();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		creation.setDate(sdf.format(new java.util.Date()));
		profileDesc.setCreation(creation);
		LangUsage langUsage = new LangUsage();
		Language langEn = new Language();
		langEn.setIdent("en");
		langEn.setContent("English");
		Language langDe = new Language();
		langDe.setIdent("de");
		langDe.setContent("German");		
		Language langfr = new Language();
		langfr.setIdent("fr");
		langfr.setContent("French");			
		Language langla = new Language();
		langla.setIdent("la");
		langla.setContent("Latin");	
		Language langgrc = new Language();
		langgrc.setIdent("grc");
		langgrc.setContent("Greek (ancient), original letters");		
		Language langgrca = new Language();
		langgrca.setIdent("grc-la");
		langgrca.setContent("Greek (ancient), written in Latin script");	
		langUsage.getLanguage().add(langEn);
		langUsage.getLanguage().add(langDe);
		langUsage.getLanguage().add(langfr);
		langUsage.getLanguage().add(langla);		
		langUsage.getLanguage().add(langgrc);		
		langUsage.getLanguage().add(langgrca);
		profileDesc.setLangUsage(langUsage);
		teiHeader.setProfileDesc(profileDesc);
		
		tei.setTeiHeader(teiHeader);
		
		return tei;
	}
	
	public static boolean writeXMLOutput(TEI tei, String outputfilename) {
		try {
			File outputFile = new File(outputfilename);
			JAXBContext jaxbContext = JAXBContext.newInstance(TEI.class);
	        Marshaller marshaller = jaxbContext.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
	        // get rid of the standalone=yes thing in the xml header
	        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
	        marshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

	        marshaller.marshal(tei, outputFile);
	        
	        return true;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return false;
				
	}
	
	public static void writeXMLOutputToStdout(TEI tei) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(TEI.class);
	        Marshaller marshaller = jaxbContext.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
	     // get rid of the standalone=yes thing in the xml header
	        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
	        marshaller.setProperty("com.sun.xml.internal.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	        
	        marshaller.marshal(tei, System.out);
	        
		} catch (JAXBException e) {
			e.printStackTrace();
		}		
	}

}
