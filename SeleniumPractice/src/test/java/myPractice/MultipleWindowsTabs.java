package myPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import com.core.selenium.DriverInvoking;

public class MultipleWindowsTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/angularpractice/");
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/course-library");
		String course = driver.findElement(By.xpath("//h3[contains(@class,'mb-1')]")).getText();
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(course);
		driver.quit();
		
	}

}
