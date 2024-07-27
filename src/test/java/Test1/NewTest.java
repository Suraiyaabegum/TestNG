
package Test1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class NewTest {
	@Ignore   // this annotation will not execute this method
	@Test
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test3");
	}
	@Test
	public void test3() {
		System.out.println("Test3");

	}
}

