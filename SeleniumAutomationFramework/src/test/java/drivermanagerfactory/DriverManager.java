package drivermanagerfactory;

import org.openqa.selenium.WebDriver;

/*DriverManager is an abstract class, dictating that its implementations such as ChromeDriverManager, 
 *FirefoxDriverManager and EdgeDriverManager must expose a set of mandate methods such as
 *createWebDriver(), getWebDriver(), and quitWebDriver(). Abstract class cannot be instantiated, but can be 
 *subclassed. When an abstract class y subclassed, the subclass provides implementations for all the abstract
 *methods in its parent class
 */
public abstract class DriverManager {
	
	protected WebDriver driver;
	
	/*An abstract method is a method that is declared without an implementation (without braces, and followed by a
	 *semicolon). The abstract method is implemented in the different ChromeDriverManager, FirefoxDriverManager, etc. classes.
	 */
	protected abstract void createWebDriver();
	
	public void quitWebDriver() {
		
		if(null != driver) {
			
			driver.quit();
			driver = null;
		}
	}
	
	public WebDriver getWebDriver() {
		
		if(null == driver) {
			
			createWebDriver();
		}
		
		return driver;
	}
	
	
}
