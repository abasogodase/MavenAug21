package KTCTC.FIRSTMAVENProject;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PriorityInTestNG {
	
	int count = 0;
	@Test (invocationCount = 4, priority = 1)
	public void verfyNewUserCanBeAddedToSystem()
	{
		count ++;
		if (count==3)
		{
			Assert.assertTrue(false);
		}
		System.out.println("Verfy New User Can Be Added To System");
		Assert.assertTrue(true);
		
	}
	
	
	@Test (priority = 203)
	public void verfyExistingUserCanBeEdited()
	{
		System.out.println("verfy Existing User Can Be Edited ");
		Assert.assertTrue(true);
	}
	
	
	@Test (priority = 56, dependsOnMethods = {"verfyExistingUserCanBeEdited"})
	public void verfyExistingUserCanBeDeleted()
	{
		System.out.println("verfy Existing User Can Be Deleted");
		Assert.assertTrue(true);
	}
	

	
	

}
