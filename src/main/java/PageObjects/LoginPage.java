package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public By email = By.cssSelector("[id='user_email']");
	private By password = By.cssSelector("[type='password']");
	private By login = By.cssSelector("[value='Log In']");
	private By forgetPassword = By.cssSelector("[href*='password/new']");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public ForgotPassword forgetPass() {
		driver.findElement(forgetPassword).click();
		return new ForgotPassword(driver);
	}

	public WebElement getEmail() {
		return driver.findElement(email);

	}

	public WebElement getPassword() {
		return driver.findElement(password);

	}

	public WebElement getLogin() {
		return driver.findElement(login);

	}
}
