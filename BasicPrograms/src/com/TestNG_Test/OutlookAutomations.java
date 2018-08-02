package com.TestNG_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OutlookAutomations {
	WebDriver driver;
	@org.testng.annotations.Test
	public void login() throws InterruptedException
	{	
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1530680205&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3db88aa1a6-8160-cfaf-fee3-c4e78e316e73&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		driver.findElement(By.id("i0116")).sendKeys("sukumar.kachakayala@outlook.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("i0118")).sendKeys("Sukku@123");
		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.id("idSIButton9"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
		signIn.click();
		
		//driver.findElement(By.className("ms-Button ms-Button--action ms-Button--command _2sLGgsXQzNsTmOBmKdefiY root-50")).click();
		WebElement newMessageButton= driver.findElement(By.xpath("//button[@name='New message']"));
		wait.until(ExpectedConditions.elementToBeClickable(newMessageButton));
		newMessageButton.click();
		Thread.sleep(5000);
		//WebElement toText= driver.findElement(By.xpath("//input[@class='vA7jkZHmqacvRUMCWPiB4']"));
		//wait.until(ExpectedConditions.visibilityOf(toText));
		//toText.sendKeys("v.a.reddy08@outlook.com");
		WebElement subject  = driver.findElement(By.xpath("//input[@class='ms-TextField-field field_78d1c460']"));
		//wait.until(ExpectedConditions.visibilityOf(subject));
		subject.sendKeys("test mail");
		WebElement sendButton = driver.findElement(By.xpath("//button[@class='ms-Button ms-Button--primary PC04xg0tfzdQOKgdza5aA root-123']"));
		//wait.until(ExpectedConditions.elementToBeClickable(sendButton));
		sendButton.click();
		System.out.println(driver.getWindowHandles().size());
		
		
		
	}

}
