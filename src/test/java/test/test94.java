package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test94 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement ID=driver.findElement(By.xpath("//input[@name='cusid']"));
		ID.sendKeys("12345");
		WebElement submit_button=driver.findElement(By.xpath("//input[@name='submit']"));
		submit_button.click();
		Alert A=driver.switchTo().alert();
		String text=A.getText();
		System.out.println(text);
		A.dismiss();

	}

}
