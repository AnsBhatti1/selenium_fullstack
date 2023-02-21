package StepDefinations;

import java.io.IOException;

import org.junit.runner.RunWith;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.base;

public class StepDefination extends base {

		@Given("intializa the browser with chrome")
		public void intializa_the_browser_with_chrome() throws Throwable  {
			// Write code here that turns the phrase above into concrete actions
			
			driver = initializeDriver();
		}

		@Given("Navigate to {string} Site")
		public void navigate_to_site(String string) throws Throwable{
			// Write code here that turns the phrase above into concrete actions
			
			driver.get(string);
		}

		@Given("Click on the Login link in home page to land on secure sign in page")
		public void click_on_the_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			
			LandingPage l = new LandingPage(driver);		
		   if(l.popUpSize()>0) {
			   l.getpopup().click();
		   }
		   l.getpopup().click();
		}

		@When("user enters {string} and {string} and logs in")
		public void user_enters_and_and_logs_in(String string, String string2) throws Throwable {
			// Write code here that turns the phrase above into concrete actions
		
			   LoginPage lp = new LoginPage(driver);
				lp.getEmail().sendKeys(string);
				lp.getPassword().sendKeys(string2);
				lp.getLogin().click();
		}

		@Then("Verify that user successful logged in")
		public void verify_that_user_successful_logged_in() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			
			
		}

	}
