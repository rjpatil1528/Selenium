package sele.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisenableselected {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://register.freecrm.com/register/");
	
	// 1. IsDisplayed() method......applicable for all elements.
	boolean b1 = driver.findElement(By.name("action")).isDisplayed();
	System.out.println(b1);      //true
	
	// 2. IsEnabled() method......used with buttons
	boolean b2 = driver.findElement(By.name("action")).isEnabled();
	System.out.println(b2);    //true
	
	// 3. IsSelected() method........only applicable for checkbox, dropdowns, radiobutton
	boolean b3 = driver.findElement(By.id("terms")).isSelected();
	System.out.println(b3);    //false
	
	
}
}
