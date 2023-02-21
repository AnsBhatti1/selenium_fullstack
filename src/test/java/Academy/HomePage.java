package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.ForgotPassword;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	
	
public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver(); 
		log.info("Driver is Intialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the Home Page");
		}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String ans,String oiuyt ) throws IOException{
		
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);		
	    LoginPage lp = l.getLogin();
		lp.getEmail().sendKeys(ans);
		lp.getPassword().sendKeys(oiuyt);
		
		
		log.info("ITs clicked");
		
		lp.getLogin().click();
		ForgotPassword fp = lp. forgetPass();
		fp.getEmail().sendKeys("aaaa");
		fp.getInstruction().click();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		}

	@DataProvider 
	public Object[][] getData() {
	
		Object[][] data = new Object[1][2];
		data[0][0]="dataprovider@.com";
		data[0][1]="123445";
		return data;
		
	}
	

}
