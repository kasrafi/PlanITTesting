

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TestBase {
  
	    public static WebDriver driver;

	    objectListContactPage objContactPage;

	    @BeforeTest
	    //Setting system properties of ChromeDriver
	    	//System.setProperty("webdriver.chrome.driver", "/Users/mdsaeedhasan/eclipse/chromedriver"); 
	    	
	      public void initialize() throws IOException{
	    	System.setProperty("webdriver.chrome.driver", "/Users/mdsaeedhasan/eclipse/chromedriver"); 
	        	driver = new ChromeDriver();
	        	//To maximize browser
	        	driver.manage().window().maximize();
	        	//Implicit wait
	        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        	//To open the home page
	        		 driver.navigate().to("https://jupiter.cloud.planittesting.com/#/home");	        			
	    }

	        	@AfterSuite
	        		//Test cleanup
	        		public void TeardownTest()
	        		{
	        		TestBase.driver.quit();
	        		}
	        		

	      
	        	
	    

	  /*  @Test()

	    public void fillinContactPage(){
	    	
             //Create object
	        objContactPage = new objectListContactPage(driver);

	          //set the fields

	        objContactPage.contactPageInfo("mahmuda", "asrafi", "Home","K.asrafi@yahoo.com", "0404040", "Please Email", "Australia", "checked" );
		    

	    

	    Assert.assertTrue(objContactPage.getContactTitle().toLowerCase().contains("Contact Us - IntelligenceBank"));

	   
	    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    try {
	  	  System.out.println("Saving the screenshot");
	        Files.copy(src, new File("/Users/mdsaeedhasan/eclipse-workspace/TestNGSeleniumTest1/src/screenshot.png"));
	    } 
	    catch (IOException e) {
	  	  
	        e.printStackTrace();
	    }
*/
	    

	


}
