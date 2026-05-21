package e2eshopping.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import e2eshopping.pageObject.CartPage;
import e2eshopping.pageObject.ProductCatalogue;
import e2eshopping.testComponents.BaseTest;
import e2eshopping.testComponents.RetryClass;

public class e2eCartItemsErrorValidationTest extends BaseTest{

	@Test(groups={"ErrorValidation"}, retryAnalyzer=RetryClass.class)
	public void loginErrorValidation() throws IOException, InterruptedException
	{
		landingPage.loginApp("voonavikas4@gmail.com","V!ksh@97"); 	//Login & Product Catalog
		Assert.assertTrue("Incorrect email password.".equals(landingPage.getErrorMessage()));
	}
	
	@Test(groups={"ErrorValidation"})
	public void productErrorValidation() {
		String product = "ZARA COAT 3";
		ProductCatalogue productCatalog = landingPage.loginApp("voonavikas4@gmail.com","V!kash@97"); 	//Login & Product Catalog
		productCatalog.addToCart(product);																//Product added
		CartPage cp = productCatalog.goToCartPage();													//Cart Page
		Boolean match = cp.validateCartItem(product);													//Validated product	
		Assert.assertTrue(match);
	}

}
