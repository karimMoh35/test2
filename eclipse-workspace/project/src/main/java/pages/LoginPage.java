package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Inspecting Elements
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_UserName")
	WebElement EmailTXT;
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_Password")	
	WebElement PasswordTXT;
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerLogin_LoginForm_LoginButton")
	WebElement LoginButton;
	
	
	// inspect Methods
	
	public void UserCanLogin(String Email, String Password)
	{
		EmailTXT.sendKeys(Email);
		PasswordTXT.sendKeys(Password);
		LoginButton.click();
		
		
		
	}
}
