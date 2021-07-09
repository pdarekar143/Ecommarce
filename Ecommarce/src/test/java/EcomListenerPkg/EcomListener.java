package EcomListenerPkg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class EcomListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestStarted"+result);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestSuccessfull"+result);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestIsFailed"+result);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestIsSkipped"+result);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestFailedPercentage"+result);
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Testing is Started"+context);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Testing is completed"+context);
		
	}

}
