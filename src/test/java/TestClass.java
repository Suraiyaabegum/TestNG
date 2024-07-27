// we have created the class alone without creating the pacing hence it is mentioned as default package

import org.testng.annotations.Test;


public class TestClass {
	
	   @Test  // the foo() will become test method only when you mention the test annotation before the method 
       public void foo() {
	   System.out.println("Testing");
		
	}

	
}


// Create and run selenium  testscript
// selenium lib
// webdriver Manger dependency