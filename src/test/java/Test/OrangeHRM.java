package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	WebDriver driver;

	@BeforeTest
	public void InitialiseBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void Teardown() {
		driver.quit();
	}

	@Test
	public void LaunchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/");	
	}

	@Test
	public void EnterLoginDetails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
	}

	@Test
	public void verifyMyInfo() {
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());

	}

	@Test
	public void verifyLogin() {
		WebElement element =driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());

	}

}
