package com.CRM.vTiger1.Assignment;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import com.CRM.vTiger1.genericUtility.WebDriverUtility;
import com.google.common.io.Files;

public class SpiceJetFlightBooking {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new EdgeDriver();
		WebDriverUtility web = new WebDriverUtility();
		web.maximize(driver);
		;
		web.implicitWait(driver);
		driver.get("https://www.spicejet.com/");

		WebElement flightBookingpage = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']"));
		File temp1 = flightBookingpage.getScreenshotAs(OutputType.FILE);
		File perm1 = new File("./Screenshots/SpiceJetBeforeBooking.png");
		Files.copy(temp1, perm1);

		WebElement ckeckBoxRoundTrip = driver.findElement(By.xpath(
				"//div[.='round trip']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73']/child::div[@class='css-1dbjc4n r-zso239']"));
		ckeckBoxRoundTrip.click();

		WebElement frombutton = driver.findElement(By.xpath(
				"//div[@data-testid='to-testID-origin']/descendant::input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"));
		frombutton.click();

		WebElement regionIndia = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-ge9izo']/descendant::div[@class='css-1dbjc4n r-1ewfge1 r-ms8t9i r-1phboty r-1loqt21 r-6gpygo r-lqms97 r-1qhn6m8 r-1otgn73']/child::div[.='India']"));
		regionIndia.click();

		WebElement citiesFrom = driver.findElement(By.xpath("//div[.='Bengaluru']/child::div"));
		citiesFrom.click();

		WebElement citiesTo = driver.findElement(By.xpath("//div[.='Goa, North Goa']/child::div"));
		citiesTo.click();

		WebElement travelStratDate = driver.findElement(By.xpath(
				"//div[@data-testid='undefined-month-September-2023']/descendant::div[.='30']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']"));
		travelStratDate.click();

		// WebElement
		// clickArrowButton=driver.findElement(By.xpath("//div[@class='r-1loqt21 r-u8s1d
		// r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c
		// css-1dbjc4n']"));

		WebElement returnDate = driver.findElement(By.xpath(
				"//div[@data-testid='undefined-month-December-2023']/descendant::div[.='30']/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']"));
		returnDate.click();

		WebElement passengerDropdown = driver.findElement(By.xpath("//div[.='Passengers']"));
		passengerDropdown.click();

		WebElement adultPlus = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		for (int i = 1; i <= 3; i++) {
			adultPlus.click();
		}

		WebElement childrenPlus = driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		for (int j = 1; j <= 2; j++) {
			childrenPlus.click();
		}

		WebElement infantPlus = driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']"));
		for (int k = 1; k <= 2; k++) {
			infantPlus.click();
		}

		WebElement addPassenerDone = driver
				.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']"));
		addPassenerDone.click();

		WebElement passengerCatageories = driver.findElement(By.xpath(
				"//div[.='Family & Friends']/parent::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73']/child::div[@style='margin-right: 6px;']"));
		passengerCatageories.click();

		File temp2 = flightBookingpage.getScreenshotAs(OutputType.FILE);
		File perm2 = new File("./Screenshots/SpiceJetAfterBooking.png");
		Files.copy(temp2, perm2);

		WebElement searchFlightButton = driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']"));
		searchFlightButton.click();

		System.out.println("Test Case Executed Sucessfully");

		// driver.quit();
	}

}
