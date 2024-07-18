import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		//implicit wait-Global wait apply on every element
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("dropbtn")).click();
		//individual wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement facebookwait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		facebookwait.click();
		
		}

}
