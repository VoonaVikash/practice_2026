package Patterns;

import org.testng.annotations.*;

public class HeadingText {

	@Test(groups={"smoke"})
	public void functionality() {
		System.out.println("HeadingText Funtionality working");
	}
	
	@Test
	public void design() {
		System.out.println("HeadingText design working");
	}
	
	@Test
	public void mobile() {
		System.out.println("HeadingText mobile working");
	}
	
}
