package cpm.au.test.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
	
	// chrome, microsoftedge, firefox
	public static WebDriver driver;
	 
	public void BrowserInstance(String browser) {
		if(browser == "chrome") {
			String driverpath = "D:\\eclipse_workspace\\automatiomProp\\src\\test\\java\\DriverRepo\\chromedriver.exe";
			System.setProperty("WebDriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
			
		}else if(browser == "edge") {
			String driverpath="D:\\eclipse_workspace\\automatiomProp\\src\\test\\java\\DriverRepo\\msedgedriver.exe";
			System.setProperty("WebDriver.edge.driver", driverpath);
		}else {
			System.out.println(" broser is not selected");
		}
	}
	

}
