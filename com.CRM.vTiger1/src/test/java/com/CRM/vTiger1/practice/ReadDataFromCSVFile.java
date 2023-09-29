package com.CRM.vTiger1.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.opencsv.CSVReader;

public class ReadDataFromCSVFile {

	public static void main(String[] args) throws Exception {
		try {
			File src = new File("./src/test/resources/CsvFile.csv");

			FileReader fr = new FileReader(src); // To Read data from any file.

			CSVReader cr = new CSVReader(fr); // To Read data from csv file ,we have to create object of CSVReader class
												// and FileReader reference in constructor.

			String cell[];
			while ((cell = cr.readNext()) != null) {
				String userName = cell[0];
				String password = cell[1];
				System.out.println("userName :" + userName + " And " + "password :" + password);
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("http://localhost:8888/");
				driver.findElement(By.name("user_name")).sendKeys(userName);
				driver.findElement(By.name("user_password")).sendKeys(password);
				driver.findElement(By.id("submitButton")).click();
			}
			cr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
