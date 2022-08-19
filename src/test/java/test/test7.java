package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7 {

	public static void main(String[] args) throws Exception {
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement source1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement destination1=driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		act.dragAndDrop(source1, destination1).build().perform();
		Thread.sleep(3000);
		
		WebElement source2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement destination2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(source2, destination2).build().perform();
		Thread.sleep(3000);
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
