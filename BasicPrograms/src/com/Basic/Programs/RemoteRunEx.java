package com.Basic.Programs;



import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.server.RemoteServer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteRunEx {
	
	public static void main(String[] args) throws MalformedURLException {
		
	
		WebDriver driver=null;
		DesiredCapabilities desir = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://192.168.235.1:/wd/hub"), desir);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
	}
	}
