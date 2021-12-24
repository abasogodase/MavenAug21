package KTCTC.FIRSTMAVENProject;

import org.testng.annotations.Test;

public class EnableClass {
	
	@Test(enabled = false)
	public void methodAFromEnableClass()
	{
		System.out.println("method A From EnableClass");
	}
	@Test
	public void methodBFromEnableClass()
	{
		System.out.println("method B From EnableClass");
	}

}
