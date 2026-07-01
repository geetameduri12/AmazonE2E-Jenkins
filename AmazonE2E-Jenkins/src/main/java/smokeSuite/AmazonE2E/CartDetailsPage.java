package smokeSuite.AmazonE2E;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartDetailsPage
{
	private WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
@FindBy(xpath="//span[@id='sw-gtc']")
private WebElement gotocart;

@FindBy(xpath="//span[@id='sc-buy-box-ptc-button']")
private WebElement proceedtobuy;

@FindBy(xpath="//h2[@id='sc-active-items-header']")
private WebElement textshoppingtocart;

public void clickingongotocart()
{
	wait.until(ExpectedConditions.elementToBeClickable(gotocart));
	gotocart.click();
}

public void clickingonproceedtobuy()
{
	 wait.until(ExpectedConditions.elementToBeClickable(proceedtobuy));
	 proceedtobuy.click();	 
}

public CartDetailsPage(WebDriver driver)
{
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
}

public String verifytheTextShoppingcart()
{
	String actual = textshoppingtocart.getText();
	return actual;
	
}



}
