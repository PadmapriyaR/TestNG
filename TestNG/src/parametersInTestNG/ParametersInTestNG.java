package parametersInTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Studies\\\\Selenium with Java1.0\\\\JarFiles\\\\Upgraded\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/Login/identifier?hl=EN&flowName=GlifWebSignIn&flowEntry=AddSession");
	}
	
	@Test
	@Parameters({"emailID"})
	public void login(String emailID) {
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(emailID);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

/* Notes:
 * Most important questions:-
 * 	a.How to pass parameters from testng.xml to test cases?
 * 	b.What is @parameters annotation in TestNG?
 * 	c.How to configure testng.xml file to <parameters> tag?
 * 	d.Run your test cases with testng.xml
 *
 * Using testng.xml file, we can run all the test cases in a single shot. testng.xml file is also called
 * Template file and runner file. We can able to run all the test cases one by one and all the classes one by one.
 * It is definition of how many test cases we have written.
 * 
 */
