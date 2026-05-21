package e2eshopping.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import e2eshopping.reusableCode.AbstractComponents;

public class CartPage extends AbstractComponents {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	driver.findElement(By.cssSelector("li[class='totalRow'] button")).click();
	@FindBy(css="li[class='totalRow'] button")
	WebElement checkoutButton;
	
//	List<WebElement> cartItems = driver.findElements(By.xpath("//*[@class='cartSection']/h3"));	
	@FindBy(xpath="//*[@class='cartSection']/h3")
	List<WebElement> cartItems;
	
	public Boolean validateCartItem(String product) {
		Boolean match = cartItems.stream().anyMatch(s->s.getText().equalsIgnoreCase(product));
		return match;
	}
	
	public CheckOutPage clickCheckOut() {
		checkoutButton.click();
		CheckOutPage cpPage = new CheckOutPage(driver);
		return cpPage;
	}
	
}
