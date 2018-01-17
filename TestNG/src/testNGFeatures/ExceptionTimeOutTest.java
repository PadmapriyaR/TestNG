package testNGFeatures;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
	public void infiniteLoop() {
		int a = 1;
		while(a==1) {
			System.out.println(a);
		}
	}
	
	@Test(invocationTimeOut=2000,expectedExceptions=IndexOutOfBoundsException.class)
	public void infiniteLoop1() {
		int a = 10;
		while(a==10) {
			System.out.println(a);
		}
	}
}

/* Notes:
 * ExceptionTimeout:-
 * 		Sometimes our test cases may get more time to execute. In such cases, we can use this. It will execute the
 * test case till that time which we have given in the keyword timeOut.
 * It will automatically terminate the condition once the time gets up. But We should not write the code like this.
 * Here test case will be failed.
 * 
 * ExpectedExceptions:-
 * 		When we except some exception, we can give this using the keyword called expectedException. Even 
 * the test cases returning number format exception also, the test case will be passed as we are expecting that 
 * exception.
 */
