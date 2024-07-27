package DataProvider;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest6 {

	@Test(dataProvider="dp7")
	public void TestLogin(String[] s) {  		
			System.out.println(s);
	}

	
		@DataProvider
		public Iterator<String> dp7() { 
			Set<String> data=new HashSet<String>();
			data.add("Suraiya");
			data.add("Begum");
			return data.iterator();
		

		}
	}
