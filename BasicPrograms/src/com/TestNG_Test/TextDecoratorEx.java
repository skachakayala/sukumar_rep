package com.TestNG_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TextDecoratorEx {
	
	WebDriver driver;
	@org.testng.annotations.Test
	public void textDacorator() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.codeproject.com/Questions/1158669/WAP-to-find-and-print-second-largest-digit-in-the");
		/*String name1=driver.findElement(By.xpath("//a[@title=' Automated Testing']")).getCssValue("color");
		System.out.println("decorator is "+name1);
		String name2=driver.findElement(By.xpath("//a[text()='http://www.ministryoftesting.com']")).getCssValue("color");
		System.out.println(name2);*/
		
		String s = driver.findElement(By.xpath("//h1[@id='ctl00_ctl00_MC_AMC_ItemTitle']")).getCssValue("text-decoration");
		System.out.println("text uderline "+s);
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//h1[@id='ctl00_ctl00_MC_AMC_ItemTitle']"))).build().perform();
		
		//Thread.sleep(1500);
		
		String s1 = driver.findElement(By.xpath("//h1[@id='ctl00_ctl00_MC_AMC_ItemTitle']")).getCssValue("text-decoration");
		System.out.println("after moving mouse over on it "+s1);
		
	/*	driver.get("http://sqa.fyicenter.com/FAQ/Selenium-WebDriver/Selenium_WebDriver_How_to_check_whether_a_tex.html");
		String s1 = driver.findElement(By.xpath("//a[text()=' On-Line Testing Tools']")).getCssValue("text-decoration");
		System.out.println(s1);*/
		
		
		
	}

}
