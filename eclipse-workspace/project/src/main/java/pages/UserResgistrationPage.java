package pages;                    // Page Objects class = WebElemnts Objects + Methods 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserResgistrationPage extends PageBase {

	public UserResgistrationPage(WebDriver driver) {
		super(driver);
		// to inherit from a parent class that have constructor you should inherit from it with a super constructor 
		
	}
	
	// inspect Elements 
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName")
	WebElement First_NameTXT;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtLastName")
	WebElement Last_NameTXT;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Email")
	WebElement Email_Txt;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_UserName")
	WebElement UserName_TXT;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_Password")
	WebElement Password_TXT;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_ConfirmPassword")
	WebElement ConfirmPassword_TXT;
	
	@FindBy(id="ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm___CustomNav0_StepNextButton")
	WebElement RegisterBtn;

	
	// Method that is working on the created objects above 
	
	public void UserRegistrationPage (String FirstName , String LastName , String Email , String UserName , String Password)
	{
		First_NameTXT.sendKeys(FirstName);
		Last_NameTXT.sendKeys(LastName);
		Email_Txt.sendKeys(Email);
		UserName_TXT.sendKeys(UserName);            // replace all settext,clik by the 2 methods sendkeys,click at PageBase 
		Password_TXT.sendKeys(Password);
		ConfirmPassword_TXT.sendKeys(Password);
		RegisterBtn.click();
	/*	
		Settext(First_NameTXT, FirstName);
		Settext(Last_NameTXT, LastName);           // call method settext to send values 
		Settext(Email_Txt, Email);
		Settext(UserName_TXT, UserName);
		Settext(Password_TXT, Password);
		Settext(ConfirmPassword_TXT, Password);
	    clickButton(RegisterBtn);
		
		// while sending data to the fields of any page don't put hardcoded data , just refer to the data by arguments sent to the function 
		*/
			
	}
	
	
}
