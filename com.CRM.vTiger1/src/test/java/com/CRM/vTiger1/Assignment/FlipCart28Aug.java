package com.CRM.vTiger1.Assignment;

import java.io.FileWriter;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.CRM.vTiger1.genericUtility.IpathConstant;
import com.opencsv.CSVWriter;

public class FlipCart28Aug {

	public static void main(String[] args) throws Throwable {
		
		FileWriter fw=new FileWriter(IpathConstant.csvFilePath);
		CSVWriter writer=new CSVWriter(fw);
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IpathConstant.implicitWaitDuration));
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e) {
			
		}
		Actions action=new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		action.moveToElement(electronics).perform();
		String ParentId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Gaming']")).click();
		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[position()=1]")).click();
		Set<String> allId = driver.getWindowHandles();
		allId.remove(ParentId);
		for(String windowId:allId)
		{
			driver.switchTo().window(windowId);
		}
		
		String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println(price);
		String cell[]=new String[1];
		cell[0]=price;
		writer.writeNext(cell);
		writer.flush();
		writer.close();
		driver.quit();
	}

}
