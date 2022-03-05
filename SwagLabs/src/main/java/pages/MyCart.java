package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BasePage;

public class MyCart extends BasePage {

	@FindBy(id = "checkout")
	WebElement checkout_btn;
	
	public MyCart()
	{
		PageFactory.initElements(driver, this);
	}
	
	public CheckoutPage checkout_function()
	{
		checkout_btn.click();
		
		return new CheckoutPage();
	}
	
}
