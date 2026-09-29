package Pages;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helper.Config;

public class LoginPage {
    @FindBy(xpath ="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
    WebElement email;

    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    WebElement verifok;
    
    @FindBy (xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
    WebElement mdp ;
    
    public LoginPage() {
    	 PageFactory.initElements(Config.driver, this);
    }
    public void connect(String mail , String pass) {
    			Config.attent(10);
    		    email.sendKeys(mail);
    		    mdp.sendKeys(pass, Keys.ENTER);
    }
    public void verif(String test ) {
    	Assert.assertEquals(verifok.getText(), test);
    }

}
