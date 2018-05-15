package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ReadData {
	WebDriver driver;
	@Test(dataProvider="dataRead")
	public void readdata(String username1,String username2)
	{
		System.out.println(username1+" "+username2);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username1);
		driver.findElement(By.id("txtPassword")).sendKeys(username2);
		
	}
	@DataProvider(name="dataRead")
	public static Object[][] readingdata() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Java\\Java workspace\\HRMS\\src\\com\\Utilities\\Test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum(); ;
		System.out.println(row);
		
		
		Object obj[][] = new Object[row+1][2];
		for(int i=0;i<=row;i++)
		{
			Row row1= sheet.getRow(i);
			for(int j=0;j<row1.getLastCellNum();j++)
			{
				obj[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
	
		return obj;
		
		 
	}

}

