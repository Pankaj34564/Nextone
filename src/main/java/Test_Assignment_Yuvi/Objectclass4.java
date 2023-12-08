package Test_Assignment_Yuvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Objectclass4 {

	WebDriver driver;

	@FindBy(xpath = "(//label//div//div)[4]")
	WebElement onspecificdate;

	public void selectonspecificdate() {
		onspecificdate.click();

	}

	@FindBy(xpath = "//button[text()='Next']")

	WebElement next;

	public void clicknext() {
		next.click();

	}

	@FindBy(xpath = "(//button[text()='14'])[2]")
	WebElement december14;

	public void selectdecember14() {

		december14.click();

	}

	@FindBy(xpath = "//button[text()='Next']")

	WebElement next2;

	public void clicknext2() {
		next2.click();

	}

	@FindBy(xpath = "//select[@id='2fb1107f62b7900a8af4942e0a0532a856dd41ed']")

	WebElement dropdown;

	public void clickdropdown() {
		dropdown.click();

	}

	public void selecttime() {
		Select s = new Select(dropdown);

		s.selectByVisibleText("03:00");
	}

	@FindBy(xpath = "//button[text()='Next']")

	WebElement next3;

	public void clicknext3() {
		next3.click();

	}

	public Objectclass4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
