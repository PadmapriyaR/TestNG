package testNGBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Studies\\Selenium with Java1.0\\JarFiles\\Upgraded\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	
	@Test
	public void logoTest() {
		Boolean result = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();	
	}
	
	@Test
	public void mailLinkTest() {
		Boolean b = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).isDisplayed();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
