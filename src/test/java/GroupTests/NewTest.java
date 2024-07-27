
package GroupTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(groups= {"all"}) 	
public class NewTest {


	@Test(groups= {"smoke","sanity","windows.smoke"})   // accepting array of data
	public void test1() {
		System.out.println("Test1");
	}

	@Test(groups= {"regression", "sanity","window.sanity","ios.sanity"}) 
	public void test2() {
		System.out.println("Test3");
	}

	@Test
	public void test3() {
		System.out.println("Test3");

	}
}

