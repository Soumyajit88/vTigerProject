package com.CRM.vTiger1.practice;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IllegalStateException {
	public static void main(String[] args) throws Exception {
		File src=new File("./src/test/resources/numericValue.xlsx");
		FileInputStream fis=new FileInputStream(src);
		Workbook workbook=WorkbookFactory.create(fis);
		
				//1st Approach//
		String value1 =workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();	//Here we are adding one quote " ' " before the numeric value.
		
				//2nd Approach//
		String value2=workbook.getSheet("Sheet2").getRow(0).getCell(0).toString();	//Here we are converting the value to a string value.
		
				//3rd Approach//
		DataFormatter formatter=new DataFormatter();
		String value3 = formatter.formatCellValue(workbook.getSheet("Sheet3").getRow(0).getCell(0));
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
	
}
