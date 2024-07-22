import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();	
   driver.get("http://omayo.blogspot.com");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  //Take a screenshot store in file
   File srcfiles=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
   //copy this file in Screenshot folder
   
   FileUtils.copyFile(srcfiles, new File("Screenshots\\srcfiles.png"));
   
   
   
	}

}
