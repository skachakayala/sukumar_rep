package com.TestNG_Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverIntialtion {
@org.testng.annotations.Test
public void ddriverInit()
{
	RemoteWebDriver driver =new FirefoxDriver();
	driver.get("https://www.freecrm.com/index.html");driver.close();
}

}
