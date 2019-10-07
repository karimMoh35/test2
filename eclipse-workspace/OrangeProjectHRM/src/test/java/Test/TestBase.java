package Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

	// Setup environment before test , during test, after test (close browser)

	public static WebDriver driver;     // static global variable

	@BeforeSuite
	@Parameters({"browser"})
	public void StartDriver(@Optional("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))   
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");  
			driver= new ChromeDriver() ;
		}

		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");  
			driver= new FirefoxDriver() ;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

	}

	@AfterSuite
	public void StopDriver()
	{
		driver.close();

	}

}
