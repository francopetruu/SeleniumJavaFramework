package drivermanagerfactory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*ChromeDriverManager class implements DriverManager abstract class. A new object of type ChromeDriver is instantiated.
 */
public class ChromeDriverManager extends DriverManager {
	
	@Override
	public void createWebDriver() {
		
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		//configure chrome browser options here
		this.driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
}
