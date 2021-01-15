package sele.sessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentwindowId = it.next();
		
		System.out.println("Parent Window Id:" +parentwindowId);
		
		String childwindowId = it.next();
		System.out.println("Child Window Id:" +childwindowId);
		
		driver.switchTo().window(childwindowId);
		System.out.println("Child Window PopUp Title:" +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		System.out.println("Parent Window Title:" +driver.getTitle());
		
	}
	
}
