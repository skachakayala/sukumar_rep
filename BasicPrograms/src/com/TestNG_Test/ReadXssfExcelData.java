package com.TestNG_Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadXssfExcelData {
	
	@Test(enabled=true,dependsOnMethods="writeDataToExcel")
	public void readdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\sukumar.kachakayala\\Desktop\\Test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		      XSSFSheet sh1= wb.getSheetAt(0);
		      
		      for(int i=0;i<sh1.getLastRowNum()+1;i++)
		      {
		    	  for(int j=0;j<sh1.getRow(i).getLastCellNum();j++)
		    	  {
		    		  System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
		    	  }
		      }
		      
		      
	}
	
	@Test
	public void writeDataToExcel() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\sukumar.kachakayala\\Desktop\\Test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   // Load sheet- Here we are loading first sheetonly
		      XSSFSheet sh1= wb.getSheetAt(0);
		      
		      
		      sh1.getRow(0).createCell(1).setCellValue("read");
		      sh1.getRow(0).createCell(2).setCellValue("write");
		      FileOutputStream fos = new FileOutputStream("C:\\Users\\sukumar.kachakayala\\Desktop\\Test.xlsx");
		      wb.write(fos);
	}
	
	@Test(dataProvider="data",enabled=false)
	public void getdata(String name)
	{
		System.out.println("name is:"+name);
	}
	
	@DataProvider
	public static Object[][] data()
	{
		return new String[][]{{"sukumar"},{"sai"}};
	}

}
