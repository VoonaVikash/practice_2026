package myPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.selenium.DriverInvoking;

public class MultipleLinksOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerFirstCol = driver.findElement(By.xpath("//div[@id='gf-BIG']/descendant::ul[1]"));
		System.out.println(footerFirstCol.findElements(By.tagName("a")).size());
		for(int i=1; i<footerFirstCol.findElements(By.tagName("a")).size(); i++) {
			String keys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerFirstCol.findElements(By.tagName("a")).get(i).sendKeys(keys);
			Thread.sleep(3000);
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
//		it.next();
//		for(int i=1;i<windows.size();i++)
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
