package Facebbok_automation;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class keyTask {
 
	public static WebDriver driver;
	public void using_Robot_class() throws InterruptedException,IOException ,AWTException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();

	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CAPS_LOCK);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_W);
	robot.keyRelease(KeyEvent.VK_W);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	//
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_CONTROL);

	driver.findElement(By.xpath("//input[@id='password_step_input'][@type='password']")).click();

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);

	robot.mouseMove(100,300);
	robot.mouseWheel(2);
	robot.mouseWheel(-1);
	}
}
