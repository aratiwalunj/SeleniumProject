package lpack;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTen {

	@Test
	public void testTenA()
	{
		int a=2,b=5,c=6;
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com/");
		driver.manage().window().maximize();
		if(a==1)
		{
			Assert.assertTrue(b<c);
		}else if(a==2)
		{
			Assert.assertTrue(b>c);
		}else if(a==3)
		{
			throw new SkipException("Test skipped");
		}
		driver.close();
	}
	
	@Test
	public void testTenB()
	{
		int a=2,b=5,c=6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com/");
		driver.manage().window().maximize();
		if(a==1)
		{
			Assert.assertTrue(b<c);
		}else if(a==2)
		{
			Assert.assertTrue(b>c);
		}else if(a==3)
		{
			throw new SkipException("Test skipped");
		}
		driver.close();
	}
	@Test
	public void testTenC()
	{
		int a=2,b=5,c=6;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com/");
		driver.manage().window().maximize();
		if(a==1)
		{
			Assert.assertTrue(b<c);
		}else if(a==2)
		{
			Assert.assertTrue(b>c);
		}else if(a==3)
		{
			throw new SkipException("Test skipped");
		}
		driver.close();
	}
	
}
