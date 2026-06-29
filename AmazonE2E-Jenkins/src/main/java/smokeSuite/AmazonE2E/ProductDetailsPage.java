package smokeSuite.AmazonE2E;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage 
{
	private WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 @FindBy(xpath ="//span[@id='wishListMainButton']")
private WebElement wishlist;
 
 @FindBy(xpath="//input[@aria-label='Continue shopping']")
private WebElement continueshopping;
 
 @FindBy(xpath="//input[@id='add-to-cart-button']")
private WebElement clickonaddtocart;
 
 @FindBy(xpath="//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
 private WebElement textProductPage;
 
 public void clickonWishList() throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(wishlist));
	 wishlist.click();
	
 }
 public void clickingOnContinueShopping() throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(continueshopping));
	 continueshopping.click();
	 
 }
 public void clickingOnAddtoCart() throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(clickonaddtocart));
	 clickonaddtocart.click();
	 
 }
 
 public ProductDetailsPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 
 public String verifytheTextProductPage()
 {
	 String actual = textProductPage.getText();
	return actual;
	 
 }
}
