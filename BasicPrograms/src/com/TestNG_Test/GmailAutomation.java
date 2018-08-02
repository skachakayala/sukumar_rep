package com.TestNG_Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailAutomation {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		/*WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("sukumar.kachakayala");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9603243220");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();*/
		
		FileInputStream fis = new FileInputStream("C:\\Users\\sukumar.kachakayala\\Desktop\\GmailData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet =workbook.getSheet("Sheet1");
		char c=34;
		
		String firstBody= "Greetings from Traditional Medicine 2018!!\n\n" +"Hope you are doing well.\r\n\n" + "We respect your commitment towards time & work but I am writing this email since our scientific committee had a glance on one of your research publication titled ";
		String lastBody="which is very impressive. Your work is a perfect fit for our summit. We appreciate if you could deliver a lecture on the same.\r\n" +  
				"So hereby we take immense privilege to extend heartiest welcome to you to participate in Traditional Medicine 2018 conference during November 08-10 at Amsterdam, Netherlands.\r\n" +  
				"Your proficiency& eminent research work in this field will be an excellent addition to the congress & thus we are highly confident that your rational work will be very motivating for their research as well.\r\n\n" + 
				"For more information kindly have a glance at our website:http://traditionalmedicine.scientificconvention.com\n"+ 
				"I hope we get the opportunity to have your esteemed presence.\r\n" + 
				"Looking forward to hearing from you.\r\n\n\n" + 
				 "Regards,\n" +  
				"Jack Smith\n" + 
				"Program Manager\r\n" +
				"Scientific Convention\r\n" + 
				"Email:traditionalmedicine@scientificconvention.com";
		for(int i=1;i<sheet.getLastRowNum()+1;i++)
		{

			int cellCount = sheet.getRow(i).getLastCellNum();
			System.out.println("Email id is: "+sheet.getRow(i).getCell(1).getStringCellValue());
			System.out.println("Subject: "+sheet.getRow(i).getCell(2).getStringCellValue());
			System.out.println("Dear Dr."+sheet.getRow(i).getCell(0).getStringCellValue()+"\n\n"+firstBody+c+sheet.getRow(i).getCell(3).getStringCellValue()+c+" "+lastBody);
			System.out.println();
			/*driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Dear Dr."+sheet.getRow(i).getCell(0).getStringCellValue()+"\n\n"+firstBody+c+sheet.getRow(i).getCell(3).getStringCellValue()+c+" "+lastBody);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Send']")).click();
			Thread.sleep(5000);*/
		}
		
		
		
	}

}
