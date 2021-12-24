package KTCTC.FIRSTMAVENProject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPRoviderInTestNG {
	
	@DataProvider (name = "UserName")
	public Object[] getData()
	{
		Object arr[] = {"Ajay", "Amit", "Sanket", true, 23};
		
		return arr;
		
	}
	
	@Test (dataProvider = "UserName", enabled = false)
	public void verifyNewUserCanBeAdded(Object ad)
	{
		
		System.out.println(ad);
	}
	
	@Test (dataProvider = "keyValue")
	public void getUserData(String a, String b)
	{
	boolean	botFlag = driver.findelement(By.xpath("//*[contains(text(),'"+a+"')]")).isDisplayed();
	if (!b.equals("Blank"))
	{
		driver.findelement(By.id("queryTextbox")).sendKeys(b);
	}
	
	
		System.out.println("Keys is = "+a);
		System.out.println("Value is = "+b);
		Assert.assertTrue(botFlag);
		
	}
	
	@DataProvider (name = "ChildPlan")
	public Object[][] getKeyValuePair()
	{
		ExcelHelper obj = new ExcelHelper("KTCTC.xlsx", "childplan");
		ArrayList<String> keys = obj.getKeysList();
		ArrayList<String> values = obj.getValueList();
		
		
		
		Object arr[][] = new Object[keys.size()][2];
		
		for (int i=0;i<keys.size();i++)
		{				
				arr[i][0] = keys.get(i); 				
				
				arr[i][1] = values.get(i);
			
			
		}
		
		
		
		return arr;
		
		
		
		
		
	}
	
	@Test
	public void verifyChildPlaBotFlow()
	{
		ExcelHelper obj = new ExcelHelper("KTCTC.xlsx", "Aug");
		ArrayList<String> keys = obj.getKeysList();
		ArrayList<String> values = obj.getValueList();
		BotAuto obj2 = new BotAuto();
		
		obj2.checkBotFlow(keys, values);
		
	}
	@Test
	public void verifyAdultPlaBotFlow()
	{
		ExcelHelper obj = new ExcelHelper("KTCTC.xlsx", "adult");
		ArrayList<String> keys = obj.getKeysList();
		ArrayList<String> values = obj.getValueList();
		BotAuto obj2 = new BotAuto();
		
		obj2.checkBotFlow(keys, values);
		
	}

}
