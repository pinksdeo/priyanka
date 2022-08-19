package test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test90 {

	public static void main(String[] args) throws Exception {
		// capture screen shot
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("abcdef");
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("1234567");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		String path="C:\\Users\\Admin\\eclipse-workspace\\batch12_project\\screenshot";
		String rm=RandomString.make(4);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(path+"\\"+rm+"test.png"+" "+timestamp());
		FileUtils.copyFile(src, destination);
		driver.close();

	}

	public static String timestamp() {
		
		return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date(0));
	}

}
