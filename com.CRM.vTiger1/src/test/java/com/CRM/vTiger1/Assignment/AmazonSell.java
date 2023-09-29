package com.CRM.vTiger1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.CRM.vTiger1.genericUtility.WebDriverUtility;

public class AmazonSell {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.maximize(driver);
		web.implicitWait(driver);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[.='Sell']")).click();
		WebElement sell = driver.findElement(By.xpath("//a[.='Start Selling' and @data-ld-append='Vid_Cross_T3']"));
		System.out.println(sell.getText());
		sell.click();
	}

}
