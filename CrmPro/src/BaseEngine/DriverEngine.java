package BaseEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DriverEngine {
	
	
	private static WebDriver driver;
	String currentDir;
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("firefox")String browser)
	{
		currentDir = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver",currentDir+"\\Drivers\\geckodriver.exe" );
			driver = new FirefoxDriver();
			init();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",currentDir+"\\Drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
			init();
		}
		else
		{
			System.setProperty("webdriver.ie.driver",currentDir+"\\Drivers\\IEDriverServer.exe" );
			driver = new InternetExplorerDriver();
			init();
		}
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	public void init()
	{
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
