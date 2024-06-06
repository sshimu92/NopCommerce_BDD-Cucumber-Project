package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver webDriver;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		webDriver = driver;
		
	}
	
	@FindBy(className ="ico-login")
	private WebElement clickLogin;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement loginButton;
	
	@FindBy(css = "h2")
	private WebElement welcomeToOurStore;
	
	@FindBy(className = "message-error.validation-summary-errors")
	private WebElement errMsg;
	
	
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

    public boolean loginIsSuccessful() {
    	
    	return welcomeToOurStore.isDisplayed();
    	
    }

    public String loginErrorMessage() {
    	
    	return errMsg.getText();
    } 
    
}
