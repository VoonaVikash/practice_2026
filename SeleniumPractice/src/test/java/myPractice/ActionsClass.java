package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.core.selenium.DriverInvoking;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav-link-accountList']"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("shoes").build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
	}

}
