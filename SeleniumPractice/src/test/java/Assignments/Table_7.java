package Assignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.selenium.DriverInvoking;

public class Table_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		int rows = driver.findElements(By.xpath("//table[@name='courses']/descendant::tr")).size();
		int cols = driver.findElements(By.xpath("//table[@name='courses']/descendant::th")).size();
		System.out.println("No.of Rows:" + rows);
		System.out.println("No.of Colomns:" + cols);
		List<WebElement> data = driver.findElements(By.xpath("//table[@name='courses']/descendant::tr[3]/td"));
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getText());
		}

	}

}
