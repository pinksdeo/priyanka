package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test9 {

	public static void main(String[] args) throws Exception {
		
	//	handling of keyboard actions like using shift key,control+a,control+c,control+v,enter....
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		Actions act=new Actions(driver);
		// by pressing shift key we send 'text' from lower case to upper case to txt_email field.
		act.keyDown(txt_email, Keys.SHIFT).sendKeys("text").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		//by pressing control+a we select TEXT on txt_email field.
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		//by pressing control+c we copy TEXT from txt_email field.
		act.keyDown(txt_email, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		Thread.sleep(3000);
		//by pressing control+v we paste TEXT on password field.
		act.keyDown(password, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		Thread.sleep(3000);
		//now we click on login button by pressing ENTER key.
		act.keyDown(login, Keys.ENTER).click().build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
