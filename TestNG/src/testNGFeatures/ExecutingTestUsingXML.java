package testNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutingTestUsingXML {

WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Studies\\\\Selenium with Java1.0\\\\JarFiles\\\\Upgraded\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test
	public void googleTitle() {
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Google", "Title mismatch");
	}
	
	@Test
	public void googleLogo() {
		Boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@Test
	public void print() {
		System.out.println("Demo for testng.xml file");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

/* Notes:
 * 
 * In every project there will be a xml file to execute the test cases.
 * Let say we have more than 100 test cases to execute for this release then the tester can not be able to 
 * run all the test cases by doing run as testng-test for each tests. Instead of doing that, testng has a 
 * beautiful feature called testng.xml file. we have to create the xml file and we need to give the class names.
 * Those classes which are given in the suite will be executed when we run the xml file.
 * 
 */
