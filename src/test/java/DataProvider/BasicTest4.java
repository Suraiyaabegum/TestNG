package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest4 {

	@Test(dataProvider="dp5")
	public void TestLogin(Object[] s) {  
		
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
	}

	
		@DataProvider
		public Object[][] dp5() {     //2-D String Array
			Object[][] data=new Object[][] {
				{"abc",123,998,"tyu"},
				{"xyz",456, "pio"},
				{"pqr",789,878, "ryu"},
			};
			return data;

		}
	}
