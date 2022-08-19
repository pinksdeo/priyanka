package test_1;

import org.testng.annotations.Test;

public class test4 {
	
	@Test(invocationCount=2)
	
	public void A() {
		
		System.out.println("A is test");
		
	}
	
	@Test(enabled=false)
	public void B() {
		
		System.out.println("B is test");
		
	}
	
	@Test(dependsOnMethods="A")
	public void C() {
		
		System.out.println("C is test");
		
	}


	

}
