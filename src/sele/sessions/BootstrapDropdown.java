package sele.sessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	
	driver.findElement(By.xpath("//span[contains(@class,'multiselect-selected-text')]")).click();
	
	List <WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
	System.out.println(list.size());
	
	for (int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).getText());
		
		if (list.get(i).getText().equals("Angular")) {
			list.get(i).click();
			break;
		}
	}
	
}
}
