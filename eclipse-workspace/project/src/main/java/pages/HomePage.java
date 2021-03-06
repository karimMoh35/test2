package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText ="Register" )
	WebElement RegisterLink ;
	// inspect elements and save them in objects using annotation findBy as you use pagefactory 
    @FindBy(linkText = "Log in")
    WebElement LoginLink ;
	
	public void OpenRegisterationPage()
	{
		RegisterLink.click();
	}
	
	public void OpenLoginPage()
	{
		LoginLink.click();
	}
}