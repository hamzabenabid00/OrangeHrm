package StepDef;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepDef {
	@Given("utlisateur est connecter et sur la page d'acceuil")
	public void utlisateur_est_connecter_et_sur_la_page_d_acceuil() {
		Config.driver = new EdgeDriver();
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	}
	@When("utilisateur est cliquer sur le menu {string}")
	public void utilisateur_est_cliquer_sur_le_menu(String munetitle) {
		HomePage home =new HomePage();
		home.menuverif(munetitle);
	 
	}
	@Then("la page de  menu est affiche {string}")
	public void la_page_de_menu_est_affiche(String x) {
		HomePage home =new HomePage();
		home.menuverif(x);
		Config.driver.quit();
	}


}
