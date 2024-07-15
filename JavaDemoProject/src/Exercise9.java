import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Keyboard actions using sendkeys
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement s1=driver.findElement(By.cssSelector("#username"));
		s1.sendKeys("Aratik123");
		WebElement s2=driver.findElement(By.cssSelector("#password"));
		s1.sendKeys(Keys.CONTROL,"c");
		s2.sendKeys(Keys.CONTROL,"v");
		driver.findElement(By.id("login")).click();

	}

}
