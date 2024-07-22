import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();	
		   driver.get("https://www.makemytrip.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Thread.sleep(5000);
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.xpath("//img[@alt='Make My Trip']"))).click().build().perform();
		   WebElement logo=driver.findElement(By.id("fromCity"));
		   logo.click();
		   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Den");
		   int i=0;
		   while(i<5)
		   {
			   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
			   Thread.sleep(2000);
			   i++;
		   }
		   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	}

}
