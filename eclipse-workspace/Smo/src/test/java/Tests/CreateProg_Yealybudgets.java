package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.CreateProgBudget_Yearly;
import Pages.HomePage;
import Pages.LoginPage;

public class CreateProg_Yealybudgets  extends TestBase{

	LoginPage  loginObject;
	HomePage homeObject;
	CreateProgBudget_Yearly     createprog_yearly_Object;

	@Test(priority = 1)
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

	@Test(priority = 2)
	public void UsermakeProgYearlySuccessfully()
	{
		homeObject = new HomePage(driver);
		homeObject.UserCanMake_ProgYearlyBudget();

	}

	@Test(priority = 3)
	public void UsercreateProgYearlySuccessfully()
	{
		createprog_yearly_Object = new CreateProgBudget_Yearly(driver);
		createprog_yearly_Object.Create_ProgYearlyBudget();




	}



}
