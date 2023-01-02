package javascript_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert_popup {
	WebDriver driver;
	@BeforeTest
	public void toEnter_textInToDisabledTextBox() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
}
	@Test
	public void alert() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		}
	@Test
	public void simple_alert() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("timerAlertButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//Thread.sleep(5000);
		alert.accept();
	}
	@Test
	public void confirm_popup() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//Thread.sleep(2000);
		alert.dismiss();
	}
	@Test
	public void confirm_popup2() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//Thread.sleep(2000);
		alert.accept();
	}
	@Test
	public void Prompt_input() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		jsexe.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("swarna");
		System.out.println(alert.getText());
		alert.accept();
	}
	@Test
	public void Prompt_ok()throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		jsexe.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
	}
	@Test
	public void Prompt_cancel()throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		jsexe.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.dismiss();
	}
	}

