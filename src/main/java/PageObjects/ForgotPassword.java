package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
    

	public WebDriver driver;

	private	By email = By.cssSelector("[id='user_email']");
	private	By sendMeInstruction = By.cssSelector("[type='submit']");

	public ForgotPassword(WebDriver driver) {

		this.driver = driver;
	}
	

	public WebElement getEmail() {
		return driver.findElement(email);

	}
	public WebElement getInstruction() {
		return driver.findElement(sendMeInstruction);

	}
}
