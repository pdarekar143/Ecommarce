
package Infosys.Ecommarce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.automationtesting.excelreport.Xl;
@Listeners(EcomListenerPkg.EcomListener.class)
public class TestEHomepage 
{ WebDriver driver;
  EHomepage  homepage;
 
  @BeforeClass
  public void OpenBrowser() 
  {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\A -Velocity\\Chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://shop.demoqa.com/");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  homepage =new EHomepage(driver);
  }
  @AfterClass
  public void CloseBrowser()
  {
	  System.out.println("ClosingBrowser");
	  driver.close();
  }
 
	
  @Test(priority=0)
  public void verifysearchbutton()
  {
	  homepage.PageFactorySearchButton();
  }
@Test  (priority=1,dependsOnMethods= {"verifysearchbutton"})
  public void verifysearchbar() 
  {
	  homepage.PageFactorySearchBar();
  }
@Test(priority=2,dependsOnMethods= {"verifysearchbar"})
public void verifysearchbarclick() 
{
	  homepage.PageFactorySearchBarclick();
}
@Test(priority=3,dependsOnMethods= {"verifysearchbarclick"})
  public void verifyFilterColour()
  {
	  homepage.PageFactoryFilterColour();
  }
@Test(priority=4,dependsOnMethods= {"verifyFilterColour"})
  public void verifyFilterSize()
  {
	  homepage.PageFactoryFilterSize();
  }
@Test(priority=5,dependsOnMethods= {"verifyFilterSize"})
  public void verifyRelevance()
  {
	  homepage.PageFactoryRelevance();
  }
@Test(priority=6,dependsOnMethods= {"verifyRelevance"})
public void verifychoice()
{
	  homepage.PageFactoryChoice();
}
@Test(priority=7,dependsOnMethods= {"verifychoice"})
  public void verifySelectColour()
  {
	  homepage.PageFactorySelectColour();
  }
@Test(priority=8,dependsOnMethods= {"verifySelectColour"})
  public void verifySelectSize()
  {
	  homepage.PageFactorySelectSize();
  }
@Test(priority=9,dependsOnMethods= {"verifySelectSize"})
  public void verifyAddToCart() 
  {
	  homepage.PageFactoryAddToCart();
  }
@Test(priority=10,dependsOnMethods= {"verifyAddToCart"})
  public void ChekCart() 
  {
	driver.navigate().to("https://shop.demoqa.com/cart/");  
  }

}
