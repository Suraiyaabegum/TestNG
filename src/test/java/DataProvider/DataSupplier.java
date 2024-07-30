package DataProvider;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	@DataProvider
	public String[] dp10() {    
		String[] data=new String[]{
			"Suraiya",
			"Sweadha",
			"Aparna",
			
		};
		return data	;
  }
	
	@DataProvider
	public String[] dp11() {    
		String[] data=new String[]{
			"Suraiya",
			"Mustafa",
			"Nazreen",
			
		};
		return data	;
  }
}
