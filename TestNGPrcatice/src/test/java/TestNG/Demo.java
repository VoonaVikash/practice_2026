package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority = 2)
	public void Test1() {
		System.out.println("Hello!");
	}
	
	@DataProvider
	public Object[] data() {
		return new Object[] {"Vikash", "Srija", "Jyothi", "Tirumala"};
	}
	
	@Test(dataProvider = "data", priority = 1)
	public void print(String name) {
		System.out.println(name);
	}

}
