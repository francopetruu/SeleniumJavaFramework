package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

/* This class will help to create different types of "listeners" to do some particular actions
 * during a certain point of the test. Now only print statement is implemented, but in the future
 * it can be added the ExtentReports functionality
 */
public class TestNGListeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("******* Test started: " + result.getName() + " *******");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("******* Test is successful: " + result.getName() + " *******");
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("******* Test failed: " + result.getName() + " *******");
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("******* Test skipped: " + result.getName() + " *******");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	
	public void onStart(ITestResult context) {
		
		
	}
	
	public void onFinish(ITestResult context) {
		
		System.out.println("******* Test completed: " + context.getName() + " *******");
	}
}
