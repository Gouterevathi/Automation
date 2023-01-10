package framework.datadriven.excel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
				FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
				System.out.println("file is located");
				
				XSSFWorkbook book=new XSSFWorkbook(fi);
				
				XSSFSheet sheet=book.getSheet("config");
			
				XSSFRow row=sheet.getRow(1);
				
				XSSFCell BrowserCell=row.createCell(0);
				
				//Read characters from excel cel
				String BrowserName=BrowserCell.getStringCellValue();
				System.out.println(BrowserName);
				
				String Osname=sheet.getRow(1).getCell(1).getStringCellValue();
				System.out.println(Osname);
				
				//Get uri from Excel
				String appurl=sheet.getRow(1).getCell(2).getStringCellValue();
				System.out.println(appurl);
						
				
	}
	

}
