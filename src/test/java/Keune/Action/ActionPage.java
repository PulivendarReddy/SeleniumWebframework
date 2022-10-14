package Keune.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Keune.TestCases.BaseClass;

public class ActionPage extends BaseClass

{
	Actions act = new Actions(driver);
	
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}
	public void JSClick(WebDriver driver, WebElement ele) 
	{
		
		
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
			// driver.executeAsyncScript("arguments[0].click();", element);
	}
	

	public  void validationForCartProduct(WebElement element,String value) 
	{
	//String value1=keratenpage.viewCartProductdetails.getText();
		String value1=element.getText();
		
	Assert.assertEquals(value1,value);
	
	}
	
	public void movseoveraction(WebElement element,String Elementname)
	{
		
		act.moveToElement(element).build().perform();

	}

	
	public void clear(WebElement element)
	{
	  element.clear();
	}
	
	public void setText(String text,WebElement element)
	{
	  element.sendKeys(text);
	 }
	public void selectByVisibleText(WebElement selectSize,String text)
	{
	  Select s=new Select(selectSize);
	  s.selectByVisibleText(text);
	}

	public void refresh(WebDriver driver)
	{
	  driver.navigate().refresh();
	}

	public boolean validateText(WebDriver driver,WebElement element,String expextedText)
	{
	  String observedText=element.getText();
	if(observedText.equals(expextedText))
	{
	  return true;
	}
	 return false;
	}
	
	
	
	



	

}
