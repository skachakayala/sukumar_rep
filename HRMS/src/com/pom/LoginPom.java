package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import ReusableFunctions.SelectDropdownClicking;

import com.baseEngine.DriverEngine;

public class LoginPom {
	
	WebDriver driver;
	@FindBy(id="txtEmployeeId")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement Password;

	
	@FindBy(id="btnSubmit")
	WebElement login;
	
	@FindBy(id="ctl00_HRMSDefault_lblEmpID")
	WebElement loginVerification;
	
	@FindBy(id="link9")
	WebElement reportsLik;
	
	@FindBy(id="menuItem22")
	WebElement swipeLink;
	
	@FindBy(id="menuItemHilite17")
	WebElement reportLink;
	
	
	@FindBy(id="ctl00_HRMSDefault_ddlPeriod")
	WebElement selectPeriodDropdown;
	
	@FindBy(id="ctl00_HRMSDefault_btnShow")
	WebElement showButton;
	
	
	
	public void swipeReport()
	{
		driver = DriverEngine.getDriver();
		Actions action = new Actions(driver);
		action.moveToElement(reportsLik).build().perform();
		action.moveToElement(swipeLink).build().perform();
		action.moveToElement(reportLink).build().perform();
		if(reportLink.isDisplayed()){
		reportLink.click();
		SelectDropdownClicking.selectDropdown(selectPeriodDropdown, "Pay Period");
		}
		showButton.click();
	}
	public void login()
	{
		userName.sendKeys("HDC7352");
		Password.sendKeys("ammananna");
		login.click();
		
	}
	public void loginVerification()
	{
		driver = DriverEngine.getDriver();
		if(driver.findElements(By.id("loginVerification")).size()!=0)
		{
			if(driver.findElement(By.id("loginVerification")).getText().equalsIgnoreCase("HDC7352"))
			{
				
			}
		}
	}


}
