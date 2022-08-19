package test_3;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class task {
	
	WebDriver driver;
	@BeforeMethod
	public void browser_opening() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test_1() throws Exception {
		//searching for mobile
		WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("mobile");
		//click on search bar
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton.click();
		//click on first mobile appear
		WebElement firstpiece=driver.findElement(By.xpath("//img[@alt='Samsung Galaxy M13 (Midnight Blue, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus']"));
		firstpiece.click();
		//taking screenshot
		String path="D:\\eclipse-workspace\\batch12_project\\screenshot";
		
		TakesScreenshot shot=(TakesScreenshot) driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File destination=new File(path+"\\test.png");
		FileUtils.copyFile(src, destination);
		//print mobile name on console
		WebElement mob_name=driver.findElement(By.xpath("//span[@id='productTitle']"));
		String name=mob_name.getText();
		System.out.println(name);
		//verify the logo of amazon 
		WebElement verify=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		String name1=verify.getText();
		System.out.println(name1);
		String actual=verify.getText();		
		String expected="amazon.in";
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
