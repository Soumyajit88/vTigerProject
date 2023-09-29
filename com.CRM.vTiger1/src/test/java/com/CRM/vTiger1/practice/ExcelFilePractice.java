package com.CRM.vTiger1.practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.CRM.vTiger1.genericUtility.JavaUtility;

public class ExcelFilePractice {

	public static void main(String[] args) throws Exception{
		File src=new File("./src/test/resources/Excel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		Workbook workbook=WorkbookFactory.create(fis);
		//String browser = workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue()
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String browser=cell.getStringCellValue();
		//workbook.close();
		System.out.println(browser);
		
		JavaUtility ju=new JavaUtility();
		System.out.println(ju.sysDateTime());
		System.out.println(ju.modifiedDateTime());
		
		
	}

}
