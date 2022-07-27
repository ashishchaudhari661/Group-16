package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {
public static WebDriver browser() {
	System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	return driver;
}
}
