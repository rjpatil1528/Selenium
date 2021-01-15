package sele.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicwebTableHandle {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://ui.cogmento.com/");
	driver.findElement(By.name("email")).sendKeys("rjpatil1506@gmail.com");
	driver.findElement(By.name("password")).sendKeys("test@123");
	
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	
	
	
	
	
	
}
}
