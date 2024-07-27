package DataProvider;


import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="dp10", dataProviderClass = DataSupplier.class)  // mentioned with class name 
	public void TestLogin(String[] s) {  
		System.out.println(s);
	}
	
	
}