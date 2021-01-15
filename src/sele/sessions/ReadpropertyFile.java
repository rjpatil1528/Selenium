package sele.sessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadpropertyFile {
       static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Asus\\eclipse\\java-2019-12\\eclipse\\Selenium\\src\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "f:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath("lastname_xpath")).sendKeys("lastName");
		driver.findElement(By.xpath("email_xpath")).sendKeys("Email");
		
		
		
	}

}
