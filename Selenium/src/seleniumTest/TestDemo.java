package seleniumTest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class TestDemo {
	private static ExtentReports ext;
    private static WebDriver driver;
    private static ExtentTest logger;
	
	
		
				                   
	@BeforeSuite
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("driver in suite "+driver);
		
		System.out.println("Extet reports: "+ext);
	    //System.out.println("Extet test:" +logger);
	}
	
	@BeforeMethod
	public void beforemethod(Method method)
	{
		String tcName = method.getName();
		System.out.println("Currently running test case is "+tcName);
		//ExtentTest logger=ext.startTest("HRMS Test");
		logger = ext.startTest("welcome");
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult itestResult ) throws IOException{
		
		
		String tcName = itestResult.getName();
		
		if(itestResult.getStatus()== ITestResult.SUCCESS)
		{
				
			logger.log(LogStatus.PASS, tcName+" TC Passed");
		}
		if(itestResult.getStatus()== ITestResult.FAILURE)
		{
				System.out.println("TC ID FAILED SO TAKING SCREENSHOT");
				logger.log(LogStatus.FAIL, tcName+" TC failed");
				TakesScreenshot screenshot =(TakesScreenshot)driver;
				File file = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file, new File("D:\\Java\\Java workspace\\Selenium\\Screenshots\\"+tcName+".jpeg"));
		}
		
        
		
	}
	@BeforeTest
	public void intialiseReports()
	{
		ext = new ExtentReports("D:\\Java\\Java workspace\\Selenium\\Reports\\report.html");
	}
	@AfterTest
	public void closeReports()
	{
		
	}
	@AfterSuite
	public void logout()
	{
		if(driver!=null)
		{
			driver.close();
		}
		
		ext.flush();
		//er.close();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
