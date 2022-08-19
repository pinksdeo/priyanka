package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//xpath by attribute is used below   syntax is //tagname[@attribute name='attribute value']
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("abc@123.com");
	
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("123456");
	
	//	WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		//login.click();
		
		WebElement frg_pass=driver.findElement(By.xpath("//a[@class='_97w4']"));
		frg_pass.click();
		
		// (//input[@data-type='text'])[3]
		

	}

}
