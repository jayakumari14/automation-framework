package utilitypackage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotutility {

	WebDriver driver;
	public Screenshotutility(WebDriver driver) {
		this.driver=driver;
	}
		public void techScreenshot(WebDriver driver) throws IOException {
			
			TakesScreenshot scr=(TakesScreenshot) driver;
			File source=scr.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\jaya\\Desktop\\codeFactory\\screenshot.png");
			FileUtils.copyFile(source, destination);
			
			
			
	}

}
