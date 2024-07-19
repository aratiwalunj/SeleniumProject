import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://omayo.blogspot.com");
		//driver.get("http://omayo.blogspot.com/p/page3.html");  //For drag and drop By
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); //For Drag and Drop 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions action=new Actions(driver);

		/*
		 WebElement blogmenu=driver.findElement(By.id("blogsmenu"));
		action.moveToElement(blogmenu).perform();
		WebElement sublink = driver.findElement(By.xpath("//span[contains(text(),'Selenium143')]"));
		action.moveToElement(sublink).click().build().perform();
		 
		 */
		/*
		//Drag and Drop By
		WebElement sourcele=driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		action.dragAndDropBy(sourcele, 100, 0).perform();  //move to right side so +100
		action.dragAndDropBy(sourcele, -200, 0).perform();  //move to left side so -100
		*/
		
		/*
		//Context Click
		WebElement searchbutton=driver.findElement(By.xpath("//input[@value='Search']"));
		action.contextClick(searchbutton).perform();
		*/
		/*
		//Double click
		WebElement searchtext=driver.findElement(By.name("q"));
		searchtext.sendKeys("Arati");
		action.doubleClick(searchtext).perform();
		*/
		/*
		//Drag and Drop
		WebElement sourcelement=driver.findElement(By.id("box4"));
		WebElement destelement=driver.findElement(By.id("box103"));
		action.dragAndDrop(sourcelement, destelement).perform();
		*/
	}

}
