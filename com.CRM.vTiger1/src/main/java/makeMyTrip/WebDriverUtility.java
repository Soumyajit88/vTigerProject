package makeMyTrip;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IpathConstant.implicitwaitDuration));
	}
	
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
}
