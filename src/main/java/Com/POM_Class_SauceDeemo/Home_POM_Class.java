package Com.POM_Class_SauceDeemo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_POM_Class {

	WebDriver driver;
	// Click on menu button
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;

	public void menubuttonclick() {
		menubutton.click();
	}

	// click on logout
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutbutton;

	public void logoutbuttonclick() {
		logoutbutton.click();
	}

	// Add to cart

	@FindBy(xpath = "(//button[text()='Add to cart'])[2]")
	private WebElement bikelight;

	public void bikelightclick() {
		bikelight.click();
	}

	// cart click

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	private WebElement containercart;

	public String containercartgettext() {
		return containercart.getText();
	}

	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	private WebElement bucket;

	public void bucketclick() {
		bucket.click();
	}
	// All product selection

	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> allproduct;

	public void allproductclick() {
		for (WebElement str : allproduct) {
			str.click();

		}
	}

	public Home_POM_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
