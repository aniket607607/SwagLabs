package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyCart;
import testBase.BasePage;

public class HomePageTest extends BasePage {
	
	LoginPage loginpage;
	HomePage homepage;
	MyCart mycart;
	
	public HomePageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginpage = new LoginPage();
		homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority = 1)
	public void startmessage()
	{
		System.out.println("the  homepage test started successfully");
	}
	
	@Test(priority = 2)
	public void Addtocart()
	{
		homepage.additems();
	}
	
	@Test(priority = 3)
	public void Gotocart()
	{
		mycart = homepage.gotoCart();
	}
	
	
	@Test(priority = 4)
	public void Endmessage()
	{
		System.out.println("the homepage test completed successfully");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	

}
