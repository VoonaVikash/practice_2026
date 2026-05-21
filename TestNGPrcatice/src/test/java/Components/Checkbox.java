package Components;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Checkbox {

	@Parameters("URL")
	@Test(groups={"smoke","regression"})
	public void functionality(String URL) {
		System.out.println("Checkbox Funtionality working:"+URL);
	}
	
	@Parameters("URL")
	@Test
	public void design(String URL) {
		System.out.println("Checkbox design working:"+URL);
	}
	
	@Test
	public void mobile() {
		System.out.println("Checkbox mobile working");
	}
	
}
