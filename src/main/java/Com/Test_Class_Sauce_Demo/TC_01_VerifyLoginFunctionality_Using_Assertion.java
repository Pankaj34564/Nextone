package Com.Test_Class_Sauce_Demo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Com.Utility_Sauce_Demo.SauceDemoScreenShot;

public class TC_01_VerifyLoginFunctionality_Using_Assertion extends Test_Base_Class_SauceDemo {
	@Test(timeOut=2000)
	public void saucedemologin() throws IOException {

		ExtentTest test1 = extent.createTest("Login Test");

		String expected = "Swa Labs";

		String actualresult = driver.getTitle();

		Assert.assertEquals(actualresult, expected);

		SauceDemoScreenShot.screenshot(driver, "HomePage");

		test1.pass("Login Test Stared Successfully");

	}

}
