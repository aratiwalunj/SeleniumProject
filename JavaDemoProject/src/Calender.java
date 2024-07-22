import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();	
		   driver.get("https://www.path2usa.com/travel-companions");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Thread.sleep(5000);
		   Actions a=new Actions(driver);
		   a.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Date of travel']"))).click().perform();
		  while(!driver.findElement(By.className("flatpickr-current-month")).getText().contains("December"))
		  {
			  driver.findElement(By.className("flatpickr-next-month")).click();
		  }
	}

}
