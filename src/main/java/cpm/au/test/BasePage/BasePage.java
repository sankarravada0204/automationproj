package cpm.au.test.BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasePage extends BrowserDriver{

	
	String url = "https://www.techlistic.com/p/selenium-practice-form.html";
	String browser = "chrome";
	
	@BeforeMethod
	public void loadBrowserDetails() {
		BrowserDriver br = new BrowserDriver();
		br.BrowserInstance(browser);
		System.out.println("browser is loaded");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void getUrlInstance() {
		System.out.println("driver ="+driver);
		driver.get(url);
		System.out.println("url :"+url);
		System.out.println("build successfull");
	}
	
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("driver instance is closed");
	}*/
	
}
