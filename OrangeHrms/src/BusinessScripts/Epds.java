package BusinessScripts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BaseEngine.DriverEngine;
import PomScripts.Epds_Pom;

public class Epds extends DriverEngine{

	WebDriver driver;
	Epds_Pom epds_pom;
	String parentWindow;
	@org.testng.annotations.Test(priority=1)
	public void eposHome() throws InterruptedException
	{
		driver = DriverEngine.getDriver();
		driver.get("https://epds.telangana.gov.in/FoodSecurityAct/");
		epds_pom = PageFactory.initElements(driver, Epds_Pom.class);
		parentWindow = driver.getWindowHandle();
		epds_pom.eposeHomePage();
		Set<String> allWindows = driver.getWindowHandles();
		for(String windowName:allWindows)
		{
			if(!windowName.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(windowName);
				epds_pom.fpshopSaleTransactions();
				/*epds_pom.datewiseePoSSalesSummary("01/06/2018");
				driver.switchTo().window(parentWindow);*/
				
			}
		}
		
		
		
		
	}
	@org.testng.annotations.Test(enabled=false)
	public void dateWiseeposSaleSummary() throws InterruptedException
	{
		epds_pom.datewiseePoSSalesSummary("01/06/2018");
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getWindowHandle());
	}
	
	

}
