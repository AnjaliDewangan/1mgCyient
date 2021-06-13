package com.cyient.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WrapperBase {

protected WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
	
		String browser="ch";
		if(browser.equalsIgnoreCase("ch"))
		{
			//Test case 2.2 Close if any popup.
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
//			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
	
		}else if(browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}else
		{
			System.setProperty("webdriver.ie.driver", "src/test/resources/driver/iedriverserver.exe");
			driver = new InternetExplorerDriver();
		}
	        driver.get("https://www.1mg.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
