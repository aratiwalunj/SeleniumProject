package lpack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
public void onTestStart(ITestResult result)
{
	System.out.println("Test execution started" +result.getTestName());
}
	
public void onFinish(ITestContext context)
{
	System.out.println("Test finished" 	);
}
public void onTestSuccess(ITestResult result)
{
	System.out.println("Test execution successful" +result.getName());
}
public void onTestFailure(ITestResult result)
{
	System.out.println("Test failure"  +result.getName());
}
public void onTestSkipped(ITestResult result)
{
	System.out.println("Test skipped"  +result.getName());
}
	
}
