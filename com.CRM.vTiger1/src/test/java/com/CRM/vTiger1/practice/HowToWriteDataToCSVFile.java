package com.CRM.vTiger1.practice;

import java.io.FileWriter;
import com.opencsv.CSVWriter;

public class HowToWriteDataToCSVFile {
	public static void main(String[] args) throws Exception {
		FileWriter write = new FileWriter("src/test/resources/CsvFile.csv"); 	// To Write Data Into Any File
		CSVWriter csvWriter = new CSVWriter(write); 	// To write Data Into CSV File

		String cell[] = new String[3];

		cell[0] = "Soumya";
		cell[1] = "Ananda";
		cell[2] = "Aditya";

		csvWriter.writeNext(cell);
		csvWriter.flush();
		csvWriter.close();
		System.out.println("Data Added");
	}
}
