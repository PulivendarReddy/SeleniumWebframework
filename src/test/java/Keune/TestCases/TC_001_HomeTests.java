package Keune.TestCases;

import org.testng.annotations.Test;

import Keuna.PageObjects.HomePage;
import Keune.Utilities.ReadConfig;



public class TC_001_HomeTests extends BaseClass
{
	
	@Test
	public  static void HomeTest() throws Exception 
	{
		ReadConfig readConfig=new ReadConfig();
		String host=readConfig.getHost();
		
		HomePage homepage=new HomePage(driver);
		
		homepage.ClickOnGoBtn();
		Thread.sleep(3000);
		homepage.mouseoverToAllproducts();
		
	}

		
		
}
