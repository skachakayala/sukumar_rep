package PomScripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BaseEngine.DriverEngine;

public class LoginPom {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Welcome Admin']")
	WebElement loginVerification;
	
	public void login(String strUserName,String strPassword)
	{
		
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
	}
	
	public void loginVerification()
	{
		driver = DriverEngine.getDriver();
		/*boolean b = loginVerification.isDisplayed();
		Assert.assertTrue(b);
		*/
		if(driver.findElements(By.xpath("//a[text()='Welcome Admin']")).size()!=0)
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("login unsuccessfull");
		}
	}

}