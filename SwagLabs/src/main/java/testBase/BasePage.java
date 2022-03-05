package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.TestUtil;

public class BasePage {
	
	 public static WebDriver driver;   // webdriver is initialised with the help of static keyword
	 public static Properties prop;
	
	public BasePage() // This is the constructor. The name is same as that of the page
	{
		
		
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Aniket\\eclipse-workspace\\SwagLabs\\src\\main\\java\\configurationPackage\\configuration.properties");
			prop.load(ip);
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void initialize()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\cd\\cd1\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else
		{
			//give codes for ie/mozilla 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
	}


}
