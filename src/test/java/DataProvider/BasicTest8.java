package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest8 {
	@Test(dataProvider="dp9")
	public void TestLogin(String[] s) {  
		System.out.println(s);
	}
	
	@DataProvider(indices = {0,2})
	public String[] dp9() {     
		String[] data=new String[]{
			"Suraiya",
			"Sweadha",
			"Aparna",
		};
		return data	;
  }
}
