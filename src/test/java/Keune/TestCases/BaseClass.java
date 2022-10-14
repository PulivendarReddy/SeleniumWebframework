package Keune.TestCases;
//This is for Base url contains Launch Browser and login ,, Capture Screenshots.
//22
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Keune.Utilities.ReadConfig;
public class BaseClass 
{
	ReadConfig readConfig=new ReadConfig();
	
	public String baseUrl=readConfig.getApplicationURL();
	public String username=readConfig.getUsername();
	public String password=readConfig.getPassword();
	public  String host=readConfig.getHost();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		logger= Logger.getLogger("Keune");
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readConfig.getchromepath());
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",readConfig.getfirefoxpath());
		driver=new FirefoxDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",readConfig.getedgepath());
			driver=new EdgeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	    
	}
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	public void captureScreen(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname +".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	public String randomeNum()
	{
		String generatedstring2=RandomStringUtils.randomNumeric(4);
		return(generatedstring2);
	}

}
