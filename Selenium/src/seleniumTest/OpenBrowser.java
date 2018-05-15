package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	
	public static void main(String[] args) throws InterruptedException  {
	
		Hrms hrms=new Hrms();
		hrms.login();
	
		//hrms.hoursOfEmployee();
		//hrms.leavebalanceSummary();
		//hrms.homPage();
		//Thread.sleep(5000);
		//hrms.closeBrowser();
		//hrms.bookingConferenceRoom();
		WebDriver driver = TestDemo.getDriver();
		driver.get("http://10.0.3.3/HRMSLogin.aspx");
		
		
	}

}
