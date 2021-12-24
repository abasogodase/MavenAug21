package KTCTC.FIRSTMAVENProject;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DependentTestCases extends TestBase{
	
	
	@Test 
	public void verfyNewUserCanBeAddedToSystem()
	{
		System.out.println("Verfy New User Can Be Added To System");
		Assert.assertTrue(true);
	}
	
	
	@Test (dependsOnMethods = {"verfyNewUserCanBeAddedToSystem"})
	public void verfyExistingUserCanBeEdited()
	{
		System.out.println("verfy Existing User Can Be Edited ");
		Assert.assertTrue(false);
	}
	
	
	@Test(dependsOnMethods = {"verfyExistingUserCanBeEdited"}, enabled = false)
	public void verfyExistingUserCanBeDeleted()
	{
		System.out.println("verfy Existing User Can Be Deleted");
		Assert.assertTrue(true);
	}
	

	
	

}
