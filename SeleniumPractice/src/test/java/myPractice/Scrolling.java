package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.core.selenium.DriverInvoking;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
//		js.executeScript("document.querySelector('.tableFixHead').scrollTop=100");
		
//		List<WebElement> td = driver.findElements(By.xpath("//div[@class='tableFixHead']/descendant::tr/td[4]"));
		List<WebElement> td = driver.findElements(By.xpath("//table[@class='table-display']/descendant::tr/td[3]"));
		int sum = 0;
		for(int i=0; i<td.size();i++) {
			sum = Integer.parseInt(td.get(i).getText())+sum;
		}
		System.out.println(sum);
//		Assert.assertEquals(sum, Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim()));
//		driver.close();
	}

}
