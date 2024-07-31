package poi.POIProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogBylog4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = LogManager.getLogger(LogBylog4j.class.getName());
		log.debug("Test Execution Started");
WebDriverManager.chromedriver().setup();	
WebDriver driver = new ChromeDriver();
		log.debug("Chrome Browser got launched");
		driver.get("http://omayo.blogspot.com/");
		log.debug("Omayo Application got opened");
		driver.manage().window().maximize();
		log.debug("Browser got maximized");
		driver.findElement(By.linkText("compendiumdev")).click();
		log.debug("Compendiumdev link got clicked");
		driver.navigate().back();
		log.debug("Browser navigated back to Omayo website");
		driver.navigate().forward();
		log.debug("Browser navigated forward to Compendiumdev page");
		
		if(driver.getTitle().equals("Basic Web Page Titles")) {
			
			log.info("Success: We are in correct page");
			
		}else {
			
			log.error("Error: We are in wrong page");
			
		}
		
		driver.close();
	}

}
