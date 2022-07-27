package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Openbrowser;
import pom.ForgotPOM;
import utility.Excel;

public class ForgetNG {
	WebDriver driver;
	@BeforeMethod
	public void chrome() {
	driver=Openbrowser.browser();
	}
@Test
public void rememberid() throws EncryptedDocumentException, IOException, InterruptedException {
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
@Test
public void forgotid() throws EncryptedDocumentException, IOException, InterruptedException {
	ForgotPOM forgotpom=new ForgotPOM(driver);
	String ID=Excel.data("Sheet", 5, 1);
	String pannum=Excel.data("Sheet", 6, 1);	
	forgotpom.forgot1();
	forgotpom.forgotuserid1();
	forgotpom.pan1(pannum);
	Thread.sleep(3000);
	forgotpom.sms1();
	forgotpom.reset1();
}

}
