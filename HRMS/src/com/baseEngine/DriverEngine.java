package com.baseEngine;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.Utilities.Driverkeys;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DriverEngine {
	private static WebDriver driver;
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;
	String currentDir;
	
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("firefox")String browser)
	{
		System.out.println("browser is "+browser);
		 currentDir = System.getProperty("user.dir");

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(Driverkeys.chromeKey, currentDir+"//"+Driverkeys.chromeValue);
			driver=new ChromeDriver();
			init();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(Driverkeys.geckoKey, currentDir+"//"+Driverkeys.geckoValue);
			driver=new FirefoxDriver();
			init();
			
		}
		else 
		{
			System.setProperty(Driverkeys.ieKey, currentDir+"//"+Driverkeys.ieValue);
			driver=new InternetExplorerDriver();
			init();
		}
	}
	@BeforeMethod
	public void runTimeTcName(Method method)
	{
		String tcName = method.getName();
		System.out.println("currently running test case is "+tcName);
		extentTest = extentReports.startTest(tcName);
	}
	
	@AfterMethod
	public void afterTCExcution(ITestResult itestResult) throws IOException
	{
		String tcName = itestResult.getName();
		
		if(itestResult.getStatus()==ITestResult.SUCCESS)
		{
			extentTest.log(LogStatus.PASS, tcName+" passed" );
		}
		if(itestResult.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("TC failed taking screensshot "+tcName);
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File file = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(currentDir+"\\Screenshot\\"+tcName+".jpeg"));
			extentTest.log(LogStatus.FAIL, tcName+" failed" );
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(currentDir+"\\Screenshot\\"+tcName+".jpeg"));
		}
		else if(itestResult.getStatus()==ITestResult.SKIP)
		{
			System.out.println("TC is skipped "+tcName);
			extentTest.log(LogStatus.SKIP, tcName+" skipped" );
		}
		
	}
	@BeforeTest
	public void initialiseReport()
	{
		String reportLoc = System.getProperty("user.dir")+"\\Reports\\report.html";
		extentReports = new ExtentReports(reportLoc);	
	}
	@AfterTest
	public void endReport()
	{
		extentReports.flush();
		//if (extentReports!=null)
			//extentReports.close();
	}
	
	
	public void init()
	{
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		if(driver!=null)
		{
			//driver.close();
		}
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
