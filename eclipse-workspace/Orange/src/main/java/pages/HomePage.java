package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
            
	@FindBy(linkText = "Register for a Guided Tour")
	WebElement RegisterLink;
	
	@FindBy(linkText = "Download")
	WebElement DownloadLink;
	
	
	public void ClickRegisterLink()
	{
		RegisterLink.click();
	}
	
	public void ClickDownload()
	{
		DownloadLink.click();
	}
	 
	
	
}
