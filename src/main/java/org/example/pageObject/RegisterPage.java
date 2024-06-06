package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public static WebDriver webDriver;
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		webDriver = driver;	
		
	}
	
    @FindBy(className = "ico-register")
	private WebElement registerButton;
	
    @FindBy(id= "gender-female")
    private WebElement gender;
    
    @FindBy(id= "FirstName")
    private WebElement firstName;
    
    @FindBy(id= "LastName")
    private WebElement lastName;
    
    @FindBy(id= "Email")
    private WebElement email ;
    
    @FindBy(id= "Password")
    private WebElement password ;
    
    @FindBy(id= "ConfirmPassword")
    private WebElement confirmPw ;
    
    
    
  
    
    public void clickOnRegisterButton() {
    	
    	registerButton.click();
    }
    
    public void selectGender() {
      
    	gender.click(); 	
    
    }
    
    public void setFirstName(String fn) {
    	
    	firstName.sendKeys(fn);
    }

    public void setLastName(String ls) {
    	
    	lastName.sendKeys(ls);
    }

    public void setEmailAddress(String e) {
    	
    	email.sendKeys(e);
    	
    }

    public void setPassword(String pw) {
    
    	password.sendKeys(pw);
    	
    }

    public void confirmPassword(String cp) {
    	
    	confirmPw.sendKeys(cp);
    }

}
