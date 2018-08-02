package PomScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseEngine.DriverEngine;

public class Epds_Pom extends DriverEngine{
	
	WebDriver driver = DriverEngine.getDriver();
	@FindBy(xpath="//a[@id='arid']")
	WebElement link_eposPortalLink;
	
	@FindBy(xpath="//a[text()='FP Shop Sale Transactions']")
	WebElement link_fpshopSaleTransactionLink;
	
	@FindBy(xpath="//a[text()='Date wise ePoS Sales Summary']")
	WebElement link_datewiseePoSSalesSummary;
	
	@FindBy(id="district")
	WebElement select_district;
	
	@FindBy(id="office")
	WebElement select_office;
	
	@FindBy(id="shop_no")
	WebElement select_shopNumber;
	
	
	@FindBy(id="btngetDetails")
	WebElement getDetailsButton;
	
	
	@FindBy(id="home_btn")
	WebElement homeButton;
	
	@FindBy(xpath="//table[@id='tbl_receipts']")
	WebElement tablesInDateWiseEposSummary;
	
	
	
	
	
	public void eposeHomePage()
	{
		List<WebElement> allHomePageLinks = driver.findElements(By.xpath("//a[@id='arid']"));
		for(WebElement ele:allHomePageLinks)
		{
			if(ele.getText().contains("Electronic Point Of Sales"))
			{
				ele.click();
			}
		}
	}
	public void fpshopSaleTransactions() throws InterruptedException
	{
		link_fpshopSaleTransactionLink.click();
		selectReusable(select_district,"Nirmal");
		selectReusable(select_office,"Kubeer");
		selectReusable(select_shopNumber,"3506019");
		getDetailsButton.click();
		homeButton.click();
		Thread.sleep(2000);
		
	}
	
	public void datewiseePoSSalesSummary(String fromDate) throws InterruptedException
	{
		link_datewiseePoSSalesSummary.click();
		selectReusable(select_district,"Nirmal");
		selectReusable(select_office,"Kubeer");
		selectReusable(select_shopNumber,"3506019");
		List<WebElement> dates = driver.findElements(By.xpath("//input[@class='angular-datepicker-input ng-valid ng-dirty']"));
		dates.get(0).clear();
		dates.get(0).sendKeys("01/06/2018");
		dates.get(1).clear();
		dates.get(1).sendKeys("14/06/2018");
		//dates.get(0).sendKeys(Keys.TAB);
		//dates.get(1).sendKeys("");
	
		getDetailsButton.click();
		Thread.sleep(2000);
		List<WebElement> tables = driver.findElements(By.xpath("//table[@id='tbl_receipts']"));
		for(int i=9;i<tables.size()-1;i++){
			Thread.sleep(2000);
			System.out.println(tables.get(i).getText());
		}
			
		
	}
	
	public void selectReusable(WebElement selectElement,String selectValue)
	{
		Select select = new Select(selectElement);
		select.selectByVisibleText(selectValue);
	}
	

}
