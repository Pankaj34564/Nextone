package Com.Test_Class_Sauce_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.POM_Class_SauceDeemo.AddToCart_POM_Class;
import Com.POM_Class_SauceDeemo.Home_POM_Class;

public class Test_Class_SauceDemo extends Test_Base_Class_SauceDemo {
	
	@Test(priority=1)
	public void saucedemologin()
	{
		
		String expected ="Swag Labs";
		
	    String actualresult = driver.getTitle();
	    
	    Assert.assertEquals(actualresult, expected);
	    	
	}
	
	@Test(priority=2,dependsOnMethods={"saucedemologin"})
	public void addtocart()
	{
		Home_POM_Class addtocart =new Home_POM_Class(driver);
		addtocart.bikelightclick();
		String actualresult=addtocart.containercartgettext();
		String expectedresult ="1";
		
		Assert.assertEquals(expectedresult, actualresult);
	}
	
	
	@Test(priority=3)
	public void allproduct()
	{
		Home_POM_Class allproduct =new Home_POM_Class(driver);
		allproduct.allproductclick();
		String actualresult= allproduct.containercartgettext();
		String expectedreuslt="6";
		Assert.assertEquals(expectedreuslt, actualresult);
	}

   @Test
   public void checkout()
   {
	   Home_POM_Class checkout =new Home_POM_Class(driver);
	   checkout.bikelightclick();
	   System.out.println("iteam added to cart");
	   checkout.bucketclick();
	   System.out.println("click on bucket");
	   AddToCart_POM_Class check=new AddToCart_POM_Class(driver);
	   check.checkoutbuttonclick();
	   System.out.println("click out button ");
	   check.sendkeysfirstnameclick();
	   System.out.println(" Enter first name ");
	   check.sendkeyslastnameclick();
	   System.out.println(" Enter las name ");
	   check.sendkeyspostalcodeclick();
	   System.out.println(" Enter postal code ");
	   check.continuebuttonclick();
	   System.out.println("click on continue");
	   check.finishbuttonclick();
	   System.out.println("click on finish ");
	   
	   String actualresult=driver.getTitle();   
	   String expectedresult="Swag Labs";
	   
	   Assert.assertEquals(expectedresult, actualresult);
   }
	
}
