package KTCTC.FIRSTMAVENProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FIleUploadTestCase extends TestBase {
	
	@Test
	public void verfyUserCanUploadFileSuccessfully()
	{        		
				
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+"\\KTCTC.xlsx");		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();		
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='res']//center"))));		
		String text = driver.findElement(By.xpath("//*[@id='res']//center")).getText();		
	    Assert.assertEquals(text.replace("\n", " "), "1 file has been successfully uploaded.");	  
	    Assert.assertTrue(text.replace("\n", " ").equals("1 file has been successfully uploaded."));		

		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		if (result.getStatus()== ITestResult.FAILURE)
		{
			try {
				TakesScreenshot ts = (TakesScreenshot)driver;
				
				File f = ts.getScreenshotAs(OutputType.FILE);		
				
				File outFile = new File(System.getProperty("user.dir")+"\\fileupload.png");
				
				FileUtils.copyFile(f, outFile);
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (result.getStatus()== ITestResult.SUCCESS)
		{
			System.out.println("Test case is passed");
		}
		else if (result.getStatus()== ITestResult.SKIP)
		{
			System.out.println("Test case is skipped");
		}
		
		
		
		
	}

}
