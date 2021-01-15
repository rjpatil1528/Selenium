package sele.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //launch chromedriver
     
	driver.get("D:\\RAHUL\\New folder");
	
// 1. id	
	//driver.findElement(By.id("firstname")).sendKeys("Rahul");
	
// 2. name
	//driver.findElement(By.name("firstname")).sendKeys("Rahul");
	
// 3. x path
	//driver.findElement(By.xpath("xpath")).sendKeys("rahul");
}
}