package step_definitions.login_page;

import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import step_definitions.Hooks;

public class LoginWithInvalidCredential {

	private final WebDriver driver = Hooks.driver;
	
	LoginPage lp = new LoginPage(driver);


	@Then("user get error <{string}> as error message")
	public void verifyUserError(String errMsg) {
	   
		Assert.assertEquals(errMsg, lp.loginErrorMessage());
		
	}
}
