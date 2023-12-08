package Com.Test_Class_Sauce_Demo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Com.POM_Class_SauceDeemo.AddToCart_POM_Class;
import Com.POM_Class_SauceDeemo.Home_POM_Class;
import Com.Utility_Sauce_Demo.SauceDemoScreenShot;

public class TC_04_VerifyProductbuy_SauceDemo extends Test_Base_Class_SauceDemo {

	@Test
	public void checkout() throws IOException {

		ExtentTest test1 = extent.createTest("Product buy functionality");

		Home_POM_Class checkout = new Home_POM_Class(driver);
		checkout.bikelightclick();
		log.info("iteam added to cart");
		checkout.bucketclick();
		log.info("click on bucket");
		AddToCart_POM_Class check = new AddToCart_POM_Class(driver);
		check.checkoutbuttonclick();
		log.info("click out button ");
		check.sendkeysfirstnameclick();
		log.info(" Enter first name ");
		check.sendkeyslastnameclick();
		log.info(" Enter las name ");
		check.sendkeyspostalcodeclick();
		log.info(" Enter postal code ");
		check.continuebuttonclick();
		log.info("click on continue");
		check.finishbuttonclick();
		log.info("click on finish ");

		String actualresult = driver.getTitle();
		String expectedresult = "Swag Labs";

		Assert.assertEquals(expectedresult, actualresult);
		SauceDemoScreenShot.screenshot(driver, "LoginPage");

		test1.pass("product buy Successfully");
	}

}
