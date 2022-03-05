package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(id="react-burger-menu-btn")
	WebElement menu_btn;
	
	@FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
	WebElement item1;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement additem1tocart;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement additem2tocart;
	
	@FindBy(xpath= "//*[@id=\"header_container\"]/div[1]/div[2]/div")
	WebElement title;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement cart;	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void clickmenu()
	{
		menu_btn.click();
	}
	
	
	public void additems()
	{
		additem1tocart.click();
		additem2tocart.click();
	}
	
	
	public MyCart gotoCart()
	{
		cart.click();
		//System.out.println(driver.getCurrentUrl());
		return new MyCart();
		
	}
}
