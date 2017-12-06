package de.sub.goettingen.arendt.ocrmapping;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.transform.sax.SAXSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathVariableResolver;

import org.xml.sax.InputSource;

import de.sub.goettingen.arendt.beans.PreprocessInfo;
import de.sub.goettingen.arendt.input.generated.Document;
import net.sf.saxon.Configuration;
import net.sf.saxon.lib.NamespaceConstant;
import net.sf.saxon.om.TreeInfo;
import net.sf.saxon.xpath.XPathFactoryImpl;

public class PreprocessXML implements XPathVariableResolver, NamespaceContext {
	
	public static void main(String args[]) throws Exception {
		PreprocessXML ppx = new PreprocessXML();
		SAXSource xml = ppx.readXML("/Users/Johannes/Documents/Arendt/oc2tei/cloud/Hannah-Arendt/Scans/Band-III/III-008/ocr/Arendt-III-008_xml/ocr_1504091569701.xml");
		ppx.preprocessXML(xml);
	}

	public SAXSource readXML(String filepath) {
		SAXSource ssource = null;
		try {
	        InputSource is = new InputSource(new File(filepath).toURI().toString());
	        ssource = new SAXSource(is);
		}catch (Exception e){
			System.out.println("Problem parsing input file");
			e.printStackTrace();
			System.exit(-1);
		}        
        return ssource;
	}
	
	@SuppressWarnings("rawtypes")
	public PreprocessInfo preprocessXML(SAXSource xmlDoc) {
		PreprocessInfo info = new PreprocessInfo();

		// setup to use saxon
        System.setProperty("javax.xml.xpath.XPathFactory:"+NamespaceConstant.OBJECT_MODEL_SAXON,
                "net.sf.saxon.xpath.XPathFactoryImpl");

		try {
			XPathFactory xpf = XPathFactory.newInstance(NamespaceConstant.OBJECT_MODEL_SAXON);
	        XPath xpe = xpf.newXPath();
	        Configuration config = ((XPathFactoryImpl) xpf).getConfiguration();
	        TreeInfo doc = config.buildDocumentTree(xmlDoc);	
	        
	        // Declare a variable resolver to return the value of variables used in XPath expressions
	        xpe.setXPathVariableResolver(this);

	        // setup namespaces
	        xpe.setNamespaceContext(this);	
	        
	        XPathExpression languages =
	                xpe.compile("for $v in distinct-values(//fr:formatting/@lang)\n" + 
	                		"	return\n" + 
	                		"	($v, count(index-of(//fr:formatting/@lang, $v)))");    
	        
	        List matches = (List)languages.evaluate(doc, XPathConstants.NODESET);
	        
	        String lang = null;
	        Map<String, Integer> languageMap = new HashMap<String, Integer>();
	        int languageCounter = 0;
	        for (int i = 0; i < matches.size(); i++) {
	        		Object item = matches.get(i);
	        		if (i % 2 == 0) {
	        			lang = (String) item;
	        		}else {
	        			languageMap.put(lang, ((java.math.BigInteger) item).intValue());
	        			languageCounter++;
	        		}
	        }
	        info.setNumberOfLanguages(languageCounter);
	        System.out.println("Found " + languageCounter +" different languages in the OCR document");
	        
	        // Sort the counts descending
	        LinkedHashMap<String, Integer> sortedLanguages =
	        		languageMap.entrySet().stream()
	        	       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	        	       .collect(Collectors.toMap(
	        	    	          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));;
	        	    	          
	       	  	          
	        	    	          
	        System.out.println("occurences " + sortedLanguages);
	        
	        Entry<String, Integer> mapEntry = sortedLanguages.entrySet().iterator().next();
	        String mainLang = mapEntry.getKey();
	        info.setMainLanguage(mainLang);
	        System.out.println("Main language of document: " + mainLang);
	        
	        for (String language : languageMap.keySet()) {
	        		for (Locale locale : Locale.getAvailableLocales()) {
	        			if (unifyLanguageString(language).equalsIgnoreCase(locale.getDisplayLanguage(Locale.ENGLISH))) {
	        				info.getLanguageMapping().put(language, locale.getLanguage());
	        				continue;
	        			}
	        		}
	        }
	        
	        System.out.println("Maping for language codes: "+ info.getLanguageMapping());
	        
	        
	        
		} catch (Exception e) {
			System.err.println("Problem preprocessing XML");
			e.printStackTrace();
			System.exit(-1);
		}

		
		return info;
	}
	
	public Document unMarshallInputFile(SAXSource xmlDoc) {
		Document inputDocument = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
	        System.setProperty("javax.xml.xpath.XPathFactory:"+NamespaceConstant.OBJECT_MODEL_SAXON,
	                "net.sf.saxon.xpath.XPathFactoryImpl");
			
			inputDocument = (Document) jaxbUnmarshaller.unmarshal(xmlDoc);
		}catch (Exception e){
			System.out.println("Problem parsing input file");
			e.printStackTrace();
			System.exit(-1);
		}
		return inputDocument;
	}

	public String getNamespaceURI(String prefix) {
		// Finereader namespace resolver
        if ("fr".equals(prefix)) {
            return "http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml";
        } 
        return null;
	}

	public String getPrefix(String namespaceURI) {
		return null;
	}

	@SuppressWarnings("rawtypes")
	public Iterator getPrefixes(String namespaceURI) {
		return null;
	}

	public Object resolveVariable(QName variableName) {
		return null;
	}	
	
	/**
	 * Finereader does return some odd language information
	 * they don't confirm to any ISO list. Remove
	 * some strings from the text
	 * @param language
	 * @return
	 */
	private String unifyLanguageString(String language) {
		language = language.replace("Standard", "");
		language = language.replace("TraditionalSort", "");
		language = language.replace("EnglishUnitedStates", "English");
		return language;		
	}
	
}
