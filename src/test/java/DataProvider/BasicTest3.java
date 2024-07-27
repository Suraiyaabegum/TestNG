package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest3 {

	@Test(dataProvider="dp4")
	public void TestLogin(String[] s) {  //1-D String is passed as parameter coz as it is collection single dimension array in the data provider method
		System.out.println(s[0] +">>"+ s[1]);
		
	}

	@Test(dataProvider="dp4")
	public void TestLogin(String username, String password) { //this type of parameter is used when we know the column 
		System.out.println(username +">>"  + password);
	}

		@DataProvider
		public String[][] dp4() {     //2-D String Array
			String[][] data=new String[][] {
				{"abc","123"},
				{"xyz","456"},
				{"pqr","789"},
			};
			return data;

		}
	}
