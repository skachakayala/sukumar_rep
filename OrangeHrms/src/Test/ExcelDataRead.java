package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelDataRead {
	public static void writeDataTOExcel() throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet =wb.createSheet("welcome");
		Row row = sheet.createRow(0);
		org.apache.poi.ss.usermodel.Cell cell = row.createCell(0);
		cell.setCellValue("welcome");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sukumar.kachakayala\\Desktop\\Test.xlsx");
		wb.write(fos);
	}
	public static void readDatFromExcel() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\sukumar.kachakayala\\Desktop\\Test.xlsx");
		 XSSFWorkbook  workbook= new XSSFWorkbook (fis);
		 XSSFSheet sheet = workbook.getSheet("Sheet1");
		 Row row =sheet.getRow(0);
		 org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		 System.out.println(cell.getStringCellValue());
		 for(int i=0;i<sheet.getLastRowNum();i++)
		 {
			 for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			 {
				 System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			 }
		 }
		  System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	}
 public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException  {
	 
	  ExcelDataRead.writeDataTOExcel();
 }
}
