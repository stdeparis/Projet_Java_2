package com.nouveauprojet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class FileWriterData {
    
	public  void fileWriterData()  {
		try {

		SortSymptoms symptomsSorting = new SortSymptoms();
		TreeMap<String, Integer> map = symptomsSorting.sortingSymptomsData();
		FileWriter fw =  new FileWriter(new File("bang.txt"));
		for(String key : map.keySet()) {
			fw.write(key + "=" + map.get(key) + "\n");
		}
		
		
		fw.close();
		System.out.println("le texte a été copié avec succes");
	}catch(IOException e) {
	      e.printStackTrace();
	}
		
	
   }}
