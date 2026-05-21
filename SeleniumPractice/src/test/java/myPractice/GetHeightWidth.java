package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.selenium.DriverInvoking;

public class GetHeightWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println("Height:"+name.getRect().height+" Width:"+name.getRect().width);
		driver.quit();

	}

}
