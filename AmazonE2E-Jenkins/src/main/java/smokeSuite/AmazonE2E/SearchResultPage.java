package smokeSuite.AmazonE2E;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage 
{
	private WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 @FindBy(xpath="//a[@class='a-link-normal s-no-outline']")
 private List <WebElement> product;
 
 public void clickingOn1stProduct(WebDriver driver) throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(product.get(0)));
	 product.get(0).click();
	 
	Set <String> pcid = driver.getWindowHandles();
	Iterator <String> pc =pcid.iterator();
	String parentid = pc.next();
	 String childid = pc.next();
	 driver.switchTo().window(childid);
 }
   
 public SearchResultPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
}
