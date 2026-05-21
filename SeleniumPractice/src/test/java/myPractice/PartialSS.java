package myPractice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import com.core.selenium.DriverInvoking;
import com.google.common.io.Files;

public class PartialSS {

	public static void main(String[] args) throws IOException {
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
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(course);
		File file = name.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("name.png"));
		driver.quit();

	}

}
