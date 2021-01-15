package sele.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
public static void main(String[] args) {
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\Downloads\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();  //launch FireFox
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //launch chromedriver
   driver.get("http://www.google.com");
   
   
   
  String title = driver.getTitle();  //for getting title
  System.out.println(title);
  
  
   //validation point
    if (title.equals("Google")) {
    	System.out.println("correct title");
     }
    else {
    	System.out.println("in-correct title");
    }
    
    System.out.println(driver.getCurrentUrl());  //for current url
    
    //System.out.println(driver.getPageSource());  //page source
    
    driver.quit();  //quit the browser
}
}
