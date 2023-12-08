package Com.POM_Class_SauceDeemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_POM_Class {

	WebDriver driver;
	// Click on checkout
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkoutbutton;

	public void checkoutbuttonclick() {
		checkoutbutton.click();
	}

	// Enter first name
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement sendkeysfirstname;

	public void sendkeysfirstnameclick() {
		sendkeysfirstname.sendKeys("pankaj");
	}

	// Enter last name
	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement sendkeyslastname;

	public void sendkeyslastnameclick() {
		sendkeyslastname.sendKeys("Borkar");
	}

	// Enter postal code name
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement sendkeyspostalcode;

	public void sendkeyspostalcodeclick() {
		sendkeyspostalcode.sendKeys("441601");
	}

	// click on continue
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;

	public void continuebuttonclick() {
		continuebutton.click();
	}

	// click on finish button

	@FindBy(xpath = "//button[@id='finish']")
	private WebElement finishbutton;

	public void finishbuttonclick() {
		finishbutton.click();
	}

	public AddToCart_POM_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
