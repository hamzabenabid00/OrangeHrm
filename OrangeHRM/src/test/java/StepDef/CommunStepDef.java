package StepDef;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("utlisateur est connecter avec le bon user name el le bon password")
	public void utlisateur_est_connecter_avec_le_bon_user_name_el_le_bon_password() {

		Config.driver = new EdgeDriver();
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage page = new LoginPage();
		page.connect("Admin", "admin123");
	}

}
