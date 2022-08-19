package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5 {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void browser_opening() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void email_id() {
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("priyanka");
	}
	
	@Test
	
	public void password() {
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("123456");
	}
	
	@Test
	
	public void login() {
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}
	
	@AfterMethod
	
	public void browser_close() {
		driver.close();
	}
	
	
	
	
	
	
	
}









