package Command.MavenCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
	WebDriver driver;
	@Test
	public void testOne()
	{
		System.out.println("mOne executed");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		String actualText = driver.findElement(By.id("pah")).getText();
		Assert.assertEquals(actualText,"PracticeAutomationHere");
	}
    @AfterTest
	public void closure()
	{
		driver.close();
	}
}
