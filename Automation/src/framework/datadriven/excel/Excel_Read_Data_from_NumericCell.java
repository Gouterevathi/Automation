package framework.datadriven.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data_from_NumericCell 
{

	public static void main(String[] args) throws IOException  
	{
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file is located");
		
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		XSSFSheet sheet=book.getSheet("Datatype");
		
		XSSFRow row=sheet.getRow(1);
		
		double productID=row.getCell(0).getNumericCellValue();
		System.out.println("print productID");
		
		String str_productID=NumberToTextConverter.toText(productID);
		System.out.println("Product in String format is------"+str_productID);
		
		Double d=new Double(productID);
		int intproductID=d.intValue();
		System.out.println("Product ID in integer format---"+intproductID);
		
		
		
	}

}
