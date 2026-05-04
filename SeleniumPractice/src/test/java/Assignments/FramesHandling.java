package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.core.selenium.DriverInvoking;

public class FramesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
	}

}
