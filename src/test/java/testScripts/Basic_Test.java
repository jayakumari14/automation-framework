package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebookPageObjects.LoginPageObject;

public class Basic_Test {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com/");

	
LoginPageObject lpo=new LoginPageObject(driver);
lpo.doLogin("email@gmail.com", "email12345");
	}

}
