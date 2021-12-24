package KTCTC.FIRSTMAVENProject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BotAuto {
	
	public void checkBotFlow(ArrayList<String> keys, ArrayList<String> values)
	{
		WebDriver driver = null;
		for (int j=0;j<keys.size();j++)
		{
			boolean	botFlag = driver.findElement(By.xpath("//*[contains(text(),'"+keys.get(j)+"')]")).isDisplayed();
			if (!values.get(j).equals("Blank"))
			{
				driver.findElement(By.id("queryTextbox")).sendKeys(values.get(j));
			}	
			
				
				Assert.assertTrue(botFlag);
			
		}
	}

}
