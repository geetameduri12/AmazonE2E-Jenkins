package smokeSuite.AmazonE2E;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
 private WebDriver driver;
 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 
 @FindBy(xpath="//span[@class='nav-line-2 ']")
  private WebElement accountsAndList; 
 
 @FindBy(xpath ="//a[@data-nav-ref='nav_signin']")
private WebElement signin;
 
 @FindBy(xpath="//a[@id='nav-item-signout']/span[@class='nav-text']")

//span[text()='Sign Out']
 private WebElement signout;
 
 @FindBy(xpath="//input[@id='twotabsearchtextbox']")
private WebElement search;
 
 public void hoveroverOnAccountList(WebDriver driver)
 { 
	 wait.until(ExpectedConditions.visibilityOf(accountsAndList));
	 Actions a1 = new Actions(driver);
	 a1.moveToElement(accountsAndList).perform();
 }
 public void clickingOnSignin() throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(signin));
	 signin.click();
 }
 public void searchingtheproduct() throws InterruptedException
 {
	 wait.until(ExpectedConditions.visibilityOf(search));
	 search.sendKeys("Shoes"+Keys.ENTER);
	
 }
 
 public void signout(WebDriver driver) throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(signout));
	Actions a1 = new Actions(driver);
	 a1.moveToElement(accountsAndList).perform();
	 signout.click();
	
 }
 
 
  public HomePage (WebDriver driver)
  {
	  this.driver=driver; //using this keyword
	  PageFactory.initElements(driver, this);
  }
  
  
  
}
