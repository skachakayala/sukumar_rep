package com.NorthDakota;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomePage {
	@Test()
	public void home()
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mmis.nd.gov/portals/wps/portal/EnterpriseHome");
		driver.findElement(By.xpath("//a[contains(text(),'Provider Enrollment')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Individual Provider Enrollment')]")).click();
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:indivInsturctionForm:cbcntinueid")).click();
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:PRVENRF8:accept")).click();
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:lastName")).sendKeys("robert");
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:firstName")).sendKeys("robert");
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:dob")).sendKeys("10/01/1985");
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:gender:0")).click();
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:ssn1")).sendKeys("198556235");
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:IndivIdentifierSave")).click();
		driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:cbcntinueid")).click();
		//driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:individual:firstName")).sendKeys("robert");
		WebElement ele = driver.findElement(By.id("viewns_7_EMCVDGL10023E023O5G57118C2_:licensePage:license:providerType"));
		Select select = new Select(ele);
		select.selectByIndex(1);
		
		
		
		
	}

}
