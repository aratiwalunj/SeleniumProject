import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		//Setup chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\JavaDemoProject\\Drivers\\chromedriver.exe");
		//object created for chromedriver class and assign object to object referance of webdriver
		//WebDriver is an interface in selenium )
          WebDriver driver=new ChromeDriver();
          driver.get("http://omayo.blogspot.com/");
          driver.manage().window().maximize();
          String expectedPageTitle="omayo (QAFox.com)";
          String actualPageTitle= driver.getTitle();
          if(expectedPageTitle.equals(actualPageTitle))
          {
          System.out.println("Page title is:" +actualPageTitle);
          }else
          {
        	  System.out.println("You have open wrong page");
          }
          String currentUrl=driver.getCurrentUrl();
          System.out.println("Current Url is:" +currentUrl);
          WebElement element1= driver.findElement(By.id("ta1"));
          if(element1.isEnabled())
          {
        	  element1.sendKeys("This is text area field of arati");
          }
         element1.clear();
       String text=  driver.findElement(By.className("widget-content")).getText();
       System.out.println(text);
         //driver.quit();
         //driver.close();
}
	
}
		

