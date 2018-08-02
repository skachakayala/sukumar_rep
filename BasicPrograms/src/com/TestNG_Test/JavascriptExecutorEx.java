package com.TestNG_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptExecutorEx {
	
	WebDriver driver;
	@org.testng.annotations.Test
	public void javascriptExe()
	{
		driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("txtUsername"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("document.getElementById('txtUsername').value='Admin'");
		ex.executeScript("document.getElementById('txtPassword').value='admin'");
		ex.executeScript("document.getElementById('btnLogin').click()");
		//ex.executeScript("arg[0].value="Admin",ele);
	}

}
