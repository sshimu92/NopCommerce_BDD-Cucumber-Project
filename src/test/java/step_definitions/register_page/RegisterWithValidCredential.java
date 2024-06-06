package step_definitions.register_page;

import static org.testng.Assert.assertEquals;

import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step_definitions.Hooks;

public class RegisterWithValidCredential {

	private final WebDriver driver = Hooks.driver;

	RegisterPage registerPage = new RegisterPage(driver);

	@Given("user already open the website nopcommerce")
	public void verifyRegisterPage() {

		assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

	}

	@When("user click on Register button")
	public void clickOnRegisterButton() {

		registerPage.clickOnRegisterButton();

	}

	@Then("user select female as gender")
	public void selectGender() {

		registerPage.selectGender();
	}

	@Then("user input {string} as First Name {string} as Last Name")
	public void user_input_as_first_name_as_last_name(String fn, String ln) {

		registerPage.setFirstName(fn);
		registerPage.setLastName(ln);

	}

	@Then("user input {string} as Email")
	public void user_input_as_email(String e) {

		registerPage.setEmailAddress(e);

	}

	@Then("user input {string} as Password")
	public void user_input_as_password(String pw) {

		registerPage.setPassword(pw);

	}

	@Then("user confirm {string} as Password")
	public void user_confirm_as_password(String cp) {

		registerPage.confirmPassword(cp);

	}

	@Then("user click on {string} button")
	public void user_click_on_button(String string) {

		registerPage.clickOnRegisterButton();

	}
}