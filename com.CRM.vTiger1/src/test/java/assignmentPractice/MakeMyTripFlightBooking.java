package assignmentPractice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import makeMyTrip.FlightBookingPage;
import makeMyTrip.IpathConstant;
import makeMyTrip.WebDriverUtility;

public class MakeMyTripFlightBooking {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		WebDriverUtility web=new WebDriverUtility();
		web.maximize(driver);
		web.implicitWait(driver);
		FileInputStream file=new FileInputStream(IpathConstant.propertyFilePath);
		Properties prop=new Properties();
		prop.load(file);
		String url = prop.getProperty("url");
		String cityFrom=prop.getProperty("cityFrom");
		String cityTo=prop.getProperty("cityTo");
		driver.get(url);
		
		FlightBookingPage fbp=new FlightBookingPage(driver);
		fbp.performClickOnEmptyLocation(driver);
		fbp.performClickOnEmptyLocation(driver);
		try {
			fbp.performClickOnEmptyLocation(driver);
		}
		catch(Exception e) {
			
		}
		fbp.cityFrom(cityFrom);
		fbp.cityTo(cityTo);
		fbp.travelAndreturnDate(driver);
		fbp.otherDetails();
	}

}
