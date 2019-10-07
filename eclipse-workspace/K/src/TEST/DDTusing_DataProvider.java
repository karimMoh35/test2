package TEST;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DDTusing_DataProvider {
	ChromeDriver driver;
	@BeforeTest
	public   void NopCommerce () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");   // to make the path portable create folder reources and put the element to it 
		driver = new ChromeDriver();
		driver.get("www.google.com");
		//System.out.println(driver.getCurrentUrl());	
		// driver.manage().window().maximize();
	}
	

}
