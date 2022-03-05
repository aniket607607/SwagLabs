package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import testBase.BasePage;
import utilities.TestUtil;

public class CheckoutPage extends BasePage{
	
	
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement zip;
	
	@FindBy(id="continue")
	WebElement continue_btn;
	
	
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void enterdetails(String fn , String ln , String postal)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		zip.sendKeys(postal);
		continue_btn.click();
		
		System.out.println(driver.getCurrentUrl());
	}
}




