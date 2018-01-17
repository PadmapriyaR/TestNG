package testNGBasicsPart2;

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
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	
	@Test(priority=3,groups="Logo")
	public void logoTest() {
		Boolean result = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();	
	}
	
	@Test(priority=2)
	public void mailLinkTest() {
		Boolean b = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).isDisplayed();
	}
	
	@Test(priority=4)
	public void loginTest() {
		System.out.println("Login Method");
		int a = 10/0;
	}
	
	@Test(priority=5,dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("Home Method");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

/* Notes:-
 * Prioritization:
 * 		Using TestNG Framework we can prioritize the test cases and we can define the execution sequence also. Based
 * on the priority order, test cases will be executed.
 * 		Execution flow/sequence will be followed based on the test cases priority.
 * 		BeforeMethod and AfterMethod are not consider as test cases.
 * Output for the above execution:
 * 	PASSED: googleTitleTest
	PASSED: mailLinkTest
	PASSED: logoTest	
 
 * Test Reports:-	
 * 		We can get good test report using TestNG.
 * 		Right click on the project and do refresh. After that, test-output folder will be created.  In which,
 * right click on index.html file -> properties -> location, copy the location and paste it in browser tab. 
 * HTML Report will be displayed.   
 * 
 * DependsOnMethod:-
 * 		Let say, we have loginTest,HomeTest methods. If loginTest got failed then we don't need to execute 
 * further test cases. The HomeTest is depends on loginTest. Using the keyword called "dependsOnMethod" we can
 * make it happen.
 * 
 *  Grouping:-
 *  	We can group the test cases using TestNG framework. We can have more than 100 test cases. We can execute 
 *  those test cases by grouping (keyword - groups).
 */


