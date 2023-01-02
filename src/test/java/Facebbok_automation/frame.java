package Facebbok_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class frame {
	
	WebDriver driver;

	@Test
	public void frameFunctions_usingId_attribute() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/punit/OneDrive/Desktop/frame2.html");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	driver.findElement(By.id("t1")).sendKeys("swarna");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t2")).sendKeys("amith");
	Thread.sleep(2000);

	}

	@Test
	public void frameFunctions_using_name_attribute() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/punit/OneDrive/Desktop/frame2.html");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	driver.findElement(By.name("n1")).sendKeys("swarna");
	// driver.switchTo().defaultContent();
	// driver.findElement(By.name("n3")).sendKeys("amith");
	// Thread.sleep(2000);

	}

}
