import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise11 {
          //print no of links on webpage
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		List <WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println("No of links:" +list.size());
		for(WebElement link:list)
		{
			System.out.println(link.getAttribute("href"));
		}
		
	}

}
