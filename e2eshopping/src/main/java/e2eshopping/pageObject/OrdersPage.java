package e2eshopping.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import e2eshopping.reusableCode.AbstractComponents;

public class OrdersPage extends AbstractComponents{

	WebDriver driver;
	
	public OrdersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table/descendant::tr/td[2]")
	List<WebElement> productNames;
	
	public Boolean verifyOrderDisplayed(String product) {
		Boolean match = productNames.stream().anyMatch(s->s.getText().equalsIgnoreCase(product));
		return match;
	}

}
