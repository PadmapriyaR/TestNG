package testNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//Pre conditions
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("logging in...");
	}
	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("Entering url");
	}
	
	//Test case
	@Test
	public void googleTitleTest() {
		System.out.println("Verifying google title");
	}
	
	@Test
	public void test2() {
		System.out.println("Test case2");
	}
	
	//Post condition
	@AfterMethod
	public void logOut() {
		System.out.println("Logged out");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("Deleting cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
}

/* What is testng?
 * 	Testing Next Generation. It is a unit testing framework. It is used to do unit test by developers.
 * Testers also can use this framework by integrating this framework with selenium to write test cases, 
 * executing test cases and generating HTML reports. 
 * 
 * Purpose:-
 * 	It is used to design test cases in a systematic way.
 * 
 * 	It is open source, freely available in the market. It is available in the form of jar file. 
 * 	TestNG/JUnit is only used with Java. Each language will have its own framework. 
 * 	It has lots of annotations. 
 * 	Lots of priorities.
 * 	Sequence of the test cases also we can design using this framework. 
 * 	We can define dependencies. 
 * 	We can define grouping. 
 * 	Most important feature is Data provider.
 * 	
 * TestNG is also called TDD (Test Drvien Developement) framework. Along with development, we can design test cases using this framework and methodology.
 * 
 * Annotation:-
 * We have pre condition and post condition annotations. Annotations will be used by '@'. Each annotations will
 * be associated with method.
 * 
 * Sequence of the annotations:-
 * 	1.BeforeSuite
 * 	2.BeforeTest
 * 	3.BeforeClass
 * 	4.BeforeMethod
 * 	5.Test
 * 	6.AfterMethod
 * 	7.AfterClass
 * 	8.AfterTest
 * 
 * Output:-
 * 	Setup system property for chrome
	Launching Browser
	logging in...
	Entering url
	Verifying google title
	Logged out
	Closing browser
	Deleting cookies
	PASSED: googleTitleTest
 */
