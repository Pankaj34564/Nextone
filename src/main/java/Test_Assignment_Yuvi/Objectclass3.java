package Test_Assignment_Yuvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objectclass3 {

	WebDriver driver;

	@FindBy(xpath = "//textarea")
	WebElement entertext;

	public void entertext() {
		entertext.sendKeys("water flow is very high");

	}

	@FindBy(xpath = "//button[text()='Next']")

	WebElement next;

	public void clicknext() {
		next.click();

	}

	public Objectclass3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
