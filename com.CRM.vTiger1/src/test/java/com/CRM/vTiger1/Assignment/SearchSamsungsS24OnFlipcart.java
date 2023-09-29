package com.CRM.vTiger1.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSamsungsS24OnFlipcart {

	static String expectedValue = "samsung s24";
	static String inputvalue = "samsung s24";

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {

		}
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.click();
		search.sendKeys(inputvalue);
		WebElement samsungS24 = driver.findElement(By.xpath("//input[@value='samsung s24']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(samsungS24));
		while (true) {
			try {
				String actualValue = search.getAttribute("value");
				if (actualValue.equals(expectedValue)) {
					search.sendKeys(Keys.ENTER);
					System.out.println("Test Case Executed Sucessfully");
					break;
				} else {
					search.sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(2000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// driver.quit();
	}
}
