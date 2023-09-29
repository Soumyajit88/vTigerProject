package com.CRM.vTiger1.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class LogInToVTigerByWritingAndAccessingDatasFromCSVFile {

	public static void main(String[] args) throws Exception {
		File src = new File("./src/test/resources/CsvFile.csv");
		FileWriter writer=new FileWriter(src);
		CSVWriter cw=new CSVWriter(writer);
		String cell[]=new String[3];
		cell[0]="http://localhost:8888/";
		cell[1]="admin";
		cell[2]="password";
		cw.writeNext(cell);
		cw.flush();
		cw.close();
		FileReader reader=new FileReader(src);
		CSVReader cr=new CSVReader(reader);
		String url=cell[0];
		String userName=cell[1];
		String password=cell[2];
		cr.close();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(userName);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
	}

}
