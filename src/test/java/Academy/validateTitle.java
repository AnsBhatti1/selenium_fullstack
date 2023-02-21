package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import dev.failsafe.internal.util.Assert;
import resources.base;

public class validateTitle extends base {
	public WebDriver driver;
	LandingPage lp;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is Intialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the Home Page");
	}

	@Test
	public void basePageNavigation() throws IOException {

		LandingPage lp = new LandingPage(driver);    
		assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		log.info("Successfully validate Text Message");
	}

	@Test

	public void validateHeader() throws IOException {

		System.out.println("am i going inside it");
		assertEquals(lp.getHeader().getText(), "An Academy to learn Everything about Testing");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
