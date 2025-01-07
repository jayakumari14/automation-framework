package resuableAbstractmethods;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class Abstractcomp {
	WebDriver driver;

	public Abstractcomp(WebDriver driver) {
		this.driver = driver;
	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public void minimize() {

		driver.manage().window().minimize();

	}

	public void closebrowser() {

		driver.quit();

	}

	public void implicitwait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
}
