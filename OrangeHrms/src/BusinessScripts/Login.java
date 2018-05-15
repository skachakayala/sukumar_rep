package BusinessScripts;

import java.io.IOException;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import suporters.ObjectReusable;

import BaseEngine.DriverEngine;
import PomScripts.LoginPom;
import PropertiesReusableScripts.ConfigProperties;

public class Login extends DriverEngine{
	
	WebDriver driver;
	@Test
	public void login() throws IOException
	{
		driver = DriverEngine.getDriver();
		/*String url = 
		System.out.println(url);*/
		driver.get(ObjectReusable.getConfigProperties(ObjectReusable.getConfigFilePath()).getProperyValue("URL"));
		LoginPom pf = PageFactory.initElements(driver, LoginPom.class);
		pf.login("Admin", "admi");
		pf.loginVerification();
	}
	

}
