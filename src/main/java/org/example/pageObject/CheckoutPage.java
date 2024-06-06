package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

	public static WebDriver driver;

	public CheckoutPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "p.content")
	private WebElement cancelNotification;

	@FindBy(className = "cart-label")
	private WebElement shoppingCart;

	@FindBy(css = "div.page-title")
	private WebElement verifyScart;

	@FindBy(id = "checkout_attribute_1")
	private WebElement clickGp;

	@FindBy(id = "termsofservice")
	private WebElement clickOnAgreement;

	@FindBy(id = "checkout")
	private WebElement clickChkout;

	@FindBy(className = "title")
	private WebElement verifyBillingpg;

	@FindBy(xpath = "//div[@class='inputs']//input[@id='BillingNewAddress_FirstName']")
	private WebElement fname;

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lname;

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement email;

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement country;

	@FindBy(id = "BillingNewAddress_StateProvinceId")
	private WebElement state;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement city;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipcode;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement pnumber;
	
	@FindBy(css = "button.button-1.new-address-next-step-button")
    private WebElement cButton;
	
	@FindBy(css = "div.page-title")
	private WebElement ckp;
	
	@FindBy(xpath = "//input[@value ='Ground___Shipping.FixedByWeightByTotal']")
	private WebElement groundoption;
	
	@FindBy(css = "button.button-1.shipping-method-next-step-button")
	private WebElement continuebutton;
	
	@FindBy(xpath = "//input[@id='paymentmethod_0']")
	private WebElement selectpmethod;
	
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']//button[@class='button-1 payment-method-next-step-button']")
	private WebElement clickcbutton;
	
	@FindBy(xpath = "//div[@class='buttons']//button[@class='button-1 payment-info-next-step-button']")
	private WebElement ccbutton;
	
	@FindBy(css = "div.page-title>h1")
	private WebElement completecheckout;
	
	@FindBy(css = "button.button-1.confirm-order-next-step-button")
	private WebElement clickconfirm;
	
	@FindBy(xpath = "//div[@class='title']//strong[contains(text(),'Your order has been successfully processed!')]")
	private WebElement successfulorder;
	
	@FindBy(xpath = "//div[@class='buttons']//button[@class='button-1 order-completed-continue-button']")
	private WebElement cntButton;
	
	
	
	
	
	public void clickOnNotifications() {

		cancelNotification.click();
	}

	public void clickOnShoppingCart() {

		shoppingCart.click();

	}

	public void verifyOnShoppingCartPage() {

		verifyScart.getText();
	}

	public void clickOnGirstWrappingOption() {

		Select s = new Select(clickGp);
		s.selectByVisibleText("No");
	}

	public void clickOnAgreementOption() {

		clickOnAgreement.click();

	}

	public void clickOnCheckout() {

		clickChkout.click();

	}

	public void veifyBillingAddresPage() {

		verifyBillingpg.getText();
	}

	public void enterFirstName(String fn) {

		fname.sendKeys(fn);
	}

	public void enterLastName(String ln) {

		lname.sendKeys(ln);
	}

	public void enterEmail(String e) {

		email.sendKeys(e);
	}

	public void selectCountry(String option) {

		Select s = new Select(country);
		s.selectByVisibleText(option);
		
	}

//	public void selectState(String st) {
//
//        Select s = new Select(state);
//        s.selectByVisibleText(st);
//
//	}

	public void enterCity(String ct) {

		city.sendKeys(ct);
	}

	public void enterAddress(String adrs) {

		address.sendKeys(adrs);
	}

	public void enterZipCode(String zc) {

		zipcode.sendKeys(zc);
	}
	
	public void enterPhoneNumber(String pn) {

		pnumber.sendKeys(pn);
	}

	public void clickContinueButton() {
		
		cButton.click();
		
	}

	public void verifyCheckoutPage() {
		
		ckp.getText();
		
	}

	public void selectGroundAsOption() {
		
		groundoption.click();
		
	}

	public void clickOnContinueButton() {
		
		continuebutton.click();
		
	}

    public void selectPaymentMethd() {
		
    	selectpmethod.click();
		
	}

    public void clickCbutton() {
    	
    	clickcbutton.click();
    }
    
    public void clickcontButton() {
    	
    	ccbutton.click();
    }
    
    public void verifyCompleteChkPage() {
    	
    	completecheckout.getText();
    	
    }

    public void clickConfirmButton() {
    	
    	clickconfirm.click();
    	
    }

    public void verifySuccesfulOrdermsg() {
    	
    	successfulorder.getText();
    	
    	
    }

    public void clickOnCntB() {
    	
    	cntButton.click();
    	
    }
}
