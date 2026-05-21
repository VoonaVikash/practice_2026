package Components;

import org.testng.annotations.*;

public class FAB {
	
	@BeforeClass
	public void navFAB() {
		System.out.println("Navigated to FAB component");
	}
	
	@AfterClass
	public void navOut() {
		System.out.println("Navigated to All components");
	}

	@Test(groups={"smoke","regression"})
	public void functionality() {
		System.out.println("FAB Funtionality working");
	}
	
	@Test
	public void design() {
		System.out.println("FAB design working");
	}
	
	@Test
	public void mobile() {
		System.out.println("FAB mobile working");
	}
	
}
