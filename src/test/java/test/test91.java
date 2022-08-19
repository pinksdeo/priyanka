package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test91 {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Users\\Admin\\eclipse-workspace\\batch12_project\\test data\\data.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		 String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(data_1);
		 String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(data_2); 
		String data_3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();

		System.out.println( data_3);
		

	}

}
