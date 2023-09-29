package com.CRM.vTiger1.Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipcartCompare {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e) {
			driver.findElement(By.xpath("//span[.='✕']")).click();
		}
		Actions action=new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		action.moveToElement(electronics).perform();
		String ParentId = driver.getWindowHandle();
		WebElement gaming=driver.findElement(By.xpath("//a[text()='Gaming']"));
		action.moveToElement(gaming).perform();
		try {
			driver.findElement(By.xpath("//a[.='Gaming']/ancestor::div[@class='_3_Fivj']/descendant::span/following::a[.='Gamepads']")).click();
		}
		catch(Exception e){
			driver.findElement(By.linkText("Gamepads")).click();
		}
		driver.findElement(By.xpath("//div[.='Price -- High to Low']")).click();
		
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[.='Price -- High to Low']")));
		Thread.sleep(5000);
		WebElement product = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[position()=1]"));
		String firstProductTitle = product.getText();
		System.out.println(firstProductTitle);
		product.click();
		Set<String> allId = driver.getWindowHandles();
		allId.remove(ParentId);
		for(String windowId:allId)
		{
			driver.switchTo().window(windowId);
		}
		
		driver.findElement(By.xpath("//label[.='Compare']")).click();
		driver.findElement(By.xpath("//span[.='COMPARE']/parent::a")).click();
		String finalProductTitle = driver.findElement(By.xpath("//a[@class='_3L_M2k']/parent::div[@class='col col-6-12 _1Z-FPJ']")).getText();
		System.out.println(finalProductTitle);
		
		if(finalProductTitle.equals(firstProductTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
	}

}
