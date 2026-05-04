package com.core.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("name")).sendKeys("Vikash");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys("Viraj");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();		
//		driver.close();
	}
}