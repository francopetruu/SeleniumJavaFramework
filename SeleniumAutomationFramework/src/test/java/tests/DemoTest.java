package tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import drivermanagerfactory.DriverManager;
import drivermanagerfactory.DriverManagerFactory;
import drivermanagerfactory.DriverType;
import pages.HomePage;

public class DemoTest {
	
	DriverManager driverManager;
	WebDriver driver;

	
	
	@Test
	public void phpLoginTest() throws InterruptedException {
		
		//we always have to instantiate the driver in this way on the test methods, we are getting a driverManager object of the type CHROME from the DriverManagerFactory class
		driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
		
		//then we call the getWebDriver() method 
		driver = driverManager.getWebDriver();
		
		HomePage home = new HomePage(driver);
		
		driver.get("https://phptravels.com/demo/");
		
		//save the original tab in a string
		String homeTab = driver.getWindowHandle();
		
		home.logginButton.click();
		
		//create an arraylist with the two tabs as values
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		
		//delete the original tab
		newTab.remove(homeTab);
		
		//change focus to new tab
		driver.switchTo().window(newTab.get(0));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getTitle(), "Login - PHPTRAVELS");
		
	}

}
