package com.business.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.baseEngine.DriverEngine;
import com.pom.LoginPom;

public class Login extends DriverEngine{
	  WebDriver driver;
	
	@Test
	public void login()
	{
		driver = DriverEngine.getDriver();
		System.out.println(driver);
		driver.get("http://10.0.3.3/HRMSLogin.aspx");
		PageFactory.initElements(driver, LoginPom.class).login();
		
	}

}
