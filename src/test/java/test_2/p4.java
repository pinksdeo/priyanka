package test_2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class p4 {
	
	@Test
	
	public void verify_test() {
		
		System.out.println("mail");
		System.out.println("password");
		System.out.println("loginbutton");
		
		SoftAssert soft=new SoftAssert();
		String expected="priyanka";
		String actual="manvik";
		
		soft.assertEquals(actual, expected);   //it will give passed so here end of the class will have to call assert all then only it will give failed
		
		System.out.println("test done");
		
		soft.assertAll();   // it will omit all fail cases in case of soft assert otherwise it will give passed if its fail then only
	}

}
