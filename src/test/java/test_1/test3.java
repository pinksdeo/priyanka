package test_1;

import org.testng.annotations.Test;

public class test3 {
	
	@Test(priority=2,invocationCount=2)
	
	public void A() {
		
		System.out.println("A is test");
		
	}
	
	@Test(priority=3,enabled=false)
	public void B() {
		
		System.out.println("B is test");
		
	}
	
	@Test(priority=1)
	public void C() {
		
		System.out.println("C is test");
		
	}

}
