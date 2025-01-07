package testScripts;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("I am successfully executed "+ result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("I am successfully not executed "+result.getMethod().getMethodName());
	}
	public void onTestStart(ITestResult result){
		System.out.println("I am Started "+ result.getMethod().getMethodName());
		
			
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("I am skipped"+result.getMethod().getMethodName());
		
	}
	
}
