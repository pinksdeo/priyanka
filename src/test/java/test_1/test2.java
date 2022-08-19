package test_1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	@BeforeSuite
	public void BS() {
		System.out.println("i m before suite");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("i m before test");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("i m before class");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("i m before method");
	}
	
	@Test
	public void test() {
		System.out.println("i m test");
	}
	
	@AfterMethod
	public void AF() {
		System.out.println("i m after method");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("i m after class");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("i m after test");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("i m after suite");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
