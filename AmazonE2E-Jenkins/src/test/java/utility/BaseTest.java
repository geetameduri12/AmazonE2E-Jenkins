package utility;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest extends ListenersLogic
{
	@Parameters("browser")
	
   @BeforeMethod
   public void launchbrowser(String browser) throws InterruptedException
   {
	   if(browser.equals("chrome"))
	   {
		   driver = new ChromeDriver();
	   }
	   if(browser.equals("firefox"))
	   {
		   driver = new FirefoxDriver();
	   }
	   if(browser.equals("edge"))
	   {
		   driver = new EdgeDriver();
	   }
	   driver.get("https://www.amazon.in");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
   }
   @AfterMethod
   public void quitBrowser() throws InterruptedException
   {
	   driver.quit();
	   Thread.sleep(3000);
   }
}


