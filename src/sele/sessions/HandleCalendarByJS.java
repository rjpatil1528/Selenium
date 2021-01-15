package sele.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarByJS {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.spicejet.com/");
	
	WebElement date = driver.findElement(By.id("view_fulldate_id_1"));
	String dateVal = "30-10-2020";
	selectDatebyJS(driver, date, dateVal);
	
}
    public static void selectDatebyJS(WebDriver driver, WebElement element, String dateVal) {
    	JavascriptExecutor js = ((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].setAttribute('value',"+dateVal+"');", element);
    	
    }



}
