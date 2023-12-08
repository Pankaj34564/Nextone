package Com.Test_Class_Sauce_Demo;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.POM_Class_SauceDeemo.Home_POM_Class;
import Com.POM_Class_SauceDeemo.Login_POM_Class;

public class Test_Base_Class_SauceDemo {

	// specify the location of report
	// what details should be popuated in report
	WebDriver driver;

	Logger log = Logger.getLogger("Sauce_Demo_Project1");

	public ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("SauceDemoReport.html");// extend report

	@Parameters("browserName")
	@BeforeClass
	public void openbrowser(String browserName) {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		log.info("Open the browser");
		driver.manage().window().maximize();
		log.info("maximize the window");
		driver.get("https://www.saucedemo.com/");
		log.info("URL opened");

	}

	@BeforeMethod
	public void login() {
		spark.config().setDocumentTitle("SauceDemoTestReport");
		extent.attachReporter(spark);

		Login_POM_Class login = new Login_POM_Class(driver);
		login.sendkeysusername();
		login.Sendkeyspassword();
		login.clickonLoginbutton();
	}

	@AfterMethod
	public void logout() throws InterruptedException {
		extent.flush();

		Home_POM_Class logout = new Home_POM_Class(driver);
		logout.menubuttonclick();
		Thread.sleep(2000);
		logout.logoutbuttonclick();

	}

	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}
