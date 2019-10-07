package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@ FindBy(xpath = "//*[@id=\"m_ver_menu\"]/ul/li[4]/a/span/span")
       WebElement CR_Menu 	;
	
	@ FindBy(xpath = "//*[@id=\"m_ver_menu\"]/ul/li[4]/nav/ul/li[1]/a/span/span")
    WebElement MyChangeRequests 	;
	
	@ FindBy(xpath = "//*[@id=\"m_ver_menu\"]/ul/li[4]/nav/ul/li[2]/a/span/span")
    WebElement CR_RequiringActions 	;
	
	@ FindBy(xpath = "//*[@id=\"m_ver_menu\"]/ul/li[4]/nav/ul/li[4]/a/span/span")
    WebElement AllRequests 	;
	
	
	
	public void UserCanselect_MyCRS()
	{
		CR_Menu.click();
		MyChangeRequests.click();
		
		
	}
	
	public void UserCanselect_CR_RequiringActions()
	{
		CR_Menu.click();
		CR_RequiringActions.click(); 
			
	}
	

	public void UserCanselect_AllRequests()
	{
		CR_Menu.click();
		AllRequests.click(); 
			
	}
	
	
}
