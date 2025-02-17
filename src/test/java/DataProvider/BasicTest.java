package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	
	@Test(dataProvider="loginTestData")  //or  @Test(dataProvider="loginData")  we can also pass method name here
	public void TestLogin(String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
	}


	@DataProvider(name="loginTestData")
	public Object[][] loginData() {   //Object[][] is the return as it has return type is data
		Object[][] data=new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "Admin";
		data[1][1] = "test123";
		return data;
	}

//	@DataProvider
//	public void loginData1() {
//	}
//
//	@DataProvider
//	public void loginData2() {
//	}
}
