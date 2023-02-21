package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	private By sigin = By.xpath("//span[contains(text(),'Login')]");
	private By tilte = By.cssSelector(".text-center>h2");
	private By navBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	private By header = By.cssSelector("div[class*='video-banner'] h3");
	private By popup = By.xpath("//button[contains(text(),'NO THANKS')]");

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	public int popUpSize() {

		return driver.findElements(popup).size();
	}

	public WebElement getpopup() {
		return driver.findElement(popup);

	}

	public LoginPage getLogin() {
		driver.findElement(sigin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

	public WebElement getTitle() {
		return driver.findElement(tilte);

	}

	public WebElement getnavbar() {
		return driver.findElement(navBar);

	}

	public WebElement getHeader() {
		return driver.findElement(header);
	}

}
