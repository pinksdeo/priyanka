package test_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {
	
	@Test
	
	public void verify() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		String name=logo.getText();
		String actual=name;
		String expected="amazon.in";
		
		Assert.assertEquals(actual, expected);
		
		
		
		
	}

}
