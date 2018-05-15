package Pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;

import BaseEngine.DriverEngine;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText="Home")
	WebElement homeLink;
	
	@FindBy(xpath="//a[@title='Calendar']")
	WebElement calenderLink;
	
	@FindBy(xpath="//a[@title='Companies']")
	WebElement companyLink;
	
	public void homePage()
	{
		driver = DriverEngine.getDriver();
		//homeLink.click();
		//calenderLink.click();
		Actions action = new Actions(driver);
		action.moveToElement(companyLink).build().perform();
		//companyLink.click();
	}

}
