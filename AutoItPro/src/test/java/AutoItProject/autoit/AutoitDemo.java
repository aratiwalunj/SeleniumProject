package AutoItProject.autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoitDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.get("http://omayo.blogspot.com/");
Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();

Runtime.getRuntime().exec("C:\\SeleniumTraining\\AutoItPro\\AutoItScripts\\AutoItScript.exe");

	}

}
