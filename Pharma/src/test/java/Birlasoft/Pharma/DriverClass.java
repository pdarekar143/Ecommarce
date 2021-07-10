package Birlasoft.Pharma;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pages.Phhomepage;

public class DriverClass 
{  public WebDriver driver;
   Phhomepage home;
@BeforeClass
  public void initiatedriver() throws IOException 
  {   
	  if(UtilityClass.FetchProperty("BrowserName").toString().equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	  driver=new ChromeDriver();
	  }
	  else if(UtilityClass.FetchProperty("BrowserName").toString().equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	  driver=new FirefoxDriver();
	  }
	  else
	  {
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		  driver=new ChromeDriver();  
	  }
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get(UtilityClass.FetchProperty("ApplicationUrl").toString());
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
  }
  @AfterClass
  public void closeDriverdriver()
	{
		driver.quit();
	}
 
	   
   
}
