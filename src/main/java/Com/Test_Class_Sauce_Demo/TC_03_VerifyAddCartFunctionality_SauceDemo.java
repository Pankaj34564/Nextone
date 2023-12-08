package Com.Test_Class_Sauce_Demo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Com.POM_Class_SauceDeemo.Home_POM_Class;
import Com.Utility_Sauce_Demo.SauceDemoScreenShot;

public class TC_03_VerifyAddCartFunctionality_SauceDemo extends Test_Base_Class_SauceDemo {

	@Test
	public void allproduct() throws IOException {
		ExtentTest test1 = extent.createTest("Add to cart functionality");

		Home_POM_Class allproduct = new Home_POM_Class(driver);
		allproduct.allproductclick();
		String actualresult = allproduct.containercartgettext();
		String expectedreuslt = "6";
		Assert.assertEquals(expectedreuslt, actualresult);
		SauceDemoScreenShot.screenshot(driver, "Homepage");

		test1.pass("Product added succefully Successfully");
	}

}
