package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Take {
	public static String time() {
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("DD-mm-yyyy HH-mm-ss");
		LocalDateTime currentTime=LocalDateTime.now();
		String tm =dtf.format(currentTime);
		return tm;
	}
public static void screenshot(WebDriver driver,String name) throws IOException {
	String tm=Take.time();
	TakesScreenshot obj=(TakesScreenshot)driver;
	File source =obj.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\ashis\\Downloads\\screenshot\\"+name+""+tm+".png");
	FileHandler.copy(source,destination);
}
}
