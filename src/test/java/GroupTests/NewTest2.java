package GroupTests;

import org.testng.annotations.Test;

public class NewTest2 {
	
	@Test(groups= {"smoke"}) 
	public void test4() {
		System.out.println("Test4");
	}

	@Test(groups= {"smoke","functional","sanity","ios.smoke"}) 
	public void test5() {
		System.out.println("Test5");
	}
	
	@Test(groups= {"functional","regression","window.functional","ios.functional"}) 
	public void test6() {
		System.out.println("Test6");

	}
	
	@Test
	public void test7() {
		System.out.println("Test7");
	}
}