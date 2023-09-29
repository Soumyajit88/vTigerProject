package assignmentPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EMICalculatorHooverMessage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://emicalculator.net/");
		WebElement path = driver.findElement(By.xpath("//*[@class='highcharts-point highcharts-point-select highcharts-color-1']"));
		Actions action = new Actions(driver);
		action.moveToElement(path).perform();
		WebElement text = driver.findElement(By.xpath("//*[text()='Total Interest: 53.7%']"));
		System.out.println(text.getText());
		
		}
}
