package com.CRM.vTiger1.Assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.CRM.vTiger1.genericUtility.WebDriverUtility;

public class DifferentCountryNames {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.maximize(driver);
		web.implicitWait(driver);
		driver.get("https://www.countries-ofthe-world.com/capitals-of-the-world.html");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Country Name");
		String countryName=sc.nextLine();
		String capital = driver.findElement(By.xpath("//div[@class='container']/descendant::td[.='"+countryName+"']/following::td[position()=1]")).getText();
		System.out.println("Capital of "+countryName+" is : "+capital);
		sc.close();

	}

}
