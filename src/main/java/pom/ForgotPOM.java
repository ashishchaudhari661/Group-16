package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPOM {
@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userid;
@FindBy(xpath="(//label[@class='su-radio-label'])[2]")private WebElement forgotuserid;
@FindBy(xpath="(//label[@class='su-radio-label'])[4]")private WebElement sms;
@FindBy(xpath="//button[@type='submit']")private WebElement reset;
@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
public ForgotPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void forgot1() {
	forgot.click();
}
public void userid1(String user) {
	userid.sendKeys(user);
}
public void forgotuserid1() {
	forgotuserid.click();
}
public void pan1(String pannum) {
	pan.sendKeys(pannum);
}
public void sms1() {
	sms.click();
}
public void reset1() {
	reset.click();
}
}
