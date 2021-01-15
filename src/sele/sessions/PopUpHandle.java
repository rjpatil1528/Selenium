package sele.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "f:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Asus\\Desktop\\NPAV License.txt");
		
		
		
		
	}
	
	
	
}
