package makeMyTrip;

import java.util.Date;

import org.openqa.selenium.WebElement;

public class JavaUtillity {
	
	public String systemDateAndTime() {
		
		Date dt=new Date();
		String date = dt.toString();
		return date;
	}
	
	public void modifiedDateANdTime() {
		
		Date dt=new Date();
		String[] date=dt.toString().split(" ");
	}
	
	public String modifiedPath(WebElement element) {
		String dt=element.getAttribute("aria-label");
		String[] date=dt.toString().split(" ");
		String day=date[0];
		String month=date[1];
		String dateee=date[2];
		String year=date[3];
		
		String path=year+" "+date+" " +month+" "+dateee;
		return path;
	}
}
