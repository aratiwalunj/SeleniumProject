package testnj;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@AfterTest
	public void tests() {
		System.out.println("Execute Afters creditdebitcard test");
	}
	@Test
	public void testTwo()
	{
		System.out.println("We are in testTwo of ClassTwo");
	}
}
