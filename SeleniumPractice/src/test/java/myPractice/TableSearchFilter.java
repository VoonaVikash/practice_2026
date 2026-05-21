package myPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.core.selenium.DriverInvoking;

public class TableSearchFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[type='search']")).sendKeys("ch");
		List<WebElement> vegs = driver.findElements(By.xpath("//tr/td[1]"));
//		System.out.println(vegs.size());
		List<WebElement> vegsFilter = vegs.stream().filter(s->s.getText().contains("Ch")).collect(Collectors.toList());
		Assert.assertEquals(vegs.size(), vegsFilter.size());
		driver.quit();
	}

}
