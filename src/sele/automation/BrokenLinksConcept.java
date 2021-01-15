package sele.automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksConcept {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
// 1. Get the list of all the links & Images.
		
	List<WebElement> linklist =	driver.findElements(By.tagName("a"));
	linklist.addAll(driver.findElements(By.tagName("img")));
	     System.out.println("Size of all Links==>"+linklist.size());
		
	List<WebElement> activelinks = new ArrayList<WebElement>();
	
// 2. Iterate linklist: Exclude all the links/img---doesnn't have any href attribute
	
	for (int i=0; i<linklist.size(); i++ )  {
		System.out.println(linklist.get(i).getAttribute("href"));
		
		if (linklist.get(i).getAttribute("href") !=null ) {
			activelinks.add(linklist.get(i));
		}
	}
		
	// Get the size of active links
	System.out.println("Size of active links=="+activelinks.size());
	
// 3. Check the href url with httpconnection api
	
	for (int j=0; j<activelinks.size(); j++) {
		
		HttpURLConnection connection = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
		
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		
		System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
	}
	
}
	
	
	
	
	
}
