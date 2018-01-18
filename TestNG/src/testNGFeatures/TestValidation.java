package testNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestValidation {

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
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

/* Notes:
 * 	
 * TestNG has a feature to validate the test cases. We can validate the test cases whether it is passed or failed
 * using the feature called "Assertion". 
 * 
 * AssertEquals:-
 * Here AssertEquals will verify whether the actual title and expected title are equals. If yes, then the test case
 * will get passed. If not, assertion validation will give the result as test case failed.
 * 
 * AssertTrue:-
 * It will check the value is true or false. If it is true then the test case will be marked as pass else
 * the test case will be marked as fail. We can write this AssertTrue assertion with AssertEquals also.
 * AssertEquals(actual,true)
 */
