package com.TestNG_Test;




import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Test {
	WebDriver driver;
	
	
	@org.testng.annotations.Test(enabled=false)
	public void test3()
	{
		driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		act.keyDown(Keys.CONTROL);
		WebElement linkele = driver.findElement(By.xpath("//a[text()='CRM']"));
		act.click(linkele).build().perform();
		act.keyUp(Keys.CONTROL);
		act.click(linkele).build().perform();
		
		
	}
	@org.testng.annotations.Test(invocationCount=2)
	public void assertEx()
	{
		System.out.println("repeated no of times");
		//Assert.assertTrue(1==0);
		System.out.println(1%6);
	}


}
