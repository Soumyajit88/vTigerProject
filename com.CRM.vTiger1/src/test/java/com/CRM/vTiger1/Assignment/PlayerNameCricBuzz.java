package com.CRM.vTiger1.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.CRM.vTiger1.genericUtility.WebDriverUtility;

public class PlayerNameCricBuzz {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		WebDriverUtility wu=new WebDriverUtility();
		wu.maximize(driver);
		wu.implicitWait(driver);
		driver.get("https://www.cricbuzz.com/");
		String playerName = driver.findElement(By.xpath("//a[.=' Fakhar Zaman ']")).getText();
		WebElement run = driver.findElement(By.xpath("//a[.=' Fakhar Zaman ']/ancestor::div[@class='cb-col cb-col-100 cb-scrd-itms']/descendant::div[@class='cb-col cb-col-8 text-right text-bold']"));
		System.out.println(playerName);
		
		//driver.quit();
	}

}
