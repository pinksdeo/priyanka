package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test8 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		Actions act=new Actions(driver);
		
		act.keyDown(email, Keys.SHIFT).sendKeys("text").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		act.keyDown(password, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
