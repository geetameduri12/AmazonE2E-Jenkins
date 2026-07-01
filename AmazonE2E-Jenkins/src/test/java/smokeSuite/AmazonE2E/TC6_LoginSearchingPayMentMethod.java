package smokeSuite.AmazonE2E;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.RetryLogic;

public class TC6_LoginSearchingPayMentMethod extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void logintoBuy() throws InterruptedException
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
		   Reporter.log("Clicking on the wishlist");
		   
		   productdetailspage.clickingOnContinueShopping();
		   productdetailspage.clickingOnAddtoCart();
		   Reporter.log("Product successfully added to the cart");
		 
		   CartDetailsPage cartdetailspage = new CartDetailsPage(driver);
		   cartdetailspage.clickingongotocart();
		   Reporter.log("Clicking on go to cart");
		   
		   cartdetailspage.clickingonproceedtobuy();
		   Reporter.log("Clicking on the proceed to buy");
		   
		   CheckOutPage checkoutpage = new CheckOutPage(driver);
		   checkoutpage.cashondelivery();
		   Reporter.log("Clicking on the cash on delivery");
		   
		   checkoutpage.clickinonPaymentMethod();
		   Reporter.log("Clicking on the Paymentmethod");
		   
		   Assert.assertEquals(checkoutpage.verifyTextPaymentmethod(), "Payment method","Sorry conditions did not match");
		  Reporter.log("Test case is pass");
		   
		   
	}
		   
		   
	   
}
