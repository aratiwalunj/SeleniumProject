package testnj;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {
	@AfterSuite
	public void suits()
	{
		System.out.println("Execute After all the class in suite");
	}
	@Test
	public void testThree()
	{
		System.out.println("We are in TestThree of classThree");
	}
}
