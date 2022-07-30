package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openbrowser {
public static WebDriver browser() {
	//System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	return driver;
}
}
