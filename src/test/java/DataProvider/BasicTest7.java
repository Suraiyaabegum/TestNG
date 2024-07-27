package DataProvider;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest7 {

	@Test(dataProvider="dp8")
	public void TestLogin(String[] s) {  
		System.out.println(s);
	}

	@DataProvider
	public Iterator<String[]> dp8() {     
		Set<String[]> data=new HashSet<String[]>();
		data.add( new String[] {"Suraiya","begum"});
		data.add( new String[] {"Suraiya","begum"});
		return data.iterator();
	}

	@Test(dataProvider="dp9")
	public void TestLogin1(Object[] s) {  
		System.out.println(s);
	}

	@DataProvider
	public Iterator<Object[]> dp9() {     
		Set<Object[]> data=new HashSet<Object[]>();
		data.add( new Object[] {"Suraiya","begum",2323});
		data.add( new Object[] {"Suraiya","begumn",565});
		return data.iterator();


	}
}
