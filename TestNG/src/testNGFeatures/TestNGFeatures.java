package testNGFeatures;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void login() {
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods="login")
	public void home() {
		System.out.println("Home");
	}
	
	@Test(dependsOnMethods="login")
	public void search() {
		System.out.println("Search");
	}
}

/* Notes:
 * DependsOnMethod:-
* 		Let say, we have loginTest,HomeTest methods. If loginTest got failed then we don't need to execute 
* further test cases. The HomeTest is depends on loginTest. Using the keyword called "dependsOnMethod" we can
* make it happen.
* 
* 
*/