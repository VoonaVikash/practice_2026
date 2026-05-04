package Assignments;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.selenium.DriverInvoking;

public class OnlineShopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] cartProductsArray = {"Cucumber","Beans","Apple"};
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		List<WebElement> allProducts = driver.findElements(By.cssSelector("div[class='product']"));
		List<String> cartProductsList = Arrays.asList(cartProductsArray);
		for(int i=0;i<allProducts.size();i++) {
			if(cartProductsList.contains(allProducts.get(i).getText().split("-")[0].trim())) {
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
			}
		}
		
	}
}
