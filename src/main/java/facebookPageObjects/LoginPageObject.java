package facebookPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
 
	WebDriver driver;
	
	
	@FindBy(id="email") 
	WebElement userEmail;
	
	@FindBy(id="pass")
	WebElement userPassword;
	
	@FindBy(name="login")
	WebElement LoginButton;
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String em,String pw) {
		userEmail.sendKeys(em);
		userPassword.sendKeys(pw);
		LoginButton.click();
	}
	

}
