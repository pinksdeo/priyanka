package test_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {					//handling of scroll bar
	
	@Test
	public void verifytest_001() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
	
		  js.executeScript("window.scrollBy(0,500)", "");	//scroll by pixel
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,-500)", "");;  //scrolling upward side
		  Thread.sleep(3000);
		  WebElement gujarati=driver.findElement(By.xpath("//a[@class='_sv4']"));
		  
		  js.executeScript("arguments[0]scrollintoview()", gujarati);
		  
		  
		
		
	}
	
	

}
