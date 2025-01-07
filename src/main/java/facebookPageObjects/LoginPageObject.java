package facebookPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resuableAbstractmethods.Abstractcomp;

public class LoginPageObject extends Abstractcomp{
 
	WebDriver driver;
	
	@FindBy(id="email") 
	WebElement userEmail;
	
	@FindBy(id="pass")
	WebElement userPassword;
	
	@FindBy(name="login")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	WebElement regButton;
	
	
	public LoginPageObject(WebDriver driver) {
		super(driver);	 
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void doLogin(String em,String pw) {
		maximize();
		implicitwait(5);
		userEmail.sendKeys(em);
		userPassword.sendKeys(pw);
		LoginButton.click();
	}
	
	public void goToLogin() {
	     driver.get("https://www.facebook.com/");
	}
	public void enterUnandPw(String em, String pw) {
		maximize();
		implicitwait(5);
		userEmail.sendKeys(em);
	    userPassword.sendKeys(pw);
		
	}
	public void goToRegister() {
		maximize();
		implicitwait(5);
		regButton.click();
		
	}
	

}
