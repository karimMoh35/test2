package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class loginTest extends TestBase{
	
	LoginPage  loginObject;
	
	
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
	

}
