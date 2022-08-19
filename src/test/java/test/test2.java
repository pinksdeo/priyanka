package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	public static void main(String[] args) {
		// locators---->by using ID and NAME
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
//webelement is a written type of findelement thats why we stored in webelement
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("test@2345.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		driver.close();
	}

}
