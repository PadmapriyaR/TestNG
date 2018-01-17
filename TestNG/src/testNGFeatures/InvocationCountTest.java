package testNGFeatures;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void sum() {
		int a=10,b=10,c=0;
		c=a+b;
		System.out.println("Sum "+c);
	}
}

/* Notes:
 * InovationCount:-
 * 		It is one of the features in TestNG Framework. If we want to execute same test cases for n times, we can
 * do this by using InvocationCount keyword in Test. If we give @Test(inovationCount=10), that test case will
 * be executed for 10 times. Sometimes we dont use. Sometimes we may need to execute the same test cases for n times. 
 */
