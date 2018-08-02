package com.business.Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.baseEngine.DriverEngine;
import com.pom.LoginPom;

public class Login extends DriverEngine{
	  WebDriver driver;
	  LoginPom login;
	
	@Test
	public void login()
	{
		driver = DriverEngine.getDriver();
		driver.get("http://10.0.3.3/HRMSLogin.aspx");
		login = PageFactory.initElements(driver, LoginPom.class);
		login.login();
		
	}
	@Test
	public void swipeReport()
	{
			login.swipeReport();
			WebElement table = driver.findElement(By.id("ctl00_HRMSDefault_gvSwipe"));
			//System.out.println(tableList.size());
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			System.out.println("no of cells "+rows.size());
			List<WebElement> column = table.findElements(By.tagName("td"));
			System.out.println("no of cells "+column.size());
			
			/*for(int row=0;row<rows.size();row++)
			{
				
					System.out.println(rows.get(row).getText()+" ");
			}*/
				//System.out.println();
			for(int col=1;col<column.size();col++)
			{
				System.out.print(column.get(col).getText()+" ");
				if(col%6==0){
					System.out.println();}
				
			}
			
			
			
	}
	

}
