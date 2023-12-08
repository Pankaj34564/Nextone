package Test_Assignment_Yuvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ObjectClass5 {

	WebDriver driver;

	@FindBy(xpath = "//button[text()='Next']/ancestor::div/preceding-sibling::div/descendant::input")
	WebElement emailaddress;

	public boolean enteremailaddress() {
		return emailaddress.isDisplayed();

	}

	public ObjectClass5(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
