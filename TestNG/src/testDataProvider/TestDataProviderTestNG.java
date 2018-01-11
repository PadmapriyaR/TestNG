package testDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviderTestNG {

	@DataProvider(name="login")
	public Object login() {
		
		Object[][] data = new Object[5][2];
		
		data[0][0] = "Admin1";
		data[0][1] = "Password1";
		
		data[1][0] = "Admin2";
		data[1][1] = "Password2";
		
		data[2][0] = "Admin3";
		data[2][1] = "Password3";
		
		data[3][0] = "Admin4";
		data[3][1] = "Password4";
		
		data[4][0] = "Admin5";
		data[4][1] = "Password5";
		
		return data; 
	}
	
	@Test(dataProvider="login")
	public void testLogin(String username, String password) {
		System.out.println(username);
		System.out.println(password);
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
 * Test Data Provider is used to provide multiple data to the test. It means using this concept we run the test
 * for multiple data.
 * 
 * How it works?
 * To work with it, we have to make data provider.
 * To use data provider, we should always use object type.
 * If we use data provider, it will automatically execute the test for each row of data.
 * If we have 2 rows 2 columns then we have to keep 2 arguments. one test variable will keep first row and first column's value
 * and another test variable will keep first row and second column data 
 * We can not keep data provider arguments less than no.of.rows and no.of.columns else it will give testng exception saying that data provider auguments mismatch
 * 
 */
