package StepDef;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {


	@Given("Admin is  on login page")
	public void admin_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions

		Config.driver = new EdgeDriver();
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}
	@When("Admin enter correct username {string} and coorrect password {string}")
	public void admin_enter_correct_username_and_coorrect_password(String email, String mdp) {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage page = new LoginPage();
		page.connect(email, mdp);

	}
	@Then("Admin is directed to homepage that contains {string}")
	public void admin_is_directed_to_homepage_that_contains(String verif) {
	    // Write code here that turns the phrase above into concrete actions
	    LoginPage page = new LoginPage();
	    page.verif(verif);
	    Config.driver.quit();
	}
	
	
	@When("Admin entre incorrect username {string} and incorrect password {string}")
	public void admin_entre_incorrect_username_and_incorrect_password(String email, String mdp) {
		LoginPage page = new LoginPage();
		page.connect(email, mdp);
	}
	@Then("admin is still on login page that contains message {string}")
	public void admin_is_still_on_login_page_that_contains_message(String verif) {
		 LoginPage page = new LoginPage();
		    page.verifincorrect(verif);
		    Config.driver.quit();
	}



}
