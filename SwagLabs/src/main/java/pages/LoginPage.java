package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(id ="user-name")
	WebElement Username;
	
	@FindBy(id ="password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement login;
	
	public LoginPage()  // To initialialize the object repository of page factory , we create constructor of that class
	{
		PageFactory.initElements(driver, this);
		
	}





public HomePage Login(String un , String pw ) // return type is homepge because on clicking login, it will open homepage
{
	Username.sendKeys(un);
	password.sendKeys(pw);
	
	login.click();
	System.out.println(driver.getCurrentUrl());
	
	
	return new HomePage();
}


}