package com.CRM.vTiger1.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
	public static void main(String[] args) throws Exception{
		File src=new File("./src/test/resources/Excel.xlsx");
		FileInputStream fis=new FileInputStream(src);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet = workbook.createSheet("TestData");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Hello");
		FileOutputStream fos=new FileOutputStream(src);
		workbook.write(fos);
		
	}
}
