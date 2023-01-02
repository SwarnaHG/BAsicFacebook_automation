package Facebbok_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_up {
	WebDriver driver;

	@Test
	public void signUp_Using_XPath() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");


	WebElement link = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	link.click();
	Thread.sleep(3000);


	WebElement name = driver.findElement(By.xpath("//input[@type='text'][@placeholder='First name']"));
	name.sendKeys("Swarna");
	Thread.sleep(2000);


	WebElement lastname = driver.findElement(By.xpath("//input[@type='text'][@name='lastname']"));
	lastname.sendKeys("Amith");
	Thread.sleep(2000);

	WebElement mobile = driver.findElement(By.xpath("//input[@type='text'][@name='reg_email__']"));
	mobile.sendKeys("9113919512");
	Thread.sleep(2000);

	WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input'][@type='password']"));
	newPassword.sendKeys("123456");
	Thread.sleep(3000);

	WebElement day = driver.findElement(By.xpath("//select[@id='day'][@class='_9407 _5dba _9hk6 _8esg']"));
	day.sendKeys("14");
	Thread.sleep(3000);

	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	month.sendKeys("Feb");
	Thread.sleep(3000);

	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	year.sendKeys("1997");;
	Thread.sleep(3000);

	WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
	female.click();
	Thread.sleep(3000);

	WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
	male.click();
	Thread.sleep(3000);

	WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
	custom.click();
	Thread.sleep(3000);

	WebElement select = driver.findElement(By.xpath("//select[@class='_7-16 _9hk6 _5dba'][//option[@value='1']]"));
	select.click();
	Thread.sleep(3000);

	WebElement sign = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	sign.click();
	Thread.sleep(3000);
}
	
	@Test

	public void signUp_Using_Css_Selector() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");

	   driver.findElement(By.linkText("Create New Account")).click();

	Thread.sleep(3000);

	WebElement name = driver.findElement(By.cssSelector("[type='text'][class='inputtext _58mg _5dba _2ph-']"));
	name.sendKeys("Swarna");
	Thread.sleep(3000);

	// WebElement lastname = driver.findElement(By.cssSelector("[type='text'][id='u_j_d_QF'][class='inputtext _58mg _5dba _2ph-']"));
	// lastname.sendKeys("amith");
	// Thread.sleep(2000);

	WebElement mobile = driver.findElement(By.cssSelector("[type='text'][class='inputtext _58mg _5dba _2ph-'][id='u_0_g_UD']"));
	mobile.sendKeys("9113919512");
	Thread.sleep(2000);

	WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input'][@type='password']"));
	newPassword.sendKeys("amith");
	Thread.sleep(3000);

	WebElement day = driver.findElement(By.cssSelector("[id='day']"));
	day.sendKeys("14");
	Thread.sleep(3000);

	WebElement month = driver.findElement(By.cssSelector("[id='month'][class='_9407 _5dba _9hk6 _8esg']"));
	month.sendKeys("feb");
	Thread.sleep(3000);

	WebElement year = driver.findElement(By.cssSelector("[id='year'][class='_9407 _5dba _9hk6 _8esg']"));
	year.sendKeys("1997");;
	Thread.sleep(3000);

	WebElement female = driver.findElement(By.cssSelector("[id='u_0_4_OF'][value='1']"));
	female.click();
	Thread.sleep(3000);

	WebElement male = driver.findElement(By.cssSelector("[value='2'][id='u_0_5_gd']"));
	male.click();
	Thread.sleep(3000);

	WebElement custom = driver.findElement(By.cssSelector("[id='u_0_6_qh'][value='-1']"));
	custom.click();
	Thread.sleep(3000);
	//
	// WebElement select = driver.findElement(By.xpath("//select[@class='_7-16 _9hk6 _5dba']"));
	// select.click();
	// Thread.sleep(3000);
	//
	}


	}



