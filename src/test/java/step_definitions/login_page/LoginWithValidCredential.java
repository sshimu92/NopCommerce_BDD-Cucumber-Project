package step_definitions.login_page;

import static org.testng.Assert.assertEquals;

import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step_definitions.Hooks;
import utilities.ScreenShots;

public class LoginWithValidCredential {

	private final WebDriver driver = Hooks.driver;
	
	LoginPage lp = new LoginPage(driver);
	
	@When("user click on Log in button")
	public void clickOnLogin() {
	
		lp.clickOnLogin();
//		assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
		ScreenShots.screenShot(driver, "login");
	}

	@Then("user input {string} as Email {string} as Password")
	public void inputCredential(String em, String pw) {
	    
		ScreenShots.screenShot(driver, "C:\\Users\\shimu\\eclipse-workspace\\NopcommerceAutomation\\test-output\\ScreenShots.png");
		lp.setEmail(em);
		lp.setPassword(pw);
		
	}

	@Then("user click on LOG IN button")
	public void clickOnLoginButton() {
	    
		lp.clickLoginButton();
	
	}

	@Then("user already on homepage")
	public void verifyAlreadyOnHomePage() {
	   
		Assert.assertTrue(lp.loginIsSuccessful());
		
	}

	
}
