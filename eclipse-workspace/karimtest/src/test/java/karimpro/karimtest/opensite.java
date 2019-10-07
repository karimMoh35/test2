package karimpro.karimtest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class opensite {
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
