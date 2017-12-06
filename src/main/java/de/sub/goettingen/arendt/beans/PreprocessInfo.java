package de.sub.goettingen.arendt.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PreprocessInfo {
	private int numberOfLanguages = 0;
	private String mainLanguage;
	
	private Map<String, String> languageMapping = new HashMap<String, String>();
	
	public PreprocessInfo() {
		languageMapping.put("Latin", "la");
	}
	
	public int getNumberOfLanguages() {
		return numberOfLanguages;
	}

	public String getMainLanguage() {
		return mainLanguage;
	}

	public void setNumberOfLanguages(int numberOfLanguages) {
		this.numberOfLanguages = numberOfLanguages;
	}

	public void setMainLanguage(String mainLanguage) {
		this.mainLanguage = mainLanguage;
	}

	public Map<String, String> getLanguageMapping() {
		return languageMapping;
	}
	
	
}
