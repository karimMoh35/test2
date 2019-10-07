package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(id="txtUsername")
	WebElement UserNameTxt;
	
	@FindBy(id="txtPassword")
	WebElement PasswordTxt;
	
	@FindBy(id="btnLogin")
	WebElement LoginBtn;
	
	public void UserCanLogin(String UserName, String Password )
	{
		UserNameTxt.sendKeys(UserName);
		PasswordTxt.sendKeys(Password);
		LoginBtn.click();
		
	}
	

}
