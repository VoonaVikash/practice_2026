package Patterns;

import org.testng.annotations.*;

public class Dashboard {
	
	
	@Test(groups={"smoke"})
	public void functionality() {
		System.out.println("Dashboard Funtionality working");
	}
	
	@Test
	public void design() {
		System.out.println("Dashboard design working");
	}
	
	@Parameters("URL")
	@Test
	public void mobile(String URL) {
		System.out.println("Dashboard mobile working:"+URL);
	}

}
