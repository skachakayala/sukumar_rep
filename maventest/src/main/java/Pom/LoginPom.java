package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPom {

	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement loginButton;
	
	
	
	
	public void login(String userName,String userPassword)
	{
		username.sendKeys(userName);
		password.sendKeys(userPassword);
		loginButton.click();
		
		//RemoteWebdriver
		
	}
	}

