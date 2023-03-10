package Facebbok_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTable {
	
	WebDriver driver;
	@BeforeTest
	public void driverClass() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@Test
	public void rowSize() {
		driver.get("file:///C:/Users/punit/OneDrive/Desktop/table.html");
		List<WebElement> noOfRows = driver.findElements(By.xpath("//tr"));
		int totalRows = noOfRows.size();
		System.out.println("total number of rows present in the table is :"+ totalRows);
	}
	@Test
	public void colSize() {
		driver.get("file:///C:/Users/punit/OneDrive/Desktop/table.html");
		List<WebElement> noOfColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = noOfColumns.size();
		System.out.println("total number of columns present in the table is :"+ totalColumns);
	}
	@Test
	public void toCountNoOfCells() {
		driver.get("file:///C:/Users/punit/OneDrive/Desktop/table.html");
		List<WebElement> noOfCells = driver.findElements(By.xpath("//th|//td"));
		int cellCount = noOfCells.size();
		System.out.println("total number of cells present in the table is :"+ cellCount);
	}
	@Test
	public void printOnlyNumbers() {
		driver.get("file:///C:/Users/punit/OneDrive/Desktop/table.html");
		List<WebElement> noOfCells = driver.findElements(By.xpath("//th|//td"));
	
		int countValue = 0;
		int sum=0;
		for (WebElement cell : noOfCells) {
		String cellValue = cell.getText();
		try{
		int number = Integer.parseInt(cellValue);
		System.out.print(number);
		countValue++;
		sum = sum+number;
		}catch (Exception e) {
		}
		}
		System.out.println("Total count of numeric values is :"+countValue);
		System.out.println("Total sum of all the numeric values is :"+sum);
}
}