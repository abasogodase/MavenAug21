package KTCTC.FIRSTMAVENProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockenLinks2 {

	public static void main(String[] args) throws MalformedURLException,IOException {
		// TODO Auto-generated method stub
		String baseURL = "https://demoqa.com/";
		String actualLink = null;
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();			
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
			driver.get("https://demoqa.com/links");
		
			
			List<WebElement> linkList = driver.findElements(By.tagName("a"));
			
			for (WebElement eachLink: linkList)
			{
				String href = eachLink.getAttribute("href");
				
				if (!(href==null))
				{
				
				if (href.contains("javascript:void"))
				{
					actualLink = baseURL + eachLink.getAttribute("id");
					
				}
				else
				{
					actualLink = href;
				}
				
				URL url = new URL(actualLink);
				
				HttpURLConnection http = (HttpURLConnection)url.openConnection();
				
				http.setConnectTimeout(15000);
				
				http.connect();
				
				int resCode = http.getResponseCode();
				
				String reMsg = http.getResponseMessage();
				
				if (http.getResponseCode()>=400)
				{
					System.out.println(actualLink);
					System.out.println("is broken with status code = "+http.getResponseCode()+ " and response message = "+http.getResponseMessage());
				}
				}
				
				
				
			}
			
			
			
			
			
		
		
		
	
		
		
		
		

	}

}
