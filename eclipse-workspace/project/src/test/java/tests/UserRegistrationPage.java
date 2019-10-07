package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserResgistrationPage;

public class UserRegistrationPage  extends TestBase
{
	HomePage  HomeObject;
	UserResgistrationPage RegisterObject;
	LoginPage LoginObject;

	
	@Test (priority=1)
public void UserCanRegisterSuccessfully()
{
		HomeObject= new HomePage(driver);
		HomeObject.OpenRegisterationPage();	
		
		RegisterObject = new UserResgistrationPage(driver);
		RegisterObject.UserRegistrationPage("mahmoud", "mohamed", "mahmoud30@yahoo.com", "meky", "113245k@D");
		
		
		
}  
/*	
	public void logout()
	{
		
	}
	
	
	
	
	
	public void RegisteredUserCanLogin() 
	{
		HomeObject= new HomePage(driver);
		HomeObject.OpenLoginPage();
		
		LoginObject =new LoginPage(driver);
		LoginObject.UserCanLogin("HomeObject= new HomePage(driver)", "113245k@D");
		
		
	}
	
*/
}
