package testEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\sukumar.kachakayala\\Desktop\\Test.xlsx");
		System.out.println(fis);
		Workbook wb = WorkbookFactory.create(fis);
		System.out.println(wb);
		Sheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet);
		System.out.println(sheet.getLastRowNum());
		/*for(int i=0;i<sheet.getLastRowNum();i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				Cell cell= row.getCell(j);
				if(!cell.getStringCellValue().isEmpty())
				System.out.println(cell.getStringCellValue());
			}
		}*/
		//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		

	}

}
