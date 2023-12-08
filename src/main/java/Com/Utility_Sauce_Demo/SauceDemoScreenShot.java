package Com.Utility_Sauce_Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceDemoScreenShot {

	public static void screenshot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destn = new File("./ScreenshotFolder/" + name + "pankaj.jpeg");
		FileHandler.copy(source, destn);
	}
}
