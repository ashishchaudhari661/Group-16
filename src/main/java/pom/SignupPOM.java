package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Openbrowser;

public class SignupPOM {


	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement signup;
	@FindBy(xpath="//input[@name='mobile']")private WebElement mobile;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//input[@autocapitalize='none']")private WebElement otp;
	@FindBy(xpath="//button[@type='submit']")private WebElement otpsubmit;
	public SignupPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void create(WebDriver driver,String num) throws InterruptedException {
		signup.click();
		Thread.sleep(2000);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> get=handles.iterator();
		String mainpage=get.next();
		String ourpage=get.next();
		driver.switchTo().window(ourpage);
			Thread.sleep(3000);
			mobile.sendKeys(num);		
		}
	public void add() {
		submit.click();
	}
	public void otp1(String ot) {
	otp.sendKeys(ot);	
	}
	public void otpsubmission() {
		otpsubmit.click();
	}
}
