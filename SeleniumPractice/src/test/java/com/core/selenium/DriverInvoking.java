package com.core.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInvoking {
	
	public WebDriver callDriver(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
