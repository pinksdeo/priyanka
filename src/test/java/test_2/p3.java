package test_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class p3 {
	
	@Test
	public void verify() {
		
		System.out.println("email");
		System.out.println("password");
		System.out.println("login button");
		
		String expected="BugSpotter";
		String actual="BugSpotter";
		Assert.assertEquals(actual, expected);
		
		System.out.println("test done");
		
		
	}

}
