package facebookPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resuableAbstractmethods.Abstractcomp;

import resuableAbstractmethods.Abstractcomp; 

public class RegPageObject extends Abstractcomp {

	 WebDriver driver;
		@FindBy(name="firstname")
		WebElement fName;
		
		@FindBy(name="lastname")
		WebElement lName;
		
		@FindBy(xpath="//input[@name=\"reg_email__\"]")
		WebElement mob;
		
		
		public RegPageObject(WebDriver driver) {
			// TODO Auto-generated constructor stub
			super(driver);	 
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}


		public void register (String a, String b ,String c) {
			implicitwait(5);
			maximize();
			fName.sendKeys(a);
			lName.sendKeys(b);
			mob.sendKeys(c);
			
		}

}
