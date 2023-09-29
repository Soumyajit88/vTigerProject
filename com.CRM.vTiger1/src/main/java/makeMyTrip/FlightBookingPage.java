package makeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CRM.vTiger1.genericUtility.IpathConstant;

public class FlightBookingPage {
	WebDriverUtility web = new WebDriverUtility();

	@FindBy(xpath = "//i[@class='wewidgeticon we_close']")
	private WebElement firstPopup;

	@FindBy(id = "fromCity")
	private WebElement cityFromClick;
	@FindBy(xpath = "//input[contains(@class,'react')]")
	private WebElement fromToEnterData;
	@FindBy(xpath = "//p[.='Bengaluru, India']")
	private WebElement cityFromTravel;
	@FindBy(id = "toCity")
	private WebElement cityToClick;
	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement cityToenterData;
	@FindBy(xpath = "//p[.='Bhubaneswar, India']")
	private WebElement cityToTravel;
	@FindBy(id = "departure")
	private WebElement depature;
	@FindBy(css = "div[aria-label='Fri Sep 22 2023']") private WebElement depatureDate;
	// @FindBy(xpath = "////div[.='September
	// 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='8']") private
	// WebElement depatureDate;
//	@FindBy(xpath = "//div[.='September 2023']/ancestor::div[@class='DayPicker-Months']/descendant::div[@aria-label='Fri Sep 29 2023']") private WebElement depatureDate;
	@FindBy(xpath = "//p[.='Tap to add a return date for bigger discounts']")
	private WebElement returnDT;
	@FindBy(xpath = "//div[text()='November']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='7']")
	private WebElement returnDate;
	@FindBy(xpath = "//span[@aria-label='Next Month']")
	private WebElement arrowButton;
	@FindBy(xpath = "//span[text()='Traveller']")
	private WebElement travellerButton;
	@FindBy(xpath = "//li[@data-cy='adults-4']")
	private WebElement adultNo;
	@FindBy(xpath = "//li[@data-cy='children-2']")
	private WebElement childrenNo;
	@FindBy(xpath = "//li[@data-cy='infants-1']")
	private WebElement infantNo;
	@FindBy(xpath = "//li[@data-cy='travelClass-1']")
	private WebElement travellerClass;
	@FindBy(xpath = "//button[.='APPLY']")
	private WebElement applyButton;
	@FindBy(xpath = "//p[text()='Armed Forces ']")
	private WebElement fareType;
	@FindBy(linkText = "Search")
	private WebElement searchButton;

	@FindBy(xpath = "//div[@aria-label='Sat Sep 09 2023']")
	private WebElement dateee;

	public FlightBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void performClickOnEmptyLocation(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveByOffset(10, 20);
		action.click().perform();
	}

	public void visibilty(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IpathConstant.explicitWaitDuration));
		wait.until(ExpectedConditions.visibilityOf(firstPopup));
		firstPopup.click();
	}

	public void closeFirstPopup() {
		firstPopup.click();
	}

	public void cityFrom(String cityName) {
		cityFromClick.click();
		fromToEnterData.sendKeys(cityName);
		cityFromTravel.click();
	}

	public void cityTo(String cityName) {
		cityToClick.click();
		cityToenterData.sendKeys(cityName);
		cityToTravel.click();
	}

	JavaUtillity ju = new JavaUtillity();

	public void travelAndreturnDate(WebDriver driver) {
		depature.click();
		//JavaUtillity ju = new JavaUtillity();
		//String value = ju.modifiedPath(dateee);
	//	WebElement depatureDate = driver.findElement(By.xpath(
		//		"//div[.='September 2023']/ancestor::div[@class='DayPicker-Months']/descendant::div[@aria-label='"
			//			+ value + "']"));

		
		 JavascriptExecutor js =(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()", depatureDate);
		// web.doubleClick(driver, depatureDate);
		 
		 depatureDate.click();
		while (true)
			try {
				returnDate.click();
			} catch (Exception e) {
				arrowButton.click();
			}

	}

	public void travell() {
		travellerButton.click();
		adultNo.click();
		childrenNo.click();
		infantNo.click();
		travellerClass.click();
		applyButton.click();
	}

	public void otherDetails() {
		fareType.click();
		searchButton.click();
	}

}
