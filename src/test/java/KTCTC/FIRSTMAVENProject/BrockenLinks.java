package KTCTC.FIRSTMAVENProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrockenLinks {

	public static void main(String[] args) throws MalformedURLException,IOException {
		// TODO Auto-generated method stub
		
		
		String link = "https://demoqa.com/links";
		
		URL url = new URL(link);
		
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		
		http.setConnectTimeout(15000);
		
		http.connect();
		
		int resCode = http.getResponseCode();
		
		String reMsg = http.getResponseMessage();
		
		System.out.println(resCode);
		System.out.println(reMsg);
		
		

	}

}
