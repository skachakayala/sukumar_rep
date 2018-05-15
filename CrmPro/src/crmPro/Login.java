package crmPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseEngine.DriverEngine;
import Pom.HomePage;
import Pom.LoginPom;

public class Login{
	WebDriver driver;

	@Test
	public void login()
	{
		driver = DriverEngine.getDriver();
		System.out.println(driver);
		/*driver.get("https://www.freecrm.com/index.html");
		PageFactory.initElements(driver, LoginPom.class).login("sukumar", "Freecrm@123");
		//driver.switchTo().frame("leftpanel");
		PageFactory.initElements(driver, HomePage.class).homePage();*/
	}
	
}
