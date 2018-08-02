package com.TestNG_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class IEBrowserLaunch {
	
	WebDriver driver;
	@Test
	public void launchIEBrowser()
	{
		System.setProperty("webdriver.ie.driver", "F:\\Sukumar Backup\\Java\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
	}

}
