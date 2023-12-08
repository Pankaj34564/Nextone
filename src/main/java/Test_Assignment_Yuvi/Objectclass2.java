package Test_Assignment_Yuvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objectclass2 {

	WebDriver driver;

	@FindBy(xpath = "(//label//div//div)[5]")
	WebElement Tap;

	public void clickTap() {
		Tap.click();

	}

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextbutton;

	public void clciknextbutton() {
		nextbutton.click();

	}

	@FindBy(xpath = "(//label//div//div)[1]")
	WebElement replacebutton;

	public void clcikreplacebutton() {
		replacebutton.click();

	}

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextbutton2;

	public void clciknextbutton2() {
		nextbutton2.click();

	}

	@FindBy(xpath = "(//label//div//div)[1]")
	WebElement leakinpipe;

	public void selectleakinpipe() {
		leakinpipe.click();

	}

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextbutton3;

	public void clciknextbutton3() {
		nextbutton3.click();

	}

	public Objectclass2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
