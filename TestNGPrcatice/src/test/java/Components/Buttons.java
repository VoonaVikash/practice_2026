package Components;

import org.testng.annotations.*;

public class Buttons {
	
	@BeforeSuite
	public void docSiteO() {
		System.out.println("GDS page is opened");
	}
	
	@AfterSuite
	public void docSiteC() {
		System.out.println("GDS page is closed");
	}

	@BeforeMethod
	public void navButton() {
		System.out.println("Validating Button");
	}
	
	@Parameters({"URL","username"})
	@Test(groups={"smoke","regression"})
	public void functionality(String URL, String username) {
		System.out.println("Buttons Funtionality working:"+URL+"-"+username);
	}
	
	@Test
	public void design() {
		System.out.println("Buttons design working");
	}
	
	@Parameters({"URL","username"})
	@Test
	public void mobile(String URL, String username) {
		System.out.println("Buttons mobile working:"+URL+"-"+username);
	}
	
	@AfterMethod
	public void navAllCom() {
		System.out.println("Validated Button");
	}
	
}
