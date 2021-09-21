

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class objectListContactPage {
	 protected WebDriver driver;
	
	 By titleText =By.xpath("/html/head/title");
	  //first name
	
	  private By firstName= ByXPath.xpath("//*[@id=\"forename\"]");	
	  private By surName= ByXPath.xpath("//*[@id=\"surname\"]");
	  private By eMail= ByXPath.xpath("//*[@id=\"email\"]");	 
	  private By telePhone= ByXPath.xpath("//*[@id=\"telephone\"]");		 
	  private By msgText= ByXPath.xpath("//*[@id=\"message\"]");
	  private By submitButton= ByXPath.xpath("/html/body/div[2]/div/form/div/a");
	  private By errorMsg= ByXPath.xpath("//*[@id=\"header-message\"]/div");
	  private By firstNameErrorMsg= ByXPath.xpath("//*[@id=\"forename-err\"]");
	  private By emailErrorMsg= ByXPath.xpath("//*[@id=\"email-err\"]");
	  private By msgErrorMsg= ByXPath.xpath("//*[@id=\"message-err\"]"); 
	  private By alertMsg= ByXPath.xpath("/html/body/div[2]");

	  
	  
	  

	  public objectListContactPage(WebDriver driver)
	  {
	    this.driver = driver;
	  }
		    
	    
	//Set first name

	    public void setfirstName(String firstname)
	    {

	        driver.findElement(firstName).sendKeys(firstname);

	    }
	   
	  //Set last name

	    public void setSurName(String surname)
	    {

	        driver.findElement(surName).sendKeys(surname);

	    }

	 
	    
	    //Set Email
	    
	    public void setEmail(String email)
	    {

	        driver.findElement(eMail).sendKeys(email);
	    }
	    
	    
 //Set Telephone
	    
	    public void setTelePhone(String telephone)
	    {

	        driver.findElement(telePhone).sendKeys(telephone);
	    }
	    
	    //set msg
	    public void setMsg(String msgxext)
	    {

	        driver.findElement(msgText).sendKeys(msgxext);
	    }
	    

	   
	    // This method to click on submit button
		  public void clickOnSubmit()
		  {
			 driver.findElement(submitButton).click();
		  }
		  
		  //get the error message
		  public String getErrorMsg()
		  {
			   return driver.findElement(errorMsg).getText();	
			   
		  }
		
		  public String getFisrtNameErrorMsg()
		  
		  {
			    return driver.findElement(firstNameErrorMsg).getText();
	
		  }
		  
		  public String getEmailErrorMsg()
		  
		  {
			    return driver.findElement(emailErrorMsg).getText();  
		  }
		  
		  public String getMsgErrorMsg()
		  
		  {
			  	  return driver.findElement(msgErrorMsg).getText();
			 
			
		  }
		  
		  
  public String getSucessMsg()
		  
		  {
	//System.out.println(driver.findElement(alertMsg).getText());		  	
	  return driver.findElement(alertMsg).getText();
			 				
		  }
	   


}

