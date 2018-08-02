package com.TestNG_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GettingTextValueWithoutGetText {

	WebDriver driver;
	@Test
	public void getText()
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://sqa.fyicenter.com/FAQ/Selenium-WebDriver/Selenium_WebDriver_How_to_check_whether_a_tex.html");
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		String beforeInput= driver.findElement(By.name("q")).getAttribute("value");
		System.out.println("before entering "+beforeInput);
		driver.findElement(By.name("q")).sendKeys("input");
		String afterInput= driver.findElement(By.name("q")).getAttribute("value");
		System.out.println("after entering "+afterInput);
		Reporter.log("after entering "+afterInput);
	}
}
