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
	@When("Admin enter correct username and passwword")
	public void admin_enter_correct_username_and_passwword() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage page = new LoginPage();
		page.connect("Admin", "admin123");
	 
	}
	@Then("Admin is directed to homepage")
	public void admin_is_directed_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage page = new LoginPage();
		page.verif("Dashboard");
		
	  
	}



}
