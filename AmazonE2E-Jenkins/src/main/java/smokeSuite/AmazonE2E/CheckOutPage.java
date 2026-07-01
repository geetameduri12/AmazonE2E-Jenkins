package smokeSuite.AmazonE2E;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage 
{
	private WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
@FindBy(xpath ="//div[@id='checkout-paymentOptionPanel']/descendant::span[text()='Cash on Delivery/Pay on Delivery']/parent::span/parent::label/input")
private WebElement cashondelivery;

@FindBy(xpath="//span[@id='checkout-secondary-continue-button-id']")
private WebElement clickonpayment;

@FindBy(xpath="//div[@class='a-column a-span8 a-spacing-base']/h2[@class='a-size-medium a-spacing-none a-text-bold']")
private WebElement textpaymentmethod;

public void cashondelivery()
{
	wait.until(ExpectedConditions.elementToBeClickable(cashondelivery));
	cashondelivery.click();
}
public void clickinonPaymentMethod()
{
	wait.until(ExpectedConditions.elementToBeClickable(clickonpayment));
	clickonpayment.click();
}

public CheckOutPage(WebDriver driver)
{
	this.driver=driver;
	 PageFactory.initElements(driver,this);
}
public String verifyTextPaymentmethod()
{
	String actual = textpaymentmethod.getText();
	return actual;
	
}

}
