package Tests;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.Approval;
import Pages.Create_NewCR;
import Pages.HomePage;
import Pages.LoginPage;

public class Create_CR extends TestBase {

	LoginPage  loginObject;
	HomePage homeObject;
	Create_NewCR createNewCR_Object;
    Approval   Approval_Object;
    String CodeNumber;
	@Test (priority=1)
	public void usercanLoginSuccessfully () throws InterruptedException {


		loginObject = new LoginPage(driver);

		Thread.sleep(3000);

		WebElement btnAlert = driver.findElement(By.xpath("/html/body/div[1]/div/a"));
		btnAlert .click();

		WebElement element = driver.findElement(By.xpath("//*[@id=\"m_login\"]/div[1]/div/div/div[1]/div[2]/form/div[4]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 
		loginObject.UserCanLogin("admin", "123456");
		element.click();
	}




	@Test (priority=2)
	public void  Userselect_MyCRS () 
	{
		homeObject = new HomePage(driver);
	    homeObject.UserCanselect_MyCRS();
        
	}

	@Test (priority=3)
	public void  CR_Creation () throws InterruptedException, AWTException 
	{
		createNewCR_Object = new Create_NewCR(driver);
		createNewCR_Object.userCreate_NEW_CR();
		Thread.sleep(3000);
	 	driver.navigate().back();
	 	driver.navigate().forward();
	 	WebElement Code = driver.findElement(By.xpath("//*[@id=\"ChangeRequestInformationsTab\"]/div/div[1]/div[1]/span[8]"));
	 	CodeNumber =Code.getText();
	 	System.out.println(CodeNumber);

	}
	@ Test(priority =4)
	
	public void CR_Approval  ( ) throws InterruptedException, AWTException
	{
		Approval_Object = new Approval(driver);
		Approval_Object.makingApprovalby_assessor(CodeNumber);
		Approval_Object.makingApprovalby_Endorser(CodeNumber);
		Approval_Object.makingApprovalby_EndorserFinal(CodeNumber);
		Approval_Object.makingApprovalby_FinalApproval(CodeNumber);
	}
	
	
	}
	 

