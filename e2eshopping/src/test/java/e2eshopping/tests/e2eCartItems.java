package e2eshopping.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e2eCartItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item = "iphone 13 pro";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//Log in
		driver.findElement(By.id("userEmail")).sendKeys("voonavikas4@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("V!kash@97");
		driver.findElement(By.cssSelector("#login")).click();
		
		//Home page
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'mb-3')]")));
		List<WebElement> productNames = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod = productNames.stream().filter(s->s.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(item)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		List<WebElement> cartItems = driver.findElements(By.xpath("//*[@class='cartSection']/h3"));
		Boolean added = cartItems.stream().anyMatch(s->s.getText().equalsIgnoreCase(item));
		Assert.assertTrue(added);
		driver.findElement(By.cssSelector("li[class='totalRow'] button")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("ind");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='ta-results']")));
		driver.findElement(By.xpath("//section[contains(@class,'ta-results')]/button[2]")).click();
		driver.findElement(By.linkText("PLACE ORDER")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//table[@id='htmlData']/descendant::h1")).getText().equalsIgnoreCase("Thankyou for the order."));
		System.out.println("Order placed successfully!!!");
		driver.quit();
	}

}
