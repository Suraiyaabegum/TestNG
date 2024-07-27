package DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest5 {

	@Test(dataProvider="dp6")
	public void TestLogin(String[] s) {  
		System.out.println(s);
	}

	@DataProvider
	public Iterator<String> dp6() {     
		List<String> data=new ArrayList<String>();
		data.add("Suraiya");
		data.add("Begum");
		return data.iterator();


	}
}
