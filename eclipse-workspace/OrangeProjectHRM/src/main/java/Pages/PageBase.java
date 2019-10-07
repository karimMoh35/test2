package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
protected WebDriver driver;
	
	// create constructor to initialize Elements (driver)
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);       // this refer to the same class we are working on it
	}

	// making method for clicking and sending values to the field 
	
		protected static  void clickButton	(WebElement Button)
		{
			Button.click();
		}
		
		protected static  void Settext (WebElement TextElement , String Value)
		{
			TextElement.sendKeys(Value);
			
		}
		 
		protected static void select (WebElement x ,String Value ) {
			Select y = new Select (x) ;
			y.selectByValue(Value);
			
		}
		
	}





