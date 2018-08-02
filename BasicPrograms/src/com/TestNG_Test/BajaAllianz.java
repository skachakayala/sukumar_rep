package com.TestNG_Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BajaAllianz {
	WebDriver driver;
	
	public int captaSum(String input)
	{
		//String input= "What is 10 + 10? Answer this simple question!";
		String split[]=input.split(" ");
		int index=0;
		for(int i=0;i<split.length;i++){
			System.out.println(i+" "+split[i]);
			if(split[i].equalsIgnoreCase("+"))
			{
				index=i;
			}
		}
		System.out.println("+ index is "+index);
		int sum=0;
		if(index!=0){
		sum=Integer.parseInt(split[index-1])+Integer.parseInt(split[index+1].replace("?", ""));
		System.out.println("sum of digits "+sum);
		}
		else
		{
			System.out.println("+ symbol not avaialable");
		}
		
		return sum;
	}
	@Test(enabled=false)
	public void plocyRenew()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bajajallianz.com/Corp/motor-insurance/two-wheeler-insurance.jsp?");
		String parentWindow = driver.getWindowHandle();
		System.out.println("paernt window "+parentWindow);
		driver.findElement(By.id("2wheeler-buy-renew-ol")).click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String window : allwindow)
		{
			if(!window.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(window);
				System.out.println("child window:"+window);
			}
		}
		driver.findElement(By.xpath("//a[@href='#renewbajaj']")).click();
		driver.findElement(By.id("rnwregstno1")).sendKeys("TS");
		driver.findElement(By.id("rnwregstno2")).sendKeys("07");
		driver.findElement(By.id("rnwregstno3")).sendKeys("EN");
		driver.findElement(By.id("rnwregstno4")).sendKeys("0229");
		
		driver.findElement(By.id("prevPolicyNo")).sendKeys("OG-19-9906-1802-00042252");
		driver.findElement(By.xpath("//button[text()='PROCEED TO RENEW']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()='PROCEED TO RENEW']")).click();
		String getString = driver.findElement(By.xpath("//div[@id='math']")).getText();
		
		System.out.println("output is "+getString);
		int sum=captaSum(getString);
		
		driver.findElement(By.id("BotBootInput")).sendKeys(sum+"");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(parentWindow);
		
		
	}
	
	@Test(enabled=true)
	public void getCssColorFont()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://10.0.3.3/HRMSLogin.aspx");
		WebElement userName = driver.findElement(By.id("txtEmployeeId"));
		WebElement loginHeader = driver.findElement(By.xpath("//td[@align='center']"));
		System.out.println("username field color"+userName.getCssValue("color"));
		System.out.println("login label  color"+loginHeader.getCssValue("color"));
		
	}

}
