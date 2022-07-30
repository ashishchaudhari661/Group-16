package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pojo.Openbrowser;
import pom.ForgotPOM;
import pom.loginPOM;
import utility.Excel;

public class LoginepageNG {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void makereport() {
ExtentSparkReporter spark=new ExtentSparkReporter("firstReport.html");//report generator
	extent=new ExtentReports();	//collect all information 
extent.attachReporter(spark);		//data shared from extent to spark..
extent.setSystemInfo("Build name","loginUI");
extent.setSystemInfo("Team","Group 16");
extent.setSystemInfo("Tester","ashish");
	}
	@BeforeMethod
	public void chrome() {
	driver=Openbrowser.browser();
	}
	@Test
public void zerodhalogin() throws EncryptedDocumentException, IOException, InterruptedException {
	test=extent.createTest("zerodhalogin");	//createTest return ExtentTest class.
	loginPOM zerodhaelements=new loginPOM(driver);
	String user=Excel.data("Sheet", 0, 0);
	String pass=Excel.data("Sheet", 1, 0);
	String ok=Excel.data("Sheet", 2, 0);
	WebElement Elogo=driver.findElement(By.xpath("//img[@alt='Kite']"));
	WebElement Alogo=driver.findElement(By.xpath("//img[@alt='Kite']"));
	SoftAssert soft=new SoftAssert();
	soft.assertSame(Elogo,Alogo );
	zerodhaelements.login1(user);
	zerodhaelements.password1(pass);
	zerodhaelements.enter();
	zerodhaelements.pin1(driver,ok);
	zerodhaelements.ok();
	String home=driver.getTitle();
	Assert.assertEquals(home,"Kite - Zerodha's fast and elegant flagship trading platform");
	soft.assertAll();
}
	public void rememberid() throws EncryptedDocumentException, IOException, InterruptedException {
		test=extent.createTest("rememberID");
		ForgotPOM forgotpom=new ForgotPOM(driver);
		String ID=Excel.data("Sheet", 5, 1);
		String pannum=Excel.data("Sheet", 6, 1);
		forgotpom.forgot1();
		forgotpom.userid1(ID);
		forgotpom.pan1(pannum);
		Thread.sleep(3000);
		forgotpom.sms1();
		forgotpom.reset1();
	}
	
	@AfterMethod
	public void aftertest(ITestResult result) {
		if(result.getStatus() ==ITestResult.SUCCESS) {
			test.log(Status.PASS,result.getName());
		}
		else if(result.getStatus() ==ITestResult.FAILURE){
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
	@Test 
	public void ashish() {
		System.out.println("hello");
	}
}
