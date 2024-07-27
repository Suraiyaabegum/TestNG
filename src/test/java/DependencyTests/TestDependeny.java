package DependencyTests;


import org.testng.annotations.Test;

public class TestDependeny {
	static String trackingNumber= null;
	@Test
	public void createSihpment() {
		System.out.println(24/0);   // just to create exception, we have to added this
		System.out.println("createSihpment");
		trackingNumber="ABC12YH";
	}	


	@Test(dependsOnMethods = {"createSihpment"}, alwaysRun =true, ignoreMissingDependencies = true)  // to execute this, createSihpment() has to be executed
	public void trackShipment() throws Exception {
		if(trackingNumber !=null)
			System.out.println("TrackShipment");
		else
			throw new Exception("Invalid Tracking Number");
	}

	@Test(dependsOnMethods = {"createSihpment", "trackShipment"}) // to execute this, createSihpment() has to be executed
	public void cancelShipment() throws Exception {
		if(trackingNumber !=null)
			System.out.println("CancelShipment");
		else
			throw new Exception("Invalid Tracking Number");

	}
}
