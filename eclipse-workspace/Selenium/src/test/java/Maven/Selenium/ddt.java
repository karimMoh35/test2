package Maven.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ddt {
	ChromeDriver  driver;
	@ BeforeTest 	 
	public void OpenUrl() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");   // to make the path portable create folder reources and put the element to it 
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());	
		driver.manage().window().maximize();
	}
  
	
	@Test (priority=0)
	public void iphone() throws InterruptedException 
	{
          Thread.sleep(4000);
	//	driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone xs");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	}
}
