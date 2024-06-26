package step_definitions.Checkout_page;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.example.pageObject.CheckoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step_definitions.Hooks;
import utilities.ScreenShots;

public class CheckoutItems {

	private final WebDriver driver = Hooks.driver;
	WebDriverWait wait;
	
	CheckoutPage chkpage = new CheckoutPage(driver);
	
	
	@Then("User click on Close notification")
	public void cancelNotification() {
	    
		chkpage.clickOnNotifications();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		boolean clicked = false;
		while (!clicked) {
		    try {
		        driver.findElement(By.cssSelector("p.content")).click();
		        clicked = true;
		    } catch (StaleElementReferenceException e) {
		        // Element is stale, retry
		    }
		}
		
	}
	
	@Then("User navigating to cart page")
	public void clickOnShoppingCart() {
	    
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement element = driver.findElement(By.className("cart-label"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		
		chkpage.clickOnShoppingCart();
		
		ScreenShots.screenShot(driver, "cartpage");
		
		
	}

	@Then("User already on {string} as cart page")
	public void verifyShoppingCart(String string) {
	   
		assertEquals(driver.getTitle(),"nopCommerce demo store. Shopping Cart");
		chkpage.verifyOnShoppingCartPage();
		
		ScreenShots.screenShot(driver, "verifyshoppingcart");
		
	}

	@Then("User select {string} as Gift wrapping option")
	public void selectOptions(String string) {
	   
		chkpage.clickOnGirstWrappingOption();
		
		ScreenShots.screenShot(driver, "option");
		
	}

	@Then("User verifying total item and total price")
	public void verifyTotalItemAndPrice() {
	    
		
	}

	@Then("User click on Terms of service option")
	public void clickOnTermsAgreement() {
	   
		chkpage.clickOnAgreementOption();
		ScreenShots.screenShot(driver, "terms of service");
	}

	@Then("User click on CHECKOUT button")
	public void clickOnCheckout() {
	    
		chkpage.clickOnCheckout();
		ScreenShots.screenShot(driver, "checkout");
		
	}

	@Then("User navigate to Billing address page")
	public void verifyBillingPage() {
	  
		assertEquals(driver.getTitle(),"nopCommerce demo store. Checkout");
	}

	@Then("User input {string} as First name {string} as Last name")
	public void enterFirstAndLastName(String fname, String lname) {
	    
		chkpage.enterFirstName(fname);
		chkpage.enterLastName(lname);
		ScreenShots.screenShot(driver, "input name");
		
	}

	@Then("User input {string} as Email")
	public void enterEmailAddress(String eml) {
	    
		chkpage.enterEmail(eml);
		ScreenShots.screenShot(driver, "input email");
		
		
	}

	@Then("User select {string} as Country Name")
	public void selectCountryName(String country) {
	    
		chkpage.selectCountry("United States");
		ScreenShots.screenShot(driver, "select country");
//		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}

//	@Then("User select {string} as State")
//	public void selectState(String state) {
//	    
//		chkpage.selectState("Oregon");
//		
//		
//	}

	@Then("User input {string} as City")
	public void enterCityName(String cty) {
	   
		chkpage.enterCity(cty);
		ScreenShots.screenShot(driver, "select city");
		
	}

	@Then("User input {string} as Address {int}")
	public void enterAddress(String adrs, Integer int1) {
	    
		chkpage.enterAddress(adrs);
		ScreenShots.screenShot(driver, "input address");
		
	}

	@Then("User input {string} as Zip code")
	public void enterZipCode(String zc) {
	    
		chkpage.enterZipCode(zc);
		ScreenShots.screenShot(driver, "input zipcode");
		
	}

	@Then("User input {string} as Phone number")
	public void enterPhoneNumber(String pn) {
	    
		chkpage.enterPhoneNumber(pn);
		ScreenShots.screenShot(driver, "input phone number");
		
	}

	@Then("User click on CONTINUE button")
	public void clickOnContinueButton() {
	    
		chkpage.clickContinueButton();
		ScreenShots.screenShot(driver, "continue button");
		
	}

	@Then("User verify Checkout page")
	public void verifyCheckoutpg() {
	    
		assertEquals(driver.getTitle(), "nopCommerce demo store. Checkout");
		ScreenShots.screenShot(driver, "verify checkoutPage");
		
	}

	@Then("User click on Ground \\(${double})option")
	public void selectGroundOption(Double grp) {
	    
		chkpage.clickContinueButton();
		ScreenShots.screenShot(driver, "ground option");
		
	}

	@Then("User click on Check Money Order as payment option")
	public void selectPaymentMethod() {
	    
		chkpage.selectPaymentMethd();
		ScreenShots.screenShot(driver, "payment option");
		
	}

//	@Then("User again click on CONTINUE button")
//	public void clickOnContButton() {
//	    
//		chkpage.clickcontButton();
//	}

	@Then("User verify Checkout complete page")
	public void verifyCompleteCheckoutPage() {
	    
		assertEquals(driver.getTitle(),"Checkout");
		ScreenShots.screenShot(driver, "verify page");
		
	}

	@Then("User click on CONFIRM button")
	public void clickOnConfirmButton() {
	    
		chkpage.clickConfirmButton();
		ScreenShots.screenShot(driver, "confirm");
		
	}

	@Then("User should be able to see {string} message")
	public void verifySuccessfulMessage(String msg) {
	    
		assertEquals(driver.getTitle(), "Your order has been successfully processed!");
		ScreenShots.screenShot(driver, "message");
	}

	@When("User again click on CONTINUE button")
	public void clickCntButton() {
	   
		chkpage.clickcontButton();
		ScreenShots.screenShot(driver, "continue");
		
	}

	@Then("User navigate to Home page")
	public void user_navigate_to_home_page() {
	    
		assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
		ScreenShots.screenShot(driver, "home page");
		
	}
}
