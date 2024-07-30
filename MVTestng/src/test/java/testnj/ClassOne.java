package testnj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {
	@Parameters("URL")
@Test
	public void testOneA(String url)
	{
		System.out.println("We are in testoneA of classone");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(url);
	driver.close();
	}
@Test
public void testOneB()
{
	System.out.println("We are in testoneB of classone");
	
}
@Test
public void testOneC()
{
	System.out.println("We are in testoneC of classone");
	
}
@Test

public void testOneD()
{
	System.out.println("We are in testoneD of classone");
	
}
}
