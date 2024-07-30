package epack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassSix {
	
	@AfterTest
	public void tests() {
		System.out.println("Execute Afters netbankig test");
	}
	@Test
	public void testSix()
	{
		System.out.println("We are in testSix of classSix");
	}
}
