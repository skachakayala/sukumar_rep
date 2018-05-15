package com.NorthDakota_Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RedBusEx {
	@Test
	public void testEx() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("hyderabad");
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("kadapa");
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//table//tbody//tr[7]//td[@class='wd day'][1]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
