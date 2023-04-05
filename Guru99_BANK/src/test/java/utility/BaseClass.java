package utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfigFile read = new ReadConfigFile();
	protected String global_username = read.getUsername();
	protected String global_password = read.getPassword();
	protected String url = read.getUrl();
	protected String browser = read.getBrowser();
	public static Logger Log;

	
	
	protected static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		if(browser.equals("chrome"))
		{	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		Log = Logger.getLogger("Guru99_BANK");
		PropertyConfigurator.configure("logfile.properties");
		}
		
		if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
	}
	public WebDriver getDriver()
	{
		return driver;
	}
	
	@AfterTest
	public void tear()
	{
		driver.quit();
	}
	
	
	
	
	

}
