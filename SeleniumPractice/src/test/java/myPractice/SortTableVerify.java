package myPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.core.selenium.DriverInvoking;

public class SortTableVerify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//table/descendant::th[1]")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//table/descendant::tr/td[1]"));
		List<String> originList = elements.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		List<String> sortedList = originList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originList.equals(sortedList));
		
	}

}
