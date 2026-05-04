package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.core.selenium.DriverInvoking;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String selectedCheckBox = "";
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='checkbox-example']/descendant::label[2]/input"));
		checkBox.click();
		if(checkBox.isSelected()) {
			selectedCheckBox = driver.findElement(By.xpath("//*[@id='checkbox-example']/descendant::label[2]")).getText();
		}
		System.out.println(selectedCheckBox);
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(selectedCheckBox);
		driver.findElement(By.id("name")).sendKeys(selectedCheckBox);
		driver.findElement(By.id("alertbtn")).click();
		Assert.assertTrue(driver.switchTo().alert().getText().contains(selectedCheckBox));
	}

}
