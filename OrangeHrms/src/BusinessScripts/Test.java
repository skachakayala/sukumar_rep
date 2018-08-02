package BusinessScripts;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import BaseEngine.DriverEngine;

public class Test extends DriverEngine{
	
	@org.testng.annotations.Test
	public void login(){
	WebDriver driver = DriverEngine.getDriver();
	driver.manage().window().maximize();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	List<WebElement> beforeLoginmessage = driver.findElements(By.id("spanMessage"));
	List<WebElement> afterLoginmessage = driver.findElements(By.xpath("//a[text()='Welcome Admin']"));
	
	if( driver.findElement(By.id("spanMessage")).isDisplayed()/*beforeLoginmessage.size()>0*/){
	
	Assert.assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	System.out.println("login failed "+driver.findElement(By.id("spanMessage")).getText());
	}
	else
	{
		Assert.assertEquals("Welcome Admin",driver.findElements(By.id("spanMessage")).get(0).getText());
		System.out.println("login suceesfull");
	}
	}

}
