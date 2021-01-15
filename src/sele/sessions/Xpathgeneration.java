package sele.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathgeneration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rp1528");
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("673617636");
		
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}
	
	
	
	
}
