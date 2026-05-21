package e2eshopping.reusableCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import e2eshopping.pageObject.CartPage;
import e2eshopping.pageObject.OrdersPage;

public class AbstractComponents {

	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	@FindBy(css="[routerlink*='cart']")
	WebElement cartButton;
	
	@FindBy(css="[routerlink*='orders']")
	WebElement ordersButton;
	
	@FindBy(tagName = "table")
	WebElement ordersTable;
	
	public void visibilityOfElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public void visibilityOfWebElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void inVisibilityOfElement(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	}
	
	public CartPage goToCartPage() {
		cartButton.click();
		return new CartPage(driver);
	}
	
	public OrdersPage goToOrdersPage() {
		ordersButton.click();
		visibilityOfWebElement(ordersTable);
		return new OrdersPage(driver);
	}
}
