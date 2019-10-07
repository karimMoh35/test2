package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data.ExcelReader;
import pages.DownloadPage;
import pages.HomePage;
import pages.RegistrationPage;

public class RegistrationTest extends TestBase
{
   HomePage HomeObject;
   RegistrationPage  RegisterObject;
   DownloadPage   DownloadObject;
   
   
   @DataProvider(name="ExcelData")
   public Object[][] userregistrationdata() throws IOException
   {
	   // read from excel 
	   ExcelReader ER = new ExcelReader();
	   return ER.getexcelData();
   }
   
   
   
   
   
   
   
   @ Test (priority = 1, alwaysRun = true,dataProvider = "ExcelData")
   public void UserRegistration(  String FirstName , String LastName , String Value, String Company  ,String Email )
   {
	   HomeObject = new HomePage(driver);
	   HomeObject.ClickRegisterLink();
	   
	   RegisterObject = new RegistrationPage(driver);
	   RegisterObject.UserCanRegister(FirstName, LastName, Value, Company,Email);
	   RegisterObject.ReturnToHomePage();
	   
	   
	 
   }
}
	/*
   @ Test(priority = 2)
     public void downloadfiles()
   {
	   HomeObject = new HomePage(driver);
	   HomeObject.ClickDownload();
	   
	   DownloadObject = new DownloadPage(driver); 
	   DownloadObject.UserCanDownloadFiles();
	   
   }
	*/
   
   

