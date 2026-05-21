package e2eshopping.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import e2eshopping.reusableCode.AbstractComponents;

public class CheckOutPage extends AbstractComponents{
	
	WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("ind");
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement country;
	
//	driver.findElement(By.xpath("//section[contains(@class,'ta-results')]/button[2]")).click();
	@FindBy(xpath="//section[contains(@class,'ta-results')]/button[2]")
	WebElement india;
	
//	driver.findElement(By.linkText("PLACE ORDER")).click();
	@FindBy(linkText="PLACE ORDER")
	WebElement placeOrder;
	
	By elementToWait = By.cssSelector("[class*='ta-results']");
	
	public void selectCountry() {
		country.sendKeys("ind");
		visibilityOfElement(elementToWait);
		india.click();
	}
	
	public ConfirmationPage placeOrder() {
		placeOrder.click();
		return new ConfirmationPage(driver);
	}

}