package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterAnnotaion {

	WebDriver driver;

	@Parameters ("browserName")  //this browserName is given in Annotation.xml file and value is passed there
	@BeforeTest
	public void InitialiseBrowser(@Optional("chrome") String browserName) {   //as a parameter the value is passed  //@Optional is used for Optional parameter
		
		switch (browserName) {
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		break;
		
		case "edge":
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
		break;
		case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		break;
		
		default:
	    System.err.println("Browser is Invalid");
		break;
		
		}
		driver.manage().window().maximize();
		
	}
    @Parameters("sleepTime")
	@AfterTest
	public void Teardown(Long sleepTime) throws NumberFormatException, InterruptedException {
    	System.out.println(sleepTime);
    	Thread.sleep(sleepTime);
		driver.quit();
	}
    @Parameters("url")  //this url is given in Annotation.xml file and value is passed from there  to this method
	@Test
	public void LaunchApp(String url) { //as a parameter the value is passed
		driver.get("");	
	}
    
    @Parameters ({"username","password"}) // more than one value has to be mentioned in curly bracket since it accepts in array form
	@Test
	public void EnterLoginDetails(String username,String password) {
		driver.findElement(By.id("txtUsername")).sendKeys("username");
		driver.findElement(By.id("txtPassword")).sendKeys("password");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
	}

	@Test
	public void verifyMyInfo() {
		boolean actualValue=driver.findElement(By.id("employee-details")).isDisplayed();
		Assert.assertTrue(actualValue);

	}

	@Test
	public void verifyLogin() {
		WebElement element =driver.findElement(By.id("welcome"));
		Assert.assertTrue(element.isDisplayed());
		Assert.assertTrue(element.getText().startsWith("welcome"));

	}

}
