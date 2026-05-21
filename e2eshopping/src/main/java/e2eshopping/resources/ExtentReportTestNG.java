package e2eshopping.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestNG {
	
	public static ExtentReports getReport() {
		String filePath = System.getProperty("user.dir")+"//reports//results.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(filePath);
		reporter.config().setDocumentTitle("E2E shopping result");
		reporter.config().setReportName("Test runs");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vikash Voona");
		return extent;
	}

}
