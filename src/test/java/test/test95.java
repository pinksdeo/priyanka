package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test95 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\Admin\\eclipse-workspace\\batch12_project\\test data\\data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data_1=wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		String data_2=wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		String data_3=wb.getSheet("Sheet2").getRow(2).getCell(0).getStringCellValue();
		String data_4=wb.getSheet("Sheet2").getRow(3).getCell(0).getStringCellValue();
		String data_5=wb.getSheet("Sheet2").getRow(4).getCell(0).getStringCellValue();
		String data_6=wb.getSheet("Sheet2").getRow(5).getCell(0).getStringCellValue();
		String data_7=wb.getSheet("Sheet2").getRow(6).getCell(0).getStringCellValue();
		String data_8=wb.getSheet("Sheet2").getRow(7).getCell(0).getStringCellValue();
		String data_9=wb.getSheet("Sheet2").getRow(8).getCell(0).getStringCellValue();
		String data_10=wb.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		String data_11=wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		String data_12=wb.getSheet("Sheet2").getRow(2).getCell(1).getStringCellValue();
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys(data_1);
		Thread.sleep(3000);
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys(data_2);
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys(data_3);
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		email.sendKeys(data_4);
		Thread.sleep(3000);
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys( data_5);
		Thread.sleep(3000);
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys(data_6);
		Thread.sleep(3000);
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys(data_7);
		Thread.sleep(3000);
		WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode.sendKeys(data_8);
		Thread.sleep(3000);
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel=new Select(country);
		sel.selectByIndex(107);
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(data_10);
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(data_11);
		Thread.sleep(3000);
		WebElement confirmpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpass.sendKeys(data_12);
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
	//	WebElement signin=driver.findElement(By.xpath("//a[@href='login.php']"));
	//	signin.click();
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		WebElement username1=driver.findElement(By.xpath("//input[@name='userName']"));
		username1.sendKeys("lambole");
		Thread.sleep(3000);
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("5678");
		Thread.sleep(3000);
		WebElement submitbtn=driver.findElement(By.xpath("//input[@name='submit']"));
		submitbtn.click();
		
		String path1="C:\\Users\\Admin\\eclipse-workspace\\batch12_project\\screenshot";
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(path1+"\\test.png");
		FileUtils.copyFile(src, destination);
		
		Thread.sleep(3000);
		driver.close();

		
		
		
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		










		
		

	}

}
