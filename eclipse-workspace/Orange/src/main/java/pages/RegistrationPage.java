package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase
{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

  
	@FindBy(name= "first_names")
	WebElement FirstNameTXT;
	
	@FindBy(name="last_name")
	WebElement LastNameTXT;
	
	@ FindBy(id="country")
	WebElement x ;
	
	@FindBy(name="company")
	WebElement CompanyTXT;
		
	@FindBy(name="email")
	WebElement EMailTXT;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/form/table/tbody/tr[7]/td/input")
	WebElement LoginBtn;
	
	@ FindBy(linkText = "Home")
	WebElement HomeBtn ;
	 public void UserCanRegister(String FirstName , String LastName , String Value, String Company  ,String Email )
     {
		 FirstNameTXT.sendKeys(FirstName);
		 LastNameTXT.sendKeys(LastName);
          CompanyTXT.sendKeys(Company);
          select(x, Value);
         EMailTXT.sendKeys(Email);
         LoginBtn.click();
         
	 }
  
	 public void ReturnToHomePage ()
	 {
		 HomeBtn.click();
	 }

	
}