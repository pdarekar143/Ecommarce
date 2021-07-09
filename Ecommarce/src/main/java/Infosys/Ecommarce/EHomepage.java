
package Infosys.Ecommarce;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EHomepage 
{ 

WebDriver driver;
@FindBy (xpath="//a[@class='noo-search'] ")
private WebElement Searchbutton;
@FindBy (xpath="//input[@class='form-control'] ")
private WebElement Searchbar;
@FindBy (xpath="(//select[@class='noo-woo-filter'])[1] ")
private WebElement FilterColour;
@FindBy (xpath="(//select[@class='noo-woo-filter'])[2] ")
private WebElement FilterSize;
@FindBy (xpath="//select[@class='orderby']")
private WebElement Relevance;
@FindBy(xpath="//a[contains(text(),'black ribbed short sleeve lettuce hem midi dress')]")
private WebElement choice;
@FindBy (xpath="//select[@id='pa_color'] ")
private WebElement SelectColour;
@FindBy (xpath=" //select[@id='pa_size']")
private WebElement SelectSize;
@FindBy (xpath=" //button[@class='single_add_to_cart_button button alt']")
private WebElement AddToCart;

public EHomepage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
}
public void PageFactorySearchButton()
{Searchbutton.click();
}
public void PageFactorySearchBar() 
{
	Searchbar.sendKeys("dress");

}
public void PageFactorySearchBarclick() 
{   
	Searchbar.sendKeys(Keys.ENTER);

}
public void PageFactoryFilterColour()
{ Select s=new Select(FilterColour);
  s.selectByValue("59");
}
public void PageFactoryFilterSize()
{Select s= new Select(FilterSize);
 s.selectByValue("65");
}
public void PageFactoryRelevance()
{Select s=new Select(Relevance);
s.selectByValue("price");
}
public void PageFactoryChoice()
{ choice.click();
}
public void PageFactorySelectColour()
{Select s=new Select(SelectColour);
s.selectByValue("grey");
}
public void PageFactorySelectSize()
{Select s=new Select(SelectSize);
s.selectByValue("medium");
}
public void PageFactoryAddToCart()
{AddToCart.click();
}
}
