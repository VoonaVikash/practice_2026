package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.core.selenium.*;

public class CheckBoxSelection {
	
	public static void main(String[] args) {
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		
	}

}
