package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import facebookPageObjects.LoginPageObject;
import facebookPageObjects.RegPageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class GenericTestforall {
	   WebDriver driver;
	   
		public WebDriver initialisedriver() throws IOException {
		Properties prop=new Properties();	
//		FileInputStream fis=new FileInputStream("C:\\Users\\Cloud Laptop\\eclipse-workspace\\Autoframwork\\src\\main\\java\\resources\\globaldata.properties");
//		prop.load(fis);
		String browsername =prop.getProperty("browser");
	      System.out.println(browsername);
		if(browsername.equals("chrome")) {
			 driver=new ChromeDriver();
			 
		}
		else if(browsername.equalsIgnoreCase("firefox"));
		{
			 driver=new FirefoxDriver();
		}
		return driver;
		
		}
		
		
		//public  void launchapp() throws IOException {
		//driver=	initialisedriver();	
		//	LoginPageObjectclss lg=new LoginPageObjectclss(driver);
		//lg.goToLogin();
		//}
		
		public void launchandLogin() throws IOException {
		    initialisedriver();	
		    LoginPageObject lg=new LoginPageObject(driver);
		lg.goToLogin();
		//lg.dologin("abvc","342");
			
		}
		
		public void tryloginandgotoreg() throws IOException {
			initialisedriver();	
			LoginPageObject lg=new LoginPageObject(driver);
			lg.goToLogin();
			lg.enterUnandPw("jiya","12345");
			lg.goToRegister();
			
		}
		
		public void doRegistarion() {
			RegPageObject rgo=new RegPageObject(driver);
			rgo.register("jaya","jiya","jiya123");
		}
		
		}