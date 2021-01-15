package sele.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovemnt {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize window
		driver.manage().deleteAllCookies();   //Delete all coockies
		
		driver.get("https://www.cricbuzz.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("News"))).build().perform();
		
		driver.findElement(By.linkText("Topics")).click();
	}
	
	
	
	
}
