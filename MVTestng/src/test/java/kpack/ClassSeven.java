package kpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassSeven {
	@BeforeTest
	public void tests() {
		System.out.println("Execute Before netbankig test");
	}
	@Test(groups= {"smoke"})
	public void testSeven()
	{
		System.out.println("We are in testSeven of classSeven");
	}
}
