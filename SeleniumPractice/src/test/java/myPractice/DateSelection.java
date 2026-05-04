package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.core.selenium.DriverInvoking;

public class DateSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month = "10";
		String date = "31";
		String year = "2026";
		String[] fullDate = {month,date,year};
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("div[class='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'react-calendar__year-view__months__month')]["+month+"]")).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> dates= driver.findElements(By.cssSelector("input.react-date-picker__inputGroup__input"));
		for(int i=0;i<dates.size();i++) {
			System.out.println(dates.get(i).getAttribute("value"));
			Assert.assertEquals(dates.get(i).getAttribute("value"), fullDate[i]);
		}
		List<WebElement> selectedDate = driver.findElements(By.cssSelector("input.react-date-picker__inputGroup__input"));
		for(int i=0; i<selectedDate.size(); i++) {
//			System.out.println(fullDate[i]+" "+selectedDate.get(i).getAttribute("value"));
			Assert.assertEquals(fullDate[i], selectedDate.get(i).getAttribute("value"));
		}
		driver.close();
	}

}
