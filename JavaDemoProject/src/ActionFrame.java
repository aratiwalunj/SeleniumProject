import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Navigate to frame
		WebElement frame1=driver.findElement(By.id("iframe1"));
		driver.switchTo().frame(frame1);
	   boolean seleniumlogo= driver.findElement(By.id("Header1_headerimg")).isDisplayed();
        System.out.println(seleniumlogo);
	   driver.findElement(By.linkText("What is Selenium?")).click();
	   //Navigate on Parent window from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("alert2")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
	}

}
