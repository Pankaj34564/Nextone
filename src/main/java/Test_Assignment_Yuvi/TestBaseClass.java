package Test_Assignment_Yuvi;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
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

public class TestBaseClass {

	WebDriver driver;

	Logger log = Logger.getLogger("Sauce_Demo_Project1");

	@BeforeMethod
	public void openbrowser() {

		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Open the browser");
		driver.manage().window().maximize();
		log.info("maximize the window");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#/");
		log.info("URL opened");

	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
		log.info("browser is close");
	}
}
