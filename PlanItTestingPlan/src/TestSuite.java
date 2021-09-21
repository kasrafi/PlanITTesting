import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {
	@Test
	public void Test1() throws Exception{
		objectListHomePage homepage = PageFactory.initElements(driver, objectListHomePage.class);
		homepage.clickOnContact();
		objectListContactPage contact =PageFactory.initElements(driver, objectListContactPage.class);
		contact.clickOnSubmit();
		
		
		//validate error messages
		 Assert.assertTrue(contact.getErrorMsg().contains("We welcome your feedback - but we won't get it unless you complete the form correctly."));
		 Assert.assertTrue(contact.getFisrtNameErrorMsg().contains("Forename is required"));
		 Assert.assertTrue(contact.getEmailErrorMsg().contains("Email is required"));
		 Assert.assertTrue(contact.getMsgErrorMsg().contains("Message is required"));
		 
		 //populate mandatory fields
		
		 contact.setfirstName("Kobita");
		 contact.setEmail("k.asrfi@abc.com");
		 contact.setMsg("Sevice List");
		
		 //re-check validation msg are gone
		 Assert.assertTrue(contact.getErrorMsg().contains("We welcome your feedback - tell it how it is."));
		 
		 //test clean up
		TeardownTest();

		

		}
	
	@Test
	public void Test2() throws Exception{
		initialize();
		objectListHomePage homepage = PageFactory.initElements(driver, objectListHomePage.class);
		homepage.clickOnContact();
		objectListContactPage contact =PageFactory.initElements(driver, objectListContactPage.class);
		
		//populate mandatory fields
		
		 contact.setfirstName("Kobita");
		 contact.setEmail("k.asrfi@abc.com");
		 contact.setMsg("Sevice List");
		 
		 //click submit
		contact.clickOnSubmit();
		Thread.sleep(5000);
		//Validate successful submission message	
		//System.out.println(contact.getSucessMsg());
		
		Assert.assertTrue(contact.getSucessMsg().toLowerCase().contains("we appreciate your feedback"));
		TeardownTest();
		
	}
	
	@Test
	public void Test3() throws Exception{
		
		initialize();
		objectListHomePage homepage = PageFactory.initElements(driver, objectListHomePage.class);
		homepage.clickOnContact();
		objectListContactPage contact =PageFactory.initElements(driver, objectListContactPage.class);
		
		//populate mandatory fields
		
		 contact.setfirstName("123");
		 contact.setEmail("k.asrfiabc.com");
		 contact.setMsg("@@#@#");
		 
		
		//Validate error  message	
	
		Assert.assertTrue(contact.getEmailErrorMsg().contains("Please enter a valid email"));
		TeardownTest();
		
	}
	@Test
	public void Test4() throws Exception{
		
		initialize();
		objectListHomePage homepage = PageFactory.initElements(driver, objectListHomePage.class);
		homepage.clickOnShop();
		objectListShopPage shop =PageFactory.initElements(driver, objectListShopPage.class);
		
		//populate mandatory fields
		
		 shop.BuyfunnyCow();
		 shop.BuyfunnyCow();
		 shop.Buybunny();
		 shop.ClickCart();
		 
		 //check the items are on the cart
		 Assert.assertTrue(shop.checkItem1().contains("Funny Cow"));
		Assert.assertTrue(shop.checkItem2().contains("Fluffy Bunny"));
		
		TeardownTest();
		
	}
}
