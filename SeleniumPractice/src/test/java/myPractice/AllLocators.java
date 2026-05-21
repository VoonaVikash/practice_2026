package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLocators {
	
	WebDriver driver;
	public AllLocators(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	//AutomationPractice
	WebElement soapui = driver.findElement(By.xpath("//a[contains(@href,'soapui')]"));

}
