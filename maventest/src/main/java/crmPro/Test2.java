package crmPro;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test()
	public void test2() throws InterruptedException
	{
		System.out.println("test2():");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.codejava.net/java-se/file-io/3-ways-for-reading-input-from-the-user-in-the-console");
		/*Thread.sleep(2500);
		driver.navigate().refresh();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[text()='Home']")).sendKeys(Keys.F5);*/
		WebElement ele = driver.findElement(By.id("gsc-i-id1"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		System.out.println(wait.until(ExpectedConditions.visibilityOf(ele)));
		ele.sendKeys("text");
		String name = driver.findElement(By.id("gsc-i-id1")).getAttribute("value");
		System.out.println("name is "+name);
		
		//Wait wait1 = new FluentWait(driver).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();
		List<WebElement> linkEle=driver.findElements(By.tagName("a"));
		System.out.println(linkEle.size());
	}

	
	


}
