package com.CRM.vTiger1.Assignment;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		//System.setProperties(null);
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		List<WebElement> Alllinks = driver.findElements(By.xpath("//a"));
		ArrayList<String> brokenLinks=new ArrayList<String>();
		for(int i=0;i<=Alllinks.size()-1;i++)
		{
			String links=Alllinks.get(i).getAttribute("href");
			try {
				URL url=new URL(links);
				URLConnection urlconn = url.openConnection();
				HttpURLConnection httpURLConnection=(HttpURLConnection)urlconn;
				int StatusCode = httpURLConnection.getResponseCode();
				if(StatusCode>=400)
				{
					brokenLinks.add(links+" "+StatusCode);
				}
			}
			catch(Exception e){
				continue;
			}
			System.out.println(brokenLinks);
			
		}
		
		driver.quit();
	}

}

