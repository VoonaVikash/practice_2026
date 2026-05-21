package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import com.core.selenium.DriverInvoking;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(driver.findElement(By.xpath("//*[@name=\"name\"]")))).getText());
		driver.findElement(with(By.tagName("input")).below(driver.findElement(By.cssSelector("[for='exampleInputPassword1']")))).click();
		driver.findElement(with(By.tagName("input")).toRightOf(driver.findElement(By.xpath("//label[@for='exampleFormControlRadio1']")))).click();
		driver.findElement(with(By.tagName("input")).toLeftOf(driver.findElement(By.xpath("//label[text()='Employed']")))).click();
		
	}

}
