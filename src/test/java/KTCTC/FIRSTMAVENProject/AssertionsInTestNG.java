package KTCTC.FIRSTMAVENProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	
	String ddd = null;
	AssertionsInTestNG obj;
	
	@Test
	public void methodAFromAssertionsInTestNG()
	{
		System.out.println("method A From AssertionsInTestNG");
		obj = new AssertionsInTestNG();
		Assert.assertNull(ddd);
		Assert.assertNotNull(obj);
		
		System.out.println("After null assertion");
		
		String UImesasge = "44";
		
		Assert.assertEquals(UImesasge, 44, "Current share pricce is not displayed as per requirement");
		
		Assert.assertEquals(" File uploaded successfully", "1 File uploaded successfully", "Upload file message is not displayed corret");
		
		
		
		boolean flagInbox = false;
		boolean profileName = true;
		
		Assert.assertTrue(flagInbox, "Inbox text is not displayed..");
		Assert.assertTrue(profileName, "Profile name is not displayed");		
		System.out.println("After assertion in A method");
	}
	@Test
	public void methodBFromAssertionsInTestNG()
	{
		
		Assert.assertNotEquals(23, 44);
		System.out.println("method B From AssertionsInTestNG");
		Assert.assertFalse(true, "Still message is displayed on UI");
		Assert.assertTrue(true);
		System.out.println("After assertion in B method");
	}
	
	
	

}
