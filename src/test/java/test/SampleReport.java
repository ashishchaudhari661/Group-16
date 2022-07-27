package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class SampleReport {
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
@BeforeTest
	public void data() {
	ExtentSparkReporter spark = new ExtentSparkReporter("ourreport.html");
	extent= new ExtentReports();
	extent.attachReporter(spark);
	extent.setSystemInfo("Testing","regretion");
	}
@Test
	public void test1() {
	test=extent.createTest("test1");
	System.out.println("test");
	}
@Test(timeOut=1000)
public void test2() throws InterruptedException {
	Thread.sleep(2000);
	test=extent.createTest("test2");
	System.out.println("test");
}
@Test
public void test3() {
	test=extent.createTest("test3");
	System.out.println("test");
}
@Test
public void test4() {
	test=extent.createTest("test4");
	System.out.println("test");
}
@Test
public void test5() {
	test=extent.createTest("test5");
	System.out.println("test");
}
@AfterMethod
public void collect(ITestResult result) {
		if(result.getStatus()== ITestResult.SUCCESS) {
			test.log(Status.PASS,result.getName());
		}
		 else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName());
		}
		 else {
			 test.log(Status.SKIP,result.getName());
		 }
	}
	
@AfterTest
public void garbage() {
	extent.flush();
}
}
