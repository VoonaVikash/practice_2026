package e2eshopping.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import e2eshopping.pageObject.CartPage;
import e2eshopping.pageObject.CheckOutPage;
import e2eshopping.pageObject.ConfirmationPage;
import e2eshopping.pageObject.OrdersPage;
import e2eshopping.pageObject.ProductCatalogue;
import e2eshopping.testComponents.BaseTest;

public class e2eCartItemsDataProvider extends BaseTest{
	
//	String product = "ZARA COAT 3";
	
	@Test(dataProvider = "getData", groups = {"Data Validation"})
	public void submitOrder(HashMap<String, String> userData) throws IOException, InterruptedException
	{
		ProductCatalogue productCatalog = landingPage.loginApp(userData.get("email"), userData.get("password"));
		productCatalog.addToCart(userData.get("product"));
		CartPage cp = productCatalog.goToCartPage();
		Boolean match = cp.validateCartItem(userData.get("product"));
		Assert.assertTrue(match);
		CheckOutPage cpPage = cp.clickCheckOut();
		cpPage.selectCountry();
		ConfirmationPage confirmPage =  cpPage.placeOrder();
		String confirmMsg = confirmPage.getConfirmMsg();
		Assert.assertTrue(confirmMsg.equalsIgnoreCase("Thankyou for the order."));					
		System.out.println("Order placed successfully!!!");
	}
	
	@Test(dependsOnMethods = "submitOrder", dataProvider = "getData")
	public void orderValidation(HashMap<String, String> userData) {
		ProductCatalogue productCatalog = landingPage.loginApp(userData.get("email"),userData.get("password"));
		OrdersPage ordersPage = productCatalog.goToOrdersPage();
		Assert.assertTrue(ordersPage.verifyOrderDisplayed(userData.get("product")));
		System.out.println("Order Verified successfully!!!");
	}
	
//	@DataProvider
//	public Object[][] getData() {
//		return new Object[][] {{"voonavikas4@gmail.com","V!kash@97","ZARA COAT 3"}, {"mr.voonavikash@gmail.com","V!cky@71","iphone 13 pro"}};
//	}
	
//	HashMap<String, String> user1 = new HashMap<String, String>();
//	user1.put("email", "voonavikas4@gmail.com");
//	user1.put("password", "V!kash@97");
//	user1.put("product", "ZARA COAT 3");
//	
//	HashMap<String, String> user2 = new HashMap<String, String>();
//	user2.put("email", "mr.voonavikash@gmail.com");
//	user2.put("password", "V!cky@71");
//	user2.put("product", "iphone 13 pro");

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\e2eshopping\\TestData\\UserData.json");
		return new Object[][] {{data.get(0)}, {data.get(1)}};
	}
	
}
