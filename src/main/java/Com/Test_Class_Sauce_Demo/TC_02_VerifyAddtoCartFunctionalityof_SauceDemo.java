package Com.Test_Class_Sauce_Demo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Com.POM_Class_SauceDeemo.Home_POM_Class;
import Com.Utility_Sauce_Demo.SauceDemoScreenShot;

public class TC_02_VerifyAddtoCartFunctionalityof_SauceDemo extends Test_Base_Class_SauceDemo {

	@Test
	public void addtocart() throws IOException {

		ExtentTest test1 = extent.createTest("Add to cart");

		Home_POM_Class addtocart = new Home_POM_Class(driver);
		addtocart.bikelightclick();
		String actualresult = addtocart.containercartgettext();
		String expectedresult = "1";

		Assert.assertEquals(expectedresult, actualresult);

		SauceDemoScreenShot.screenshot(driver, "AddToCart");

		test1.pass("Add tocart Stared Successfully");
	}

}
