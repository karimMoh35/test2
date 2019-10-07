package karim.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class openlink {
	ChromeDriver driver;

	@ BeforeTest 
	public   void Amazon() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");   // to make the path portable create folder reources and put the element to it 
		driver = new ChromeDriver();
		driver.get("https://saudi.souq.com/sa-ar/");
		System.out.println(driver.getCurrentUrl());	
		driver.manage().window().maximize();
	}


	@Test (priority=0)
	public void selectiphone() 
	{
		driver.findElement(By.id("search_value")).sendKeys(" iphone x ");
		driver.findElement(By.xpath("//*[@id=\"searchButton\"]/i")).click();
		String x =driver.findElement(By.xpath("//*[@id=\"content-body\"]/div[7]/div/div/div[4]/div[3]/ul/li[1]/div[1]/div[1]/h3")).getText();
		System.out.println(x);
		if (x.contains("3,749.00"))
		{
			System.out.println("Nice JOB kareeeeeeeem");
			driver.findElement(By.xpath("//*[@id=\"content-body\"]/div[7]/div/div/div[4]/div[2]/a/h1")).click();

		}else
		{
			System.out.println("Bad JOB kareeeeeeeem Wrong value");
			driver.close();
		}
	}
	@Test (priority=1)
	public void addtocart() 
	{
		String y = driver.findElement(By.linkText("فضي")).getText();
		System.out.println(y);
		if (y.contains("فضي")) 
		{
			System.out.println("exact colour ");
			String A= driver.findElement(By.linkText("3 جيجابايت")).getText();
			System.out.println(A);
			if (A.contains("3 جيجابايت"))
			{
				System.out.println("exact phone ");
				driver.findElement(By.xpath("//*[@id=\"addItemToCart\"]/input[8]")).click();   // add to cart 
			}
			else
			{
				System.out.println("Bad Choice Karim");
			}

		}


	}



}
