package PomScripts;

import java.util.List;

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
	
	@FindBy(id="spanMessage")
	WebElement loginErrorMessage;
	
	@FindBy(xpath="//a[text()='Welcome Admin']")
	WebElement loginVerification;
	
	
	
	public void login(String strUserName,String strPassword)
	{
		driver = DriverEngine.getDriver();
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		System.out.println("Username entered is "+driver.findElement(By.id("txtUsername")).getAttribute("value"));
		System.out.println("Password entered is "+driver.findElement(By.id("txtPassword")).getAttribute("value"));
		loginButton.click();
		//System.out.println(driver.getTitle());
		List<WebElement> ele = driver.findElements(By.xpath("//a[text()='Welcome Admin']")); 
		if(ele.size()>0)
		{
			//System.out.println(loginVerification.getText());
			//Assert.assertEquals("Invalid credentials",loginErrorMessage.getText());
			//Assert.assertEquals("Welcome admin",loginVerification.getText());
			System.out.println("Login successfull"+loginVerification.getText());
			
		}
		else
		{
			System.out.println("Login failed "+loginErrorMessage.getText());
		}
		
	}
	
	public void loginVerification()
	{
		
		/*boolean b = loginVerification.isDisplayed();
		Assert.assertTrue(b);
		*/
		if(driver.findElements(By.xpath("//a[text()='Welcome Admin']")).size()!=0)
		{
			System.out.println("login successfull");
			//Assert.asassertTrue("", "");
		}
		else
		{
			System.out.println("login unsuccessfull");
		}
		
	}

}
