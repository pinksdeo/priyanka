package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select=new Select(dropdown);
		select.selectByIndex(10);			//select by index method is used to find specific element
		
	//	select.selectByValue("bangladesh");		//select by value method is used to find specific element
		
		//select.selectByVisibleText("India");
		
		
		
		
		
		
	}

}
