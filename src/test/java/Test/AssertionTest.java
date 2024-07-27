package Test;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest {

	@Test
	public void TestGoogle() throws InterruptedException //Hard Assertion
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedResult="HYR Tutorials - Google Search"; //correct value is passed, so this TC will pass
		String actualResult=driver.getTitle();
		Assert.assertEquals(expectedResult, actualResult);
		Thread.sleep(5000);
		driver.close();	
		
	}

	@Test
	public void TestGoogle1() throws InterruptedException //Hard Assertion
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedResult="HYR Tutorials - Google Searchh"; //incorrect value is passed, so this TC will fail
		String actualResult=driver.getTitle();
		Assert.assertEquals(expectedResult, actualResult, "Title is mismatched");  //here the exception will occur
		Thread.sleep(5000);  // this will not work and come out , as the above assertion is failed
		driver.close();		 // this will not work and come out, as the above assertion is failed
	}


	@Test	
	public void TestFacebook() throws InterruptedException  //Soft Assertion

	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		System.out.println(driver.getTitle());
         
		SoftAssert softAssert=new SoftAssert();

		//Title Assertion
		String actualTitle=driver.getTitle();
		String expectedTitle= "Log in to Facebook";
		softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		//URL Assertion
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl= "https://www.facebook.com/";
		softAssert.assertNotEquals(actualUrl, expectedUrl, "URL is mismatched");

		//Text Assertion
		String actualText=driver.findElement(By.name("email")).getAttribute("value");
		String expecteText= "";
		softAssert.assertEquals(actualText, expecteText, "Username Text is mismatched");

		//Border Assertion
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border"); // this border is taken from CSS tab not from Html code for that usernamw
		String expecteBorder= "1px solid rgb(221, 223, 226)";  //1px solid #dddfe2 --> 1px solid #rgb(221,223,226) in chrome  -> open hex-to-rgb --> take the value and replace it 
		softAssert.assertEquals(actualBorder, expecteBorder, "Username's Border is mismatched");

		//Error Message Assertion
		String actualErrorMessage=driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage= "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "ErrorMessage  is mismatched");


		Thread.sleep(5000);
		driver.close();		
		softAssert.assertAll();
	}
}
