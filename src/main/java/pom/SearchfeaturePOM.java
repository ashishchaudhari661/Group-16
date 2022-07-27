package pom;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.FluentFuture;

public class SearchfeaturePOM {
	@FindBy(xpath="//input[@icon='search']")private WebElement search;
	@FindBy(xpath="//span[@class='tradingsymbol']")private List<WebElement> stocks;
	@FindBy(xpath="//button[@data-balloon='Buy']")private WebElement buy;
	@FindBy(xpath="//button[@data-balloon='Sell']")private WebElement sell;
	@FindBy(xpath="(//span[@class='icon icon-trending-up'])[1]")private WebElement chart;
	@FindBy(xpath="//span[@class='icon icon-align-center']")private WebElement marketplace;
	@FindBy(xpath="//span[@class='icon icon-plus']")private WebElement add;

	public SearchfeaturePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void search1(WebDriver driver,String share) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(search));
	search.sendKeys(share);
}
	public void selectshare(WebDriver driver,String mysharename) {
	for(int i=0;i<stocks.size();i++) {
		WebElement currentshare=stocks.get(i);
	String name	=currentshare.getText();
	if(name.equals(mysharename)) {
		Actions act=new Actions(driver);
		act.moveToElement(currentshare);
		act.perform();
		}
	}
}
	public void buy1(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(buy));
		buy.click();
	}
	public void sell1(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(sell));
		sell.click();
	}
	public void chart1(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(chart));
		chart.click();
	}
	public void marketplace1(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(marketplace));
		marketplace.click();
	}
	public void add1(WebDriver driver) {
	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofMillis(3000));
	wait.pollingEvery(Duration.ofMillis(200));
	wait.until(ExpectedConditions.visibilityOf(add));
	add.click();
	}
}