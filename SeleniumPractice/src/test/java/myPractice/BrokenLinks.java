package myPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.core.selenium.DriverInvoking;

public class BrokenLinks {
	
	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		AllLocators loc = new AllLocators(driver);
		
		String url = loc.soapui.getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int resCode = conn.getResponseCode();
		System.out.println(resCode);
		
	}

}
