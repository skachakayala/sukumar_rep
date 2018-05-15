package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseEngine.DriverEngine;

public class LoginPom {
	
	WebDriver driver;
	@FindBy(id="txtEmployeeId")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement Password;

	
	@FindBy(id="btnSubmit")
	WebElement login;
	
	@FindBy(id="ctl00_HRMSDefault_lblEmpID")
	WebElement loginVerification;
	
	public void login()
	{
		userName.sendKeys("HDC7352");
		Password.sendKeys("ammananna");
		login.click();
		
	}
	public void loginVerification()
	{
		driver = DriverEngine.getDriver();
		if(driver.findElements(By.id("loginVerification")).size()!=0)
		{
			if(driver.findElement(By.id("loginVerification")).getText().equalsIgnoreCase("HDC7352"))
			{
				
			}
		}
	}


}
