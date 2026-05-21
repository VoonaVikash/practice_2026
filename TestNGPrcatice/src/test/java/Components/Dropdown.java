package Components;

import org.testng.annotations.*;


public class Dropdown {
	
	@BeforeTest
	public void formsAvailable() {
		System.out.println("Forms section is available");
	}
	
	@AfterTest
	public void formsClosed() {
		System.out.println("Forms section is closed");
	}

	@Test(groups={"smoke","regression"})
	public void functionality() {
		System.out.println("Dropdown Funtionality working");
	}
	
	@Test
	public void design() {
		System.out.println("Dropdown design working");
	}
	
	@Test
	public void mobileIOS() {
		System.out.println("Dropdown IOS mobile working");
	}
	
	@Test
	public void mobileAndroid() {
		System.out.println("Dropdown android working");
	}
}
