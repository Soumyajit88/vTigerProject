package com.CRM.vTiger1.Assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchSamsungs24OnFlipcartUsingPathsNotKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		} catch (Exception e) {

		}
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("samsung s24");
		Thread.sleep(5000);
		List<WebElement> searchDropdown = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));

		// For Printing All dropdown Texts without spaces
		for (WebElement element : searchDropdown) {

			String text = element.getText().replaceAll("\\s", "");
			System.out.println(text);
		}

		for (WebElement element : searchDropdown) {

			if (element.getText().replaceAll("\\s", "").equals("samsungs24inMobiles")) {
				element.click();
				System.out.println("Test case passed");
				break;
			}
		}

	}

}
