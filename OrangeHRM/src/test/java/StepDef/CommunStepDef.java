package StepDef;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utlis;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
public class CommunStepDef {
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {

	        File screenshotSource =
	                ((TakesScreenshot) Config.driver)
	                .getScreenshotAs(OutputType.FILE);

	        String scenarioName = scenario.getName();

	        File screenshotDestination = new File(
	                "C:\\Users\\agreb\\git\\OrangeHrm\\OrangeHRM"
	                + scenarioName + ".png"
	        );

	        try {
	            FileUtils.copyFile(screenshotSource, screenshotDestination);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    Config.driver.quit();
	} 
	@Given("utlisateur est connecter avec le bon user name el le bon password")
	public void utlisateur_est_connecter_avec_le_bon_user_name_el_le_bon_password() throws Exception {

		Config.driver = new EdgeDriver();
		Config.driver.get(Utlis.getProperty("homeOrange"));
		LoginPage page = new LoginPage();
		page.connect("Admin", "admin123");
	}

}
