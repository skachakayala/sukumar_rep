package com.business.Scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Vijay {
	
	@BeforeSuite
	public void vijayMethod()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void vijayMethodAfter()
	{
		System.out.println("After suite");
	}
	@BeforeMethod
	public void beforemethid()
	{
		System.out.println("before method annotation");
	}
	@AfterMethod
	public void aftermethid()
	{
		System.out.println("after method annotation");
	}
	@Test
	public void avijayMethod1()
	{
		System.out.println("welcome to trestg 1a");
	}
	@Test
	public void bvijayMethod2()
	{
		System.out.println("welcome to trestg 2b");
	}
	
	
}
