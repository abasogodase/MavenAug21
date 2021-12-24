package KTCTC.FIRSTMAVENProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsInTestNG {
	
	String ddd = null;
	SoftAssertionsInTestNG obj;
	
	SoftAssert sAssert = new SoftAssert();
	
	@Test
	public void methodAFromAssertionsInTestNG()
	{
		System.out.println("method A From AssertionsInTestNG");
		obj = new SoftAssertionsInTestNG();
		sAssert.assertNull(ddd);
		sAssert.assertNotNull(obj);
		
		System.out.println("After null assertion");
		
		String UImesasge = "44";
		
		sAssert.assertEquals(UImesasge, 44, "Current share pricce is not displayed as per requirement");
		
		sAssert.assertEquals(" File uploaded successfully", "1 File uploaded successfully", "Upload file message is not displayed corret");	
		
		boolean flagInbox = false;
		boolean profileName = true;
		
		sAssert.assertTrue(flagInbox, "Inbox text is not displayed..");
		sAssert.assertTrue(profileName, "Profile name is not displayed");		
		System.out.println("After assertion in A method");		
		sAssert.assertAll();
		System.out.println("After assert all...............");
		
	}
	@Test
	public void methodBFromAssertionsInTestNG()
	{
		
		sAssert.assertNotEquals(23, 44);
		System.out.println("method B From AssertionsInTestNG");
		sAssert.assertFalse(true, "Still message is displayed on UI");
		sAssert.assertTrue(true);
		System.out.println("After assertion in B method");
		sAssert.assertAll();
	}
	
	
	

}
