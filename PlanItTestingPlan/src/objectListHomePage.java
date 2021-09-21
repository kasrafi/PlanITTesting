

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class objectListHomePage {
	 protected WebDriver driver;
	
	 By titleText =By.xpath("/html/head/title");
	  //first name
	  private By menuContactPage= ByXPath.xpath("//*[@id=\"nav-contact\"]/a");
		
	  private By menuShopPage= ByXPath.xpath("//*[@id=\"nav-shop\"]/a");
		 

	  public objectListHomePage(WebDriver driver)
	  {
	    this.driver = driver;
	  }
		    
	      

	  public void clickOnContact()
	  {
		  driver.findElement(menuContactPage).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		  }
	  
		  // This method to click on shop link
		  public void clickOnShop()
		  {
			 driver.findElement(menuShopPage).click();
		  }

	   


}

