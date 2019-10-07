package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPage extends PageBase{

	public DownloadPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="button.btn.btn-primary")
	WebElement WindowsInstallerBTN ;
	
	@FindBy(css="button.btn.btn-primary.btn-lg")
	WebElement WindowsDownloadBTN ;
	
	
	 public void UserCanDownloadFiles ()
	 {
		 WindowsInstallerBTN.click();
		 WindowsDownloadBTN.click();
	 }
}
