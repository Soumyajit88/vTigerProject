package com.CRM.vTiger1.practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadFile {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/user/Desktop/Advance%20Selenium/file.html");
		WebElement choose = driver.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", choose);
		File f=new File("./src/test/resources/File Upload.txt");
		String path = f.getAbsolutePath();
		choose.sendKeys(path);
	}

}
