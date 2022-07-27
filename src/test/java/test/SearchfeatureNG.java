package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Openbrowser;
import pom.SearchfeaturePOM;
import pom.loginPOM;
import utility.Excel;
@Listeners(Listner.class)
public class SearchfeatureNG {
	WebDriver driver;
	@BeforeMethod
	public void chromeandlogine() throws EncryptedDocumentException, IOException, InterruptedException {
		driver=Openbrowser.browser();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://kite.zerodha.com/");
		loginPOM zerodhaelements=new loginPOM(driver);
		String user=Excel.data("Sheet", 0, 0);
		String pass=Excel.data("Sheet", 1, 0);
		String ok=Excel.data("Sheet", 2, 0);
		zerodhaelements.login1(user);
		zerodhaelements.password1(pass);
		zerodhaelements.enter();
		zerodhaelements.pin1(driver,ok);
		zerodhaelements.ok();
	}
	@Test(priority=-1)
	public void buy() throws EncryptedDocumentException, IOException, InterruptedException {
		SearchfeaturePOM sfpom=new SearchfeaturePOM(driver);
		String share=Excel.data("Sheet", 9, 0);
		String sharename=Excel.data("Sheet", 10, 0);
		sfpom.search1(driver,share);
		sfpom.selectshare(driver, sharename);
		sfpom.buy1(driver);
	}
	@Test
	public void sell() throws EncryptedDocumentException, IOException, InterruptedException {
		SearchfeaturePOM sfpom=new SearchfeaturePOM(driver);
		String share=Excel.data("Sheet", 9, 0);
		String sharename=Excel.data("Sheet", 10, 0);
		sfpom.search1(driver,share);
		sfpom.selectshare(driver, sharename);
		sfpom.sell1(driver);
	}
	@Test(priority=1)
	public void chart() throws EncryptedDocumentException, IOException, InterruptedException {
		SearchfeaturePOM sfpom=new SearchfeaturePOM(driver);
		String share=Excel.data("Sheet", 9, 0);
		String sharename=Excel.data("Sheet", 10, 0);
		sfpom.search1(driver,share);
		sfpom.selectshare(driver, sharename);
		sfpom.chart1(driver);
	}
	@Test(priority=2)
	public void marketplace() throws EncryptedDocumentException, IOException, InterruptedException {
		SearchfeaturePOM sfpom=new SearchfeaturePOM(driver);
		String share=Excel.data("Sheet", 9, 0);
		String sharename=Excel.data("Sheet", 10, 0);
		sfpom.search1(driver,share);
		sfpom.selectshare(driver, sharename);
		sfpom.marketplace1(driver);
	}
	@Test(priority=3,timeOut=500)
	public void add() throws EncryptedDocumentException, IOException, InterruptedException {
		SearchfeaturePOM sfpom=new SearchfeaturePOM(driver);
		String share=Excel.data("Sheet", 9, 0);
		String sharename=Excel.data("Sheet", 10, 0);
		sfpom.search1(driver,share);
		sfpom.selectshare(driver, sharename);
		Thread.sleep(1000);
		sfpom.add1(driver);
	}
}
