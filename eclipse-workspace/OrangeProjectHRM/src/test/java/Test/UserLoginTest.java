package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data.ExcelReader;
import Pages.LoginPage;

public class UserLoginTest extends TestBase{
	
	LoginPage LoginObject ;
	
	@DataProvider(name="ExcelData")
	public Object[][] UserLoginData() throws IOException
	{
		ExcelReader ER = new ExcelReader();
         return  ER.getexcelData();
		
	}
	
	
	
	
	
	
	
	 @ Test (priority = 1, alwaysRun = true,dataProvider = "ExcelData")
	public void userLoginSuccessfully (String admin , String Password )
	{
		LoginObject = new LoginPage(driver);
		
		LoginObject.UserCanLogin(admin, Password);
	
		
		
		
	}

}
