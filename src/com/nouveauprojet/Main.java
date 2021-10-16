package com.nouveauprojet;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Stream;
 

public class Main{
 
	public static void main(String[] args) throws IOException {
		 
		FileWriterData finalResult = new FileWriterData();	
		finalResult.fileWriterData();
 
		/* Appel de la TreeMap et affichage dans la console pour vérifier que l'output est bon. 
		 * 
		 * */
		SortSymptoms consoleOutput = new SortSymptoms();
 
		TreeMap<String, Integer> symptoms = consoleOutput.sortingSymptomsData();
		for (Map.Entry<String, Integer> entry : symptoms.entrySet())
			System.out.println("Symptoms : " + entry.getKey() + ": " +entry.getValue());
 
 
	}
 
}
