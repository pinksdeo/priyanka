package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test92 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String path="C:\\Users\\Admin\\eclipse-workspace\\batch12_project\\test data\\data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		 String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(data_1);
		 String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	   	System.out.println(data_2); 
		String data_3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		Double data_4=wb.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data_4);
		//now identify the web element	
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(data_1);
		WebElement password=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		String data_4_s=String.valueOf(data_4);
		 String data=data_4_s.replace(".0", " ");
		 System.out.println(data);
		password.sendKeys( data);

	}

}
