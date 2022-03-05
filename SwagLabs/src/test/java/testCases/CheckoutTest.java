package testCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyCart;
import testBase.BasePage;
import utilities.TestUtil;

public class CheckoutTest extends BasePage{
	
	LoginPage loginpage;
	HomePage homepage;
	MyCart mycart;
	CheckoutPage checkout;
	
	String sheetname = "checkout_data";	
	

	public CheckoutTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginpage = new LoginPage();
		homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		mycart = homepage.gotoCart();
		checkout= mycart.checkout_function();

	}
	
	
	@Test(priority = 1)
	public void startmessage()
	{
		System.out.println("the  checkout test started successfully");
	}
	
	

	@DataProvider(name = "checkoutTestData")
	public Object[][] checkoutTestData()
	{
		Object data [][]=TestUtil.getTestData(sheetname);
		return data;
		
	}
	
	@Test(priority = 2 , dataProvider ="checkoutTestData")
	public void checkout_items(String Firstname , String Lastname, String Zip  ) throws IOException
	{
		checkout.enterdetails(Firstname , Lastname , Zip);
		TestUtil.takeScreenshot();
	}
	
	
	@Test(priority = 3)
	public void Endmessage()
	{
		System.out.println("the checkout test completed successfully");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	

	
	
	

	
}
