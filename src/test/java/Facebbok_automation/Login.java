package Facebbok_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	//WebDriver driver = new ChromeDriver();
	
	@Test
	public void Login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		//to get browser
		driver.get("https://www.facebook.com");
		//to maximixe
		driver.manage().window().maximize();
		
		//to fetch title
	//	String title=driver.getTitle();
	//	System.out.println(title);
		
		//to print url in console
	//	String url=driver.getCurrentUrl();
	//	System.out.println(url);
		
		//to print source code
	//	String source=driver.getPageSource();
	//	System.out.println(source);
		
		//close method
		//Thread.sleep(3000);
		//driver.close();
		
		//navigate method
	//	driver.navigate().to("https://www.flipkart.com");
	//	driver.navigate().back();
	//	driver.navigate().refresh();
	//	driver.navigate().forward();
		
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Swarna");
		
		WebElement password = driver.findElement(By.name("pass"));
		  password.sendKeys("amith");
		  
		  WebElement btn = driver.findElement(By.name("login"));
		  btn.click();
		  
		  driver.findElement(By.linkText("Forgotten password?")).click();
		  
		  
	}
	
	@Test
	public void login_by_css_selectors() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");

	WebElement email = driver.findElement(By.cssSelector("input[id='email'][type='text']"));
	email.sendKeys("swarna");
	Thread.sleep(2000);

WebElement password = driver.findElement(By.cssSelector("input[id='pass'][class='inputtext _55r1 _6luy _9npi']"));
	password.sendKeys("priya@1234");
	Thread.sleep(2000);

	WebElement btn = driver.findElement(By.cssSelector("button[value='1'][id='u_0_5_Q+'][class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	btn.click();
	Thread.sleep(2000);

	driver.findElement(By.linkText("Create New Account")).click();
	}
	
	@Test
	public void login_xpath() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");

	WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
	mail.sendKeys("Swarna");
	Thread.sleep(2000);

	WebElement pass = driver.findElement(By.xpath("//input[@type='password'][@name='pass']"));
	pass.sendKeys("123456");
	Thread.sleep(2000);

	WebElement btn = driver.findElement(By.xpath("//button[text()='Log in']"));
	btn.click();
	Thread.sleep(2000);

	driver.findElement(By.linkText("Forgotten password?")).click();
	}
	}



		
		

