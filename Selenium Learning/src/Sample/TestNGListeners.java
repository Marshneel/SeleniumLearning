package Sample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed and Test Case Details are: " +result.getName());
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped and Test Case Details are: " +result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started and Test Case Details are: " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Succeeded and Test Case Details are: " +result.getName());
		
	}
	
	

}
