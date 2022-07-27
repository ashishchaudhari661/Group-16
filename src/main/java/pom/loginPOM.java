package pom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Excel;

public class loginPOM {
@FindBy(xpath="//input[@type='text']")private WebElement login;
@FindBy(xpath="//input[@type='password']")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement submit;
@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
@FindBy(xpath="//input[@id='pin']")private WebElement pin;
@FindBy(xpath="//button[@type='submit']")private WebElement continuous;
public loginPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void login1(String user) throws EncryptedDocumentException, IOException {
	login.sendKeys(user);
}
public void password1(String pass) throws EncryptedDocumentException, IOException {
	password.sendKeys(pass);
}
public void enter() {
	submit.click();
}
public void forgot1() {
	forgot.click();
}
public void pin1(WebDriver driver,String pins) {
WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
wait.until(ExpectedConditions.visibilityOf(pin));
	pin.sendKeys(pins);
}
public void ok() {
	continuous.click();
}




}
