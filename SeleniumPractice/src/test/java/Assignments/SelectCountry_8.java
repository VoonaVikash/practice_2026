package Assignments;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.core.selenium.DriverInvoking;

public class SelectCountry_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		Assert.assertEquals("India", driver.findElement(By.id("autocomplete")).getAttribute("value"));
//		Actions a = new Actions(driver);
//		List<WebElement> options = driver.findElements(By.cssSelector("#ui-id-1 li div"));
//		for (int i = 0; i < options.size(); i++) {
//			System.out.println(options.get(i).getText());
//			if (options.get(i).getText().equals("India")) {
//				a.moveToElement(options.get(i)).click().build().perform();
//			}
//		}
	}

}
