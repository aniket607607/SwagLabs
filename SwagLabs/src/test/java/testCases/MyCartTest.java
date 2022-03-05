package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyCart;
import testBase.BasePage;

public class MyCartTest extends BasePage {
	
	LoginPage loginpage;
	HomePage homepage;
	MyCart mycart;
	CheckoutPage checkout;

	public MyCartTest() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginpage = new LoginPage();
		homepage=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		mycart = homepage.gotoCart();
		
	}
	
	
	@Test(priority = 1)
	public void finalpage()
	{
		mycart.checkout_function();
		System.out.println(driver.getCurrentUrl());

	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
		
	
}
