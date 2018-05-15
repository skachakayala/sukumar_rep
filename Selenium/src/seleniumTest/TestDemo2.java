package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TestDemo2 extends TestDemo{
	WebDriver driver;
	@Test
	public void extentReportHomePage() {
		driver = TestDemo.getDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement ele = driver.findElement(By.className("cta-button button button-three"));
		if(driver.findElements(By.className("cta-button button button-three")).size()!=0)
		{
			System.out.println("elemnt exist");
			//logger.log(LogStatus.PASS, "elemnt exist");
		}
		else
		{
			//logger.log(LogStatus.FAIL, "elemnt not exist");
			System.out.println("elemnt not exist");
		}

	}
	
}
