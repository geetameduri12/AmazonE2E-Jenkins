package smokeSuite.AmazonE2E;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC1_LoginToAmazon extends BaseTest
{
   @Test(retryAnalyzer=RetryLogic.class)
   public void validcredentials() throws InterruptedException
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
	   
	   Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry title could not match");
       Reporter.log("Test case is pass");
   }
}
