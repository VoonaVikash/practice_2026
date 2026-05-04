import org.openqa.selenium.WebDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverInvoking di = new DriverInvoking();
		WebDriver driver = di.callDriver("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}