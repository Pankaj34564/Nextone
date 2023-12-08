package Test_Assignment_Yuvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objectclass {

	WebDriver driver;

	@FindBy(css = "#postal_code_639305f5f0633")

	WebElement city;

	public void entercity() {
		city.clear();
		city.sendKeys("Chennai");
	}

	@FindBy(xpath = "//form//div//button")
	WebElement go;

	public void clickgo() {
		go.click();

	}

	@FindBy(xpath = "//button[text()='Next']")

	WebElement next;

	public void clicknext() {
		next.click();

	}

	public Objectclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
