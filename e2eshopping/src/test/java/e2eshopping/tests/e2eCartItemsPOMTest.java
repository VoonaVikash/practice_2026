package e2eshopping.tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import e2eshopping.pageObject.CartPage;
import e2eshopping.pageObject.CheckOutPage;
import e2eshopping.pageObject.ConfirmationPage;
import e2eshopping.pageObject.OrdersPage;
import e2eshopping.pageObject.ProductCatalogue;
import e2eshopping.testComponents.BaseTest;

public class e2eCartItemsPOMTest extends BaseTest{
	
	String product = "ZARA COAT 3";
	
	@Test
	public void submitOrder() throws IOException, InterruptedException
	{
		ProductCatalogue productCatalog = landingPage.loginApp("voonavikas4@gmail.com","V!kash@97"); 	//Login & Product Catalog
		productCatalog.addToCart(product);																//Product added
		CartPage cp = productCatalog.goToCartPage();													//Cart Page
		Boolean match = cp.validateCartItem(product);													//Validated product	
		Assert.assertTrue(match);
		CheckOutPage cpPage = cp.clickCheckOut();														//Checkout page
		cpPage.selectCountry();																			//Selected country
		ConfirmationPage confirmPage =  cpPage.placeOrder();											//Confirmation page
		String confirmMsg = confirmPage.getConfirmMsg();												//Confirmation Message
		Assert.assertTrue(confirmMsg.equalsIgnoreCase("Thankyou for the order."));					
		System.out.println("Order placed successfully!!!");
	}
	
	@Test(dependsOnMethods = "submitOrder")
	public void orderValidation() {
		ProductCatalogue productCatalog = landingPage.loginApp("voonavikas4@gmail.com","V!kash@97");
		OrdersPage ordersPage = productCatalog.goToOrdersPage();
		Assert.assertTrue(ordersPage.verifyOrderDisplayed(product));
		System.out.println("Order Verified successfully!!!");
	}

}
