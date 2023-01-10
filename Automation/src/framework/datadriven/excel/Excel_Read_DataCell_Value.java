package framework.datadriven.excel;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_DataCell_Value 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		XSSFSheet sheet=book.getSheet("Datatype");
		
		XSSFRow row=sheet.getRow(1);
		

		//Read Date cell value
		java.util.Date date=row.getCell(4).getDateCellValue();
		System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(date));

		
				
		
		
	}

}
