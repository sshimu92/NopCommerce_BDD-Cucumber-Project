package step_definitions.Shopping_cart;

import static org.testng.Assert.assertEquals;

import org.example.pageObject.CartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step_definitions.Hooks;

public class AddItemToShoppingCart {

	private final WebDriver driver = Hooks.driver;
	
	CartPage cp = new CartPage(driver);
	
	@Given("User already open the website nopcommerce")
	public void user_already_open_the_website_nopcommerce() {
	    
		Assert.assertEquals(cp.verifyOnHomePage(), "Welcome to our store");
		
	}

	@Then("User click on Electronics")
	public void clickOnElectronics() {
	    
		cp.clickOnElectronics();
	
	}

	@Then("User click on Cell phones")
	public void clickOnCellPhones() {
	    
		cp.clickOnCellPhones();
		
	}

//	@When("User input {string} as Email {string} as Password")
//	public void user_input_as_email_as_password(String eml, String pwd) {
//	   
//		
//		
//	}

	@When("User clicking {string} into a cart")
	public void addingItemOnShoopingCart(String Item) {
	   
		cp.addToCartItem1();
		cp.addToCartItem2();
		
	}

//	@Then("User clicking {string} into a cart")
//	public void addingItem2(String Item2) {
//	  
//		cp.addToCartItem2();
//	}

	@Given("User input {string} as Email {string} as Password")
	public void inputCredentials(String eml, String pwd) {
	   
		cp.clickOnLogin();
		cp.setEmail(eml);
		cp.setPassword(pwd);
		cp.clickLoginButton();
	}

	@When("User navigating to Shopping cart page")
	public void navigatingToShoppingCart() {
	    
		cp.clickOnShoppingCart();
		
	}

	@Then("User should be able to see {string} and {string} on Shopping Cart")
	public void verifyItemsOnShoppingCart(String item1, String item2) {
		
		cp.verifyHowManyItemsOnCart(item1, item2);
		
	   
	}

	
}
