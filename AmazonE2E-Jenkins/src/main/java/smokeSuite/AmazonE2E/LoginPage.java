package smokeSuite.AmazonE2E;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	private WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 @FindBy(name="email")
 private WebElement Username;
 
 @FindBy(id="continue")
 private WebElement continueButton;
 
 @FindBy(name="password")
 private WebElement Password;
 
 @FindBy(id="signInSubmit")
 private WebElement signin;
 
 @FindBy(xpath="//div[@id='claim-collection-container']/h1")
 private WebElement textLoginPage;
 
 public void enterUsername()
 {
	 wait.until(ExpectedConditions.visibilityOf(Username));
	 Username.sendKeys("8500448418");
 }
 public void clickonContinue() throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(continueButton));
	 continueButton.click();
	 
 }
 public void enterPassword()
 {
	 wait.until(ExpectedConditions.visibilityOf(Password));
	 Password.sendKeys("Grps@2007");
 }
 public void clickonSignin() throws InterruptedException
 {
	 wait.until(ExpectedConditions.elementToBeClickable(signin));
	 signin.click();
	 
 }
 
 public LoginPage (WebDriver driver)
 {
	  PageFactory.initElements(driver, this);
 }
 
//doing the nextline for assertion sign in or create account
 public String verifyTheTextLoginPage() 
 {
	 String actual = textLoginPage.getText();
	 return actual;
 }
 
}
