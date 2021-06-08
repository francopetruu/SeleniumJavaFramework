package drivermanagerfactory;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

/*IEDriverManager class implements DriverManager abstract class. A new object of type IEDriver is instantiated.
 */
public class IEDriverManager extends DriverManager {
	
	@Override
	public void createWebDriver() {

		InternetExplorerOptions options = new InternetExplorerOptions();
		System.setProperty("webdriver.IE.driver", "./src/test/resources/IEDriverServer.exe");
		//configure IE browser options here
		this.driver = new InternetExplorerDriver(options);
		driver.manage().window().maximize();
	}
}
