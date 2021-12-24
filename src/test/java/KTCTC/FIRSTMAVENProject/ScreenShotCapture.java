package KTCTC.FIRSTMAVENProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();			
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("http://demo.guru99.com/test/upload/");		
	 		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File f = ts.getScreenshotAs(OutputType.FILE);		
		
		File outFile = new File(System.getProperty("user.dir")+"\\abc.png");
		
		FileUtils.copyFile(f, outFile);
		
		

	}

}
