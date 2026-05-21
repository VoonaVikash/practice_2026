package myPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.selenium.DriverInvoking;

public class TablePagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<String> price;
		driver.findElement(By.xpath("//th[1]")).click();
		do {
			List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
			price = elements.stream().filter(s->s.getText().contains("Mango")).map(s->getPrice(s)).collect(Collectors.toList());
			price.stream().forEach(s->System.out.println(s));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}while(price.size()<1);

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String price = s.findElement(By.xpath("following-sibling::td")).getText();
		return price;
	}

}
