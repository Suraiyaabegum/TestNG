package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest2 {
	
	@Test(dataProvider="dp2")
	public void TestLogin(Integer i) {
		System.out.println(i);
	}


//	@DataProvider
//	public String[] dp1() {  
//		String[] data=new String[] {
//		"abcd",
//		"xyz",
//		"pqr"
//		};
//		return data;
//		
//	}
	
	@DataProvider
	public Integer[] dp2() {  
		Integer[] data=new Integer[] {	10,2,3	};
		return data;
		
	}
	
	//@DataProvider
	//public Object[] dp3() {  
	//	Object[] data=new Object[] {"helo",2,3	}; // object call is used to combination of different data type
	//	return data;
		
	//}
}
