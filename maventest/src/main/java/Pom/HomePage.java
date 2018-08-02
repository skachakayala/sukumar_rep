package Pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;

import BaseEngine.DriverEngine;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText="Home")
	WebElement homeLink;
	
	@FindBy(xpath="//a[@title='Calendar']")
	WebElement calenderLink;
	
	@FindBy(xpath="//a[text()='Companies']")
	WebElement companyLink;
	
	@FindBy(xpath="//a[text()='New Company']")
	WebElement newCompanyLink;
	
	
	public void homePage()
	{
		driver = DriverEngine.getDriver();
		driver.switchTo().frame("mainpanel");
		//homeLink.click();
		//calenderLink.click();
		//driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(companyLink).build().perform();
		newCompanyLink.click();
		//driver.findElement(By.xpath("companyLink")).sendKeys(Keys.c);
		
		
	}

}
