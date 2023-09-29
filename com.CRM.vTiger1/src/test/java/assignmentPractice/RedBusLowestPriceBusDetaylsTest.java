package assignmentPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusLowestPriceBusDetaylsTest {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.id("bus_tickets_vertical")).click();
		driver.findElement(By.id("src")).sendKeys("Banglore");
		driver.findElement(By.xpath("//text[.='Jambu Savari Dinne, Bangalore']")).click();
		driver.findElement(By.id("dest")).sendKeys("Hydrabad");
		driver.findElement(By.xpath("//text[.='Shilparamam, hyderabad']")).click();
		//driver.findElement(By.xpath("//text[.='Date']")).click();
		driver.findElement(By.xpath("//div[text()='Sep']/ancestor::div[@class='sc-jzJRlG dPBSOp']/descendant::span[.='27']")).click();
		driver.findElement(By.id("search_button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[.='BUS TYPES']")));
		//WebElement lastElement = driver.findElement(By.xpath("//span[.=' 2023 Redbus India Pvt Ltd. All rights reserved']"));
	//	WebElement lastElement=driver.findElement(By.xpath("(//div[@class='clearfix bus-item-details'])[last()]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//	int y = lastElement.getLocation().getY();
	//	js.executeScript("window.scrollBy(0,"+y+")", lastElement);
		
	//	WebElement busNames = driver.findElement(By.xpath("//span[.='1800']/ancestor::div[@id='result-section']/descendant::div[@class='travels lh-24 f-bold d-color']"));
		
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='f-19 f-bold']"));
		ArrayList<Integer> newpriceList=new ArrayList<Integer>();
		for(int i=0;i<=2;i++) {
			String price = allPrices.get(i).getText();
			int pri = Integer.parseInt(price);
			newpriceList.add(pri);
		}
		System.out.println("All Prices : "+newpriceList);
		Collections.sort(newpriceList);
		Integer newPrice = newpriceList.get(0);
		System.out.println("Lowest Bus Price : "+newPrice);
		String busName = driver.findElement(By.xpath("//span[.='"+newPrice+"']/ancestor::div[@class='clearfix bus-item']/descendant::div[@class='travels lh-24 f-bold d-color']")).getText();
		System.out.println(busName);
		
		
		
	}

}
