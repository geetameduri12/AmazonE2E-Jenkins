package smokeSuite.AmazonE2E;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Tc4_LoginSearchingWishListAddToCart extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	   public void logintoCart() throws InterruptedException
	   {
		Reporter.log("Browser launched successfully");
		   HomePage homepage = new HomePage(driver);
		   homepage.hoveroverOnAccountList(driver);
		   homepage.clickingOnSignin();
		   
		   LoginPage loginpage = new LoginPage(driver);
		   loginpage.enterUsername();
		   loginpage.clickonContinue();
		   loginpage.enterPassword();
		   loginpage.clickonSignin();
		   Reporter.log("Login is done successfully");
		   
		   homepage.searchingtheproduct();
		   Reporter.log("Searching the product");
		   
		   SearchResultPage searchresultpage = new SearchResultPage(driver);
		   searchresultpage.clickingOn1stProduct(driver);
		   Reporter.log("Clicking on the FirstProduct");
		   
		   ProductDetailsPage productdetailspage = new ProductDetailsPage(driver);
		   productdetailspage.clickonWishList();
		   productdetailspage.clickingOnContinueShopping();
		   productdetailspage.clickingOnAddtoCart();
		   
		   Assert.assertEquals(productdetailspage.verifytheTextProductPage(), "Added to cart","Sorry conditions did not match");
		  Reporter.log("Test case is pass");
		   
	   }
}
