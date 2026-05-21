package e2eshopping.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import e2eshopping.reusableCode.AbstractComponents;

public class ConfirmationPage extends AbstractComponents{
	
	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	driver.findElement(By.xpath("//table[@id='htmlData']/descendant::h1")).getText()
	@FindBy(xpath="//table[@id='htmlData']/descendant::h1")
	WebElement confirmMsg;
	
	public String getConfirmMsg() {
		return confirmMsg.getText();
	}

}
