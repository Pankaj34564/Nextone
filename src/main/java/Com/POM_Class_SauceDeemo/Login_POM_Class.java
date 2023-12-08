package Com.POM_Class_SauceDeemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM_Class {

	WebDriver driver;
	// Login functionality details

	// Enter username
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;

	public void sendkeysusername() {
		username.sendKeys("standard_user");
	}

	// Enter password
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	public void Sendkeyspassword() {
		password.sendKeys("secret_sauce");
	}

	// click on login button

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginbutton;

	public void clickonLoginbutton() {
		loginbutton.click();
	}

	// Initialize the constructor
	public Login_POM_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
