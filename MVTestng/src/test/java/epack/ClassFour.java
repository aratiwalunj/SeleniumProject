package epack;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ClassFour {
	@BeforeTest
	public void tests() {
		System.out.println("Execute before credeitdebitcard test");
		
	}
	@Test
	public void testFour()
	{
		System.out.println("We are in testFour of classFour");

	}
}
