package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotaionNGClass2 { //TestNG class with selecting any annotations
  @Test
  public void testmethod1() {
	  System.out.println("Test Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest Method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite Method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite Method");
  }

}
