package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@ FindBy(name="usernameOrEmailAddress")
    WebElement 	NameTxt;
	
	@ FindBy(name="password")
    WebElement PasswordTxt;
	
	@ FindBy(xpath = "//*[@id=\"m_login\"]/div[1]/div/div/div[1]/div[2]/form/div[3]/div[1]/label/span")
    WebElement Remember ;
	
	//@ FindBy (className = "btn btn-primary m-btn m-btn--pill m-btn--custom m-btn--air")
	//  WebElement LoginBTN ;
	
	@ FindBy (xpath = "/html/body/div[1]/div/a")
	WebElement Got_itBTN;
	
	
	
	
  public void UserCanLogin(String Name , String Password)
	{
		NameTxt.sendKeys(Name);
		PasswordTxt.sendKeys(Password);
		
		Remember.click();
		//LoginBTN.click();
	}
  
 
	
}
