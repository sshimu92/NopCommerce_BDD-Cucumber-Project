package org.example.pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public static WebDriver driver;
	
	public CartPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(className ="ico-login")
	private WebElement clickLogin;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[text()='Welcome to our store']")
	private WebElement verifyOnPage;
	
	@FindBy(xpath = "//a[text()='Electronics ']")
	private WebElement clickOnElc;
	
	@FindBy(xpath = "//a[contains(text(),' Cell phones')]")
	private WebElement clickOnCp;
	
	@FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]")
	private WebElement addProduct1;
	
	@FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]")
	private WebElement addProduct2;
	
	@FindBy(css = "p.content")
	private WebElement cancelNotification;
	
	@FindBy(className = "cart-label")
	private WebElement shoppingCart;
	
	@FindBy(css = "div.items")
	private List<WebElement> verifyItems;
	
	
    public void clickOnLogin() {
		
		clickLogin.click();	
	}
	
	public void setEmail(String e) {
		
		email.sendKeys(e);
	}

    public void setPassword(String pw) {
    	
    	password.sendKeys(pw);
    }

    public void clickLoginButton() {
    	
    	loginButton.click();
    }
	
	
	public String verifyOnHomePage() {
		
		return verifyOnPage.getText();
	}
	
    public void clickOnElectronics() {
		
		clickOnElc.click();
	}
    
    public void clickOnCellPhones() {
		
		clickOnCp.click();
	}
	
	
	public void addToCartItem1() {
		
		addProduct1.click();
	}
	
    public void addToCartItem2() {
		
		addProduct2.click();
	}

    public void clickOnNotifications() {
		
		cancelNotification.click();
	}
    
    public void clickOnShoppingCart(){
    	
    	shoppingCart.click();
    }

    public void verifyHowManyItemsOnCart(String item1, String item2) {
    	
    	verifyItems.addFirst(addProduct1);
    	verifyItems.addLast(addProduct2);
    }

//    @Test
//    public void verifyCartElements() {
//        // Array of expected element names
//        String[] expectedNames = {"name1", "name2", "name3"}; // Add the expected names here
//
//        // Extract the text of each element in the cart
//        String[] cartElementNames = new String[cartElements.size()];
//        for (int i = 0; i < cartElements.size(); i++) {
//            cartElementNames[i] = cartElements.get(i).getText();
//        }
//
//        // Check if all expected names are present in the cart
//        for (String expectedName : expectedNames) {
//            boolean nameFound = false;
//            for (String cartElementName : cartElementNames) {
//                if (cartElementName.equals(expectedName)) {
//                    nameFound = true;
//                    break;
//                }
//            }
//            Assert.assertTrue(nameFound, "Expected element '" + expectedName + "' not found in the cart.");
//        }
//    }
}
