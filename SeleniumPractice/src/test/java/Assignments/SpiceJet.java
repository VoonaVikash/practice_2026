package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.core.selenium.DriverInvoking;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {

		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("div[data-testid=\"one-way-radio-button\"]")).click();
		if (driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
				.getDomAttribute("style").contains("background-color: rgb(238, 238, 238)")) {
			System.out.println("Return date disabled");
		} else {
			System.out.println("Return date enabled");
		}
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='Ayodhya Maharishi Valmiki Intl Airport']")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		driver.findElement(By.cssSelector("div[class*='r-y47klf']")).click();
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		Thread.sleep(3000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement(By.xpath("//div[text()='USD']")).click();
		driver.findElement(By.xpath("//div[text()='Armed Forces']")).click();
		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();

	}

}
