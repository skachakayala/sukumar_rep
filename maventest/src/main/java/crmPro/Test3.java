package crmPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {
	WebDriver driver;
	@Test
	public void test()
	driver = new FirefoxDriver();
	driver.get("https://www.freecrm.com/index.html");
	//WebElement linkele = driver.findElement(By.xpath("//a[text()='CRM']"));
	//act.moveToElement(linkele).build().perform();
	driver.findElement(By.xpath("//a[text()='CRM']")).sendKeys(Keys.CONTROL);
	driver.findElement(By.xpath("//a[text()='CRM']")).click();

}
