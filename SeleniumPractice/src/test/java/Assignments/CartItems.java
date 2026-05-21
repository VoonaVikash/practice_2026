package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.core.selenium.DriverInvoking;

public class CartItems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		String[] userPass = driver.findElement(By.cssSelector(".text-center.text-white")).getText().split(" ");
		driver.findElement(By.id("username")).sendKeys(userPass[2]);
//		System.out.println(userPass[6].length()+" "+userPass[6].substring(0, userPass[6].length()-1));
		driver.findElement(By.id("password")).sendKeys(userPass[6].substring(0, userPass[6].length() - 1));
		driver.findElement(By.xpath("//input[@value=\"user\"]")).click();
		
		//Explicit wait
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(3));
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		Select user = new Select(driver.findElement(By.cssSelector("select[data-style='btn-info']")));
		user.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='ProtoCommerce Home']")));
		List<WebElement> allItems = driver.findElements(By.xpath("//button[contains(@class, 'btn btn-info')]"));
		for (int i = 0; i < allItems.size(); i++)
			allItems.get(i).click();
		driver.findElement(By.cssSelector("a[class*=\"nav-link btn\"]")).click();
	}

}
