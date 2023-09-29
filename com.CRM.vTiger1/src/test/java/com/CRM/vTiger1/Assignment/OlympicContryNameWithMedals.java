package com.CRM.vTiger1.Assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OlympicContryNameWithMedals {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		
		
		
		//FOR HEADER//
	//	List<WebElement> header = driver.findElements(By.xpath("//div[@data-cy='header-cell']"));
	//	for (WebElement head : header) {
	//		System.out.print(head.getText()+"    ");
	//	}

		/*
		 * // TO CAPTURE ALL COUNTRIES WITH THEIR MEDALS // List<WebElement>
		 * countryNames = driver.findElements(By.
		 * xpath("//span[@class='styles__CountryName-sc-fehzzg-6 jYXabZ']"));//Country
		 * Names List<WebElement> goldMedals =
		 * driver.findElements(By.xpath("//div[@title='Gold']")); //Gold Medals
		 * List<WebElement> silverMedals =
		 * driver.findElements(By.xpath("//div[@title='Silver']")); //Siver Medals
		 * List<WebElement> bronzeMedals =
		 * driver.findElements(By.xpath("//div[@title='Bronze']")); //Bronze Medals
		 * List<WebElement> totalMedals =
		 * driver.findElements(By.xpath("//div[@title=\"\"]")); for(int i=0;i<=92;i++) {
		 * WebElement country=countryNames.get(i); WebElement gold=goldMedals.get(i);
		 * WebElement siver=silverMedals.get(i); WebElement bronze=bronzeMedals.get(i);
		 * WebElement total=totalMedals.get(i);
		 * System.out.print(country.getText()+"    "+gold.getText()+"  "+siver.getText()
		 * +"  "+bronze.getText()+"  "+total.getText()+"  "); System.out.println(""); }
		 */

		
		// TO CAPTURE LAST 5 COUNTRY DETAILS //

		List<WebElement> subCountryNames = driver.findElements(By.xpath("(//span[@class='styles__CountryName-sc-fehzzg-6 jYXabZ'])[position()>88]"));
		List<WebElement> subGoldMedals = driver.findElements(By.xpath("(//div[@title='Gold'])[position()>88]"));
		List<WebElement> subSilverMedals = driver.findElements(By.xpath("(//div[@title='Silver'])[position()>88]"));
		List<WebElement> subBronzeMedals = driver.findElements(By.xpath("(//div[@title='Bronze'])[position()>88]"));
		List<WebElement> subTotalMedals = driver.findElements(By.xpath("(//div[@title=\"\"])[position() >88]"));
		for (int i = 0; i <= subCountryNames.size() - 1; i++) {
			WebElement subCountry = subCountryNames.get(i);
			WebElement subGold = subGoldMedals.get(i);
			WebElement subSiver = subSilverMedals.get(i);
			WebElement subBronze = subBronzeMedals.get(i);
			WebElement subTotal = subTotalMedals.get(i);
			System.out.print(subCountry.getText()+"  "+subGold.getText()+"  "+subSiver.getText()+"  "+subBronze.getText()+"  "+subTotal.getText());
			System.out.println("");
		}

						
	}

}
