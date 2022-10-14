package Keuna.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Keune.Action.ActionPage;
import Keune.TestCases.BaseClass;

public class HomePage extends BaseClass
{
	ActionPage act = new ActionPage();
	
WebDriver ldriver;

	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
		
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Go')]")
	@CacheLookup
	WebElement SelectYourLocation;

		
	
	@FindBy(xpath="//a[contains(text(),'All products')]")
	@CacheLookup
	WebElement AllProducts;
	
	
	@FindBy(xpath="//a[contains(text(),'Color protection')]")
	@CacheLookup
	WebElement clickonColourProtection;
	
	
	public void ClickOnGoBtn()
	{
		act.JSClick(driver, SelectYourLocation);

	}
	
	public void mouseoverToAllproducts()
	{
		act.movseoveraction(AllProducts, "mouseover to the allproducts");
		
		act.JSClick(driver, clickonColourProtection);
	}
	

}
