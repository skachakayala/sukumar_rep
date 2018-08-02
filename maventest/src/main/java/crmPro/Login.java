package crmPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.DependencyMap;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

import BaseEngine.DriverEngine;
import Pom.HomePage;
import Pom.LoginPom;

public class Login{
	WebDriver driver;

	@Test
	public void login()
	{
		driver = DriverEngine.getDriver();
		//driver = new FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println(driver);
		driver.get("https://www.freecrm.com/index.html");
		PageFactory.initElements(driver, LoginPom.class).login("sukumar", "Freecrm@123");
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(document., arg1)
	}	
	@Test(dependsOnMethods="login")
	public void homePage() throws InterruptedException
	{
		
		//Thread.sleep(2500);
		PageFactory.initElements(driver, HomePage.class).homePage();
	}
	
}
