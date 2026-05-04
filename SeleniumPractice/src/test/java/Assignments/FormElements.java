package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.core.selenium.DriverInvoking;

public class FormElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Vikash Voona");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vikas@voona.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Vikash");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		Select gender = new Select(driver.findElement(By.xpath("//select[@id=\"exampleFormControlSelect1\"]")));
		gender.selectByVisibleText("Female");
		driver.findElement(By.xpath("//label[@for=\"inlineRadio1\"]/preceding-sibling::input")).click();
		driver.findElement(By.cssSelector("input[name*='bd']")).sendKeys("16-06-2000");
		driver.findElement(By.xpath("//input[contains(@class, 'btn-success')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class, 'alert-success')]")).getText());

	}

}
