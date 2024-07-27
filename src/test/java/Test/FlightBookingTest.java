package Test;

import org.testng.annotations.Test;

public class FlightBookingTest {

	@Test(priority=1)
	public void signup() {
		System.out.println("Signup");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Login");
	}
	@Test(priority=3)
	public void searchForTheFlight() {
		System.out.println("searchForTheFlight");
	}
	@Test(priority=4)
	public void bookTheFlight() {
		System.out.println("bookTheFlight");
	}
	@Test(priority=5)
	public void saveTheTicket() {
		System.out.println("saveTheTicket");
	}
	@Test(priority=6)
	public void logout() {
		System.out.println("logout");
	}
}
