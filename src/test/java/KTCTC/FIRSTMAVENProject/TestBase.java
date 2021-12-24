package KTCTC.FIRSTMAVENProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver = null;
	int a=9;
	@BeforeMethod
	public void beforeMethodAnnotation()
	{
		System.out.println("before Method Annotation");
	}
	
	@AfterMethod
	public void afterMethodAnnotation()
	{
		System.out.println("after Method Annotation");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after Suite");
	}
	

}
