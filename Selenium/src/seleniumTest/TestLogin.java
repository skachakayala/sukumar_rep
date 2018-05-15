package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLogin extends TestDemo{
	WebDriver driver;
	@Test
	public void loginHRMS()
	{
		driver = TestDemo.getDriver();
		System.out.println("driver in TESTLOGIn "+driver);
		driver.get("http://10.0.3.3/HRMSLogin.aspx");
		driver.findElement(By.id("txtEmployeeId")).sendKeys("HDC7352");
		driver.findElement(By.id("txtPassword")).sendKeys("ammananna");
		driver.findElement(By.id("btnSubmit")).click();
		
	}

}
