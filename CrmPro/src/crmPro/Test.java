package crmPro;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.google.common.base.Verify;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Options op= driver.manage();
		Window w= op.window();
		w.maximize();
		
		//driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sukumar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Freecrm@123");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		/*driver.switchTo().frame("mainpanel");
		String name=driver.findElement(By.xpath("//td[@class='headertext']")).getText();
		System.out.println(name);*/
		String title = driver.getTitle();
		System.out.println("title of the page"+title);
		Assert.assertEquals(title, "xyx");
		//Verify.
		List<WebElement> name= driver.findElements(By.tagName("frame"));
		//System.out.println(driver.findElements(By.tagName("frame")));
		System.out.println(name.size());
		for(WebElement e: name)
			System.out.println(e.getAttribute("name"));
		driver.switchTo().frame("mainpanel");
		String freameName=driver.findElement(By.xpath("//td[@class='headertext']")).getText();
		System.out.println(freameName);
		driver.findElement(By.xpath("//a[text()='Add Boxes»']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Calendar']"));
		
		
		
		
		
		
		//driver.
		Thread.sleep(2500);
		driver.close();
		
		
		
	}

}
