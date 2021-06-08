package drivermanagerfactory;

/*
 * This is a factory that manufactures DriverManager objects. Since DriverManager is an abstract class, you
 * wont receive an atual DriverManager object, just one of its implementations 
 * (ChromeDriverManager, FirefoxDriverManager, etc).
 */
public class DriverManagerFactory {
	
	public static DriverManager getDriverManager(DriverType type) {
		
		DriverManager driverManager;
		
		switch(type) {
		
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
			
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		
		case EDGE:
			driverManager = new EdgeDriverManager();
			break;
		
		case IE:
			driverManager = new IEDriverManager();
			break;
			
		default:
			driverManager = new ChromeDriverManager();
			break;
		}
		
		return driverManager;
	}

}
