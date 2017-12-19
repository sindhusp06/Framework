package Generic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test {
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
	}
	@BeforeMethod
	public void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Open app");
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		System.out.println("Close app");
	}
	

}
