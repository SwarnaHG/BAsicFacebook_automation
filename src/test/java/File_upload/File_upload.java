package File_upload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class File_upload {
	public WebDriver driver;
	@BeforeTest
	public void Driver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	@Test
	public void File_upload1() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file'][@multiple='']")).sendKeys("C:\\Users\\punit\\Downloads\\swarna.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void fileUploadUsingAutoIt2() throws InterruptedException, IOException {
		driver.get("https://smallpdf.com/pdf-converter");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 jltaIN']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\punit\\OneDrive\\Desktop\\AutoItFile\\swarna.exe");
		Thread.sleep(5000);
		driver.close();
		}
		

}
