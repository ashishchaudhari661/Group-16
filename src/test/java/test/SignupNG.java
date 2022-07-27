package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pojo.Openbrowser;
import pom.SignupPOM;
import utility.Excel;

public class SignupNG {
	WebDriver driver;
	@BeforeClass
	public void crome() {
	driver =Openbrowser.browser();
	}
	@Test(priority=-1)
	public void signup1() throws EncryptedDocumentException, IOException, InterruptedException {
		String num=Excel.data("Sheet", 5, 0);
		Thread.sleep(1000);
		SignupPOM zrd=new SignupPOM(driver);
		zrd.create(driver, num);
		zrd.add();
	}
	@Test(dependsOnMethods="signup1")
	public void enterOTP() throws EncryptedDocumentException, IOException, InterruptedException {
		String ot=Excel.data("Sheet", 6, 0);
		SignupPOM zrd=new SignupPOM(driver);
		Thread.sleep(3000);
		zrd.otp1(ot);
		zrd.otpsubmission();
	}
}
