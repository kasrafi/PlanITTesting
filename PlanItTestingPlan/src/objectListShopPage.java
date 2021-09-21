import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class objectListShopPage {
	


	 protected WebDriver driver;
	
	 By titleText =By.xpath("/html/head/title");
	  //first name
	
	  private By funnycow= ByXPath.xpath("//*[@id=\"product-6\"]/div/p/a");	
	  private By fluffyBunny= ByXPath.xpath("//*[@id=\"product-4\"]/div/p/a");
	  private By cart= ByXPath.xpath("//*[@id=\"nav-cart\"]/a");
	  private By item1=ByXPath.xpath(" /html/body/div[2]/div/form/table/tbody/tr[1]/td[1]");
	  private By item2=ByXPath.xpath(" /html/body/div[2]/div/form/table/tbody/tr[2]/td[1]");
	 

	  public objectListShopPage(WebDriver driver)
	  {
	    this.driver = driver;
	  }
		    
	    
	  // This method buy Teddy Bear
	  public void BuyfunnyCow()
	  {
		 driver.findElement(funnycow).click();
	  }

	   
	  // This method buy fluffy Bunny
	  public void Buybunny()
	  {
		 driver.findElement(fluffyBunny).click();
	  }
	   
//check the cart
	  public void ClickCart()
	  {
		 driver.findElement(cart).click();
	  }

	  //check item names
	  public String checkItem1()
	  {
		 return driver.findElement(item1).getText();
	  }

	  public String checkItem2()
	  {
		 return driver.findElement(item2).getText();
	  }

}



