package smokeSuite.AmazonE2E;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class TC2_LoginToAmazonAndLogout extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	   public void loginandLogout() throws InterruptedException
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
		   
		   homepage.signout(driver);
		   Reporter.log("signout is  successfull");
		   
		   loginpage.verifyTheTextLoginPage();
		   
		   Assert.assertEquals(loginpage.verifyTheTextLoginPage(), "Sign in or create account","Sorry we count not match the same");
		   Reporter.log("Test case is pass");
		   
		   
		   
	   }
}
