package pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utilities;

public class LoginPage extends Utilities {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement UserName;

	@FindBy(id = "password")
	private WebElement PassWord;

	@FindBy(id = "login-button")
	private WebElement LoginButton;

	// By UN = By.xpath("");
	// WebElement ele = driver.findElement(UN);

	public void enterUN(String UN) throws InterruptedException {
		flashing(UserName);
		sendKeys(UserName,UN);	
	}

	public void enterPW(String PW) throws InterruptedException {
		flashing(PassWord);
		sendKeys(PassWord,PW);
	}

	public void clickLoginBtn() throws InterruptedException {
		flashing(LoginButton);
		clickOnElement(LoginButton);
	}
}


