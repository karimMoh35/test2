package Maven.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class chrometest {

	ChromeDriver driver;

	@ BeforeTest 
	public   void Amazon() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");   // to make the path portable create folder reources and put the element to it 
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());	
		driver.manage().window().maximize();
	}

@DataProvider(name="testdata")
	public static Object [][] userdata()
{
	return new Object[][] {
			{"iphone"},{"sony"},{"samsung"}
	};
	
}
	
	
	
	@Test (priority=0)
	public void iphone(String search) 
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("search");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
	}
/*
 public void Selection() {
 

		WebElement  x	=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/span[2]"));
		if (x.getText().contains("renewed")) {
			System.out.println("correct");
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
	}	}
		
*/	


	


	@AfterTest 
	public void close() {
		driver.close();
	}




}