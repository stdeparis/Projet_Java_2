package com.nouveauprojet;

import java.util.List;
import java.util.TreeMap;

public class SortSymptoms{
     
	

	public TreeMap<String, Integer> sortingSymptomsData() {
 
		ReadSymptomDataFromFile file = new ReadSymptomDataFromFile("c:/Users/TERES/symptoms.txt");
		file.getSymptoms();
		List<String> symptomsFile = file.getSymptoms();
 
		TreeMap<String, Integer> symptomsTri = new TreeMap<>();
		for (String listSymptoms : symptomsFile) {
			if (symptomsTri.containsKey(listSymptoms)) {
				symptomsTri.put(listSymptoms, symptomsTri.get(listSymptoms) + 1);
			} else {
				symptomsTri.put(listSymptoms, 1);
			}
 
		}
		return symptomsTri;
	}
}
