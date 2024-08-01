package ppack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
	
	WebDriver driver;

	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.emailfield().sendKeys("arti.walunj93@gmail.com");
		loginpage.passwordfield().sendKeys("arati@123");
		loginpage.loginbutton().click();
		
		MyAccountPage myAccountpage=new MyAccountPage(driver);
				Assert.assertTrue(myAccountpage.account().isDisplayed());
				Thread.sleep(5000);
	}
	@AfterMethod
	public void closure()
	{
		driver.close();
	}

}
