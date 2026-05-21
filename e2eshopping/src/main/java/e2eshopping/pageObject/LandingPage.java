package e2eshopping.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import e2eshopping.reusableCode.AbstractComponents;

public class LandingPage extends AbstractComponents{
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this); //Initializes all Web elements  
	}
	
//	WebElement email = driver.findElement(By.id("userEmail"));	
	@FindBy(id="userEmail")
	WebElement email;
	
//	driver.findElement(By.id("userPassword"))
	@FindBy(id="userPassword")
	WebElement password;
	
//	driver.findElement(By.cssSelector("#login"))
	@FindBy(css="#login")
	WebElement login;
	
	@FindBy(xpath="//div[@aria-label='Incorrect email or password.']")
	WebElement errorMsg;
	
	public ProductCatalogue loginApp(String emailV, String passwordV) {
		visibilityOfElement(By.id("login"));
		email.sendKeys(emailV);
		password.sendKeys(passwordV);
		login.click();
		return new ProductCatalogue(driver);
	}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String getErrorMessage() {
		visibilityOfWebElement(errorMsg);
		return errorMsg.getText();
	}

}
