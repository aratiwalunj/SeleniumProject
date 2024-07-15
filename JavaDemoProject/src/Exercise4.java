import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//iver.switchTo().activeElement();
		driver.findElement(By.name("firstname")).sendKeys("Rutansh");
		driver.findElement(By.name("lastname")).sendKeys("Karande");
		driver.findElement(By.name("reg_email__")).sendKeys("9356953196");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("rutanshk123");
		Select day=new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("3");
        Thread.sleep(1000);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Nov");
        Thread.sleep(1000);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1995");
        Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.name("websubmit")).click();
		
	}

}
