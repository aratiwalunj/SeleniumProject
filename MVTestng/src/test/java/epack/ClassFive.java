package epack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassFive {
	@BeforeSuite
	public void suits()
	{
		System.out.println("Execute before all the class in suite");
	}
	@Test(groups= {"smoke"})
	public void testFive()
	{
		System.out.println("We are in testFive of classFive");
	}
}
