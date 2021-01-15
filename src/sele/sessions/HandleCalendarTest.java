package sele.sessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalendarTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://ui.cogmento.com/");
	driver.findElement(By.name("email")).sendKeys("rjpatil1506@gmail.com");
	driver.findElement(By.name("password")).sendKeys("test@123");
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	
	
	String date = "1-september-2020";
	String dateArr[] = date.split("-");
	String day = dateArr[0];
	String month = dateArr[1];
	String year = dateArr[2];
	
	Select select = new Select(driver.findElement(By.name("")));
	select.selectByVisibleText(month);
	
	Select select1 = new Select(driver.findElement(By.name("")));
	select1.selectByVisibleText(year);
	
	String beforeXpath = "";
	String AfterXpath = "";
	
	final int totalweekDays = 7;
	
	boolean flag = false;
	String dayval = null;
	for(int rowNum=2; rowNum<=7; rowNum++) {
		for (int colNum=1; colNum<=totalweekDays; colNum++) {
			
	try {
		dayval = driver.findElement(By.xpath(beforeXpath+rowNum+AfterXpath+colNum+"]")).getText();
	}
	  catch (NoSuchElementException e) {
		  System.out.println("Please enter a Correct Date Value");
		  flag=false;
		  break;
	  }
	System.out.println(dayval);
	
	if (dayval.equals(day)) {
		driver.findElement(By.xpath(beforeXpath+rowNum+AfterXpath+colNum+"]")).click();
		
		flag = true;
		break;
	}
	 if (flag) {
		 break;
	 }
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
