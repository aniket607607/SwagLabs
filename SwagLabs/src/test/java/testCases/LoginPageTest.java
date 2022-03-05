package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyCart;
import testBase.BasePage;

public class LoginPageTest extends BasePage {

	LoginPage loginpage;	
	HomePage homepage;
	
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginpage = new LoginPage();
		
	}
	
	
	@Test(priority = 1)
	public void startmessage()
	{
		System.out.println("the test started successfully");
	}
	
	@Test(priority = 2)
	public void LoginTest()
	{
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@Test(priority = 3)
	public void Endmessage()
	{
		System.out.println("the test completed successfully");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}


