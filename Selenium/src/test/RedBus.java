package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.*;
import org.testng.annotations.Test;

public class RedBus {

	@Test
	public void main1(){
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//table//tbody//tr[6]//td[@class='we day'][1]")).click();

	}

}
