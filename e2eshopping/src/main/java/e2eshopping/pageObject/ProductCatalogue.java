package e2eshopping.pageObject;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import e2eshopping.reusableCode.AbstractComponents;

public class ProductCatalogue extends AbstractComponents {

	WebDriver driver;
	public ProductCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	List<WebElement> productNames = driver.findElements(By.xpath("//div[contains(@class,'mb-3')]/descendant::b"));
	@FindBy(css=".mb-3")
	List<WebElement> productNames;
	
	By productNamesBy = By.cssSelector(".mb-3");
	By addToCartProd = By.cssSelector(".card-body button:last-of-type");
	By elementToWait = By.id("toast-container");
	
	public List<WebElement> getProductList() {
		visibilityOfElement(productNamesBy);
		return productNames;
	}
	
	public WebElement getProductByName(String productName) {
		WebElement prod = getProductList().stream().filter(s->s.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
		return prod;
	}
	
	public void addToCart(String productName) {
		getProductByName(productName).findElement(addToCartProd).click();
		inVisibilityOfElement(elementToWait);
	}
	
}
