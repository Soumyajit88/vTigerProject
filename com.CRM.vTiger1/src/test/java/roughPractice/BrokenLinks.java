package roughPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.CRM.vTiger1.genericUtility.IpathConstant;

public class BrokenLinks {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IpathConstant.implicitWaitDuration));
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e) {
			
		}
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		ArrayList<String> brokenLinks=new ArrayList<String>();
		for(int i=0;i<=allLinks.size()-1;i++) {
			try {
				String Links=allLinks.get(i).getAttribute("href");
				URL u=new URL(Links);
				URLConnection openconn = u.openConnection();
				HttpURLConnection hconn=(HttpURLConnection) openconn;
				int stsuscode = hconn.getResponseCode();
				if(stsuscode>=400) {
					brokenLinks.add(Links+" "+stsuscode);
				}
			}
			catch(Exception e) {
				continue;
			}
			System.out.println(brokenLinks);
		}
		driver.quit();
	}
}
