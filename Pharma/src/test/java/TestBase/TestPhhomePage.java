package TestBase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Birlasoft.Pharma.DriverClass;
import Pages.Phhomepage;



public class TestPhhomePage extends DriverClass
{
   Phhomepage home;
  
   @Test(priority=0)
	  public void verifysearchbutton()
	  {  home= new Phhomepage(driver);
		  home.PageFactorySearchButton();
	  }
	@Test  (priority=1,dependsOnMethods= {"verifysearchbutton"})
	  public void verifysearchbar() 
	  {
		  home.PageFactorySearchBar();
	  }
	@Test(priority=2,dependsOnMethods= {"verifysearchbar"})
	public void verifysearchbarclick() 
	{
		  home.PageFactorySearchBarclick();
	}
	@Test(priority=3,dependsOnMethods= {"verifysearchbarclick"})
	  public void verifyFilterColour()
	  {
		  home.PageFactoryFilterColour();
	  }
	@Test(priority=4,dependsOnMethods= {"verifyFilterColour"})
	  public void verifyFilterSize()
	  {
		  home.PageFactoryFilterSize();
	  }
	@Test(priority=5,dependsOnMethods= {"verifyFilterSize"})
	  public void verifyRelevance()
	  {
		  home.PageFactoryRelevance();
	  }
	@Test(priority=6,dependsOnMethods= {"verifyRelevance"})
	public void verifychoice()
	{
		  home.PageFactoryChoice();
	}
	@Test(priority=7,dependsOnMethods= {"verifychoice"})
	  public void verifySelectColour()
	  {
		  home.PageFactorySelectColour();
	  }
	@Test(priority=8,dependsOnMethods= {"verifySelectColour"})
	  public void verifySelectSize()
	  {
		  home.PageFactorySelectSize();
	  }
	@Test(priority=9,dependsOnMethods= {"verifySelectSize"})
	  public void verifyAddToCart() 
	  {
		  home.PageFactoryAddToCart();
	  }
	@Test(priority=10,dependsOnMethods= {"verifyAddToCart"})
	  public void ChekCart() 
	  {
		driver.navigate().to("https://shop.demoqa.com/cart/");  
	  }

}
