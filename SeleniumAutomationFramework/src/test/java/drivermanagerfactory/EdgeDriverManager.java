package drivermanagerfactory;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

/*EdgeDriverManager class implements DriverManager abstract class. A new object of type EdgeDriver is instantiated.
 */
public class EdgeDriverManager extends DriverManager{
	
	@Override
	public void createWebDriver() {

		EdgeOptions options = new EdgeOptions();
		System.setProperty("webdriver.edge.driver", "./src/test/resources/msedgedriver.exe");
		//configure Edge browser options here
		this.driver = new EdgeDriver(options);
		driver.manage().window().maximize();
	}
}
