package crmPro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotEx {
	
	WebDriver driver;
	@Test
	public void robotTest() throws AWTException, InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		driver.get("Calculator.exe");
		//driver.findElement(By.xpath("//a[text()='animatedcolors.xlsm']")).click();
		Robot robot = new Robot();
		/*robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);*/
		robot.keyPress(KeyEvent.VK_8);
		
	}

}
