package demo3.AutomationMVN;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {

	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      
      Properties prop=new Properties();
      FileInputStream fis=new FileInputStream("demo.properties");
      prop.load(fis);
      WebDriver driver=new ChromeDriver();
      driver.get(prop.getProperty("url"));
      driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("Username"));
      driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("Password"));
      driver.findElement(By.xpath("//input[@value='Login']")).click();
      
	
	
	}

}
