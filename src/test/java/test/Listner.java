package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Take;

public class Listner extends Base implements ITestListener{

	public  void onTestStart(ITestResult result) {
	System.out.println("before starting test"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("tset passed successfully"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
	try {
		Take.screenshot(driver,result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped"+result);
	}
}
