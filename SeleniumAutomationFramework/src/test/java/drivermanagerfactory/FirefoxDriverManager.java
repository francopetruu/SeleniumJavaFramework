package drivermanagerfactory;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/*FirefoxDriverManager class implements DriverManager abstract class. A new object of type FirefoxDriver is instantiated.
 */
public class FirefoxDriverManager extends DriverManager {

	@Override
	public void createWebDriver() {

		FirefoxOptions options = new FirefoxOptions();
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
		//configure firefox browser options here
		this.driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
	}
}