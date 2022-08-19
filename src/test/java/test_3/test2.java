package test_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {
	
	@Test
	public void test_3() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@class='_97vu img']"));
		String name=logo.getText();
		String actual=name;
		String expected="facebook";
		
		Assert.assertEquals(actual, expected);
		
		
	}

}
