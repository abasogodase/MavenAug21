package KTCTC.FIRSTMAVENProject;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AnnotationsInTestNG extends TestBase{
	
	
	@Test
	public void VerifyUserCanNotLoginWithInValidUserNameAndValidPassword()
	{
		System.out.println("Verify User Can Login With InValid User Name And Valid Password");
	}
	
	
	@Test
	public void VerifyUserCanNotLoginWithValidUserNameAndInValidPassword()
	{
		System.out.println("Verify User Can Login With Valid User Name And InValid Password");
	}
	
	
	@Test
	public void VerifyUserCanLoginWithValidUserNameAndValidPassword()
	{
		System.out.println("Verify User Can Login With Valid User Name And Valid Password");
	}
	

	
	

}
