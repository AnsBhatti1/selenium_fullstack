package Academy;



import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base {
	public WebDriver driver;

	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver(); 
		log.info("Driver is Intialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the Home Page");
		}
	
	@Test
	public void basePageNavigation() throws IOException{
		

		LandingPage lp = new LandingPage(driver);
	   assertTrue(lp.getnavbar().isDisplayed());
	    log.info("NAVBAR is displayed");
	    }
	@AfterTest
	public void teardown() {
		driver.close();
		}
	

}
