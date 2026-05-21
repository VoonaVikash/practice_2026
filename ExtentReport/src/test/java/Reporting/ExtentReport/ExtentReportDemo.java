package Reporting.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	
	ExtentReports extent;
	
	@Test
	public void initializeBrowser() {
		ExtentTest test = extent.createTest("Initialize Browser");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		test.fail("Test case failed");
		extent.flush();
	}
	
	@BeforeMethod
	public void extentReport() {
		//Extent Spark Report, Extent Report
		String filePath = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(filePath);
		report.config().setDocumentTitle("Extent practice");
		report.config().setReportName("Example Test run");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Vikash Voona");
	}
}