package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import util.Utility;

public class Base {

    public WebDriver driver;
	
	public void lauchBrowser () throws IOException
	{
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("incognito");
//		opt.addArguments("start-maximized");
	//	EdgeOptions eopt = new EdgeOptions();
//		eopt.addArguments("incognito");
//		eopt.addArguments("start-maximize");
		Reporter.log("lauching chromeBrowser", true);
		 driver = new EdgeDriver();
		 Reporter.log("Lauching website", true);
		 driver.get(Utility.getProperty("url"));
		 driver.manage().window().maximize();
    }
	
	public void closeBrowser()  
	{
		Reporter.log("Closing Browser", true);
		driver.quit();
		
	}
	
}
