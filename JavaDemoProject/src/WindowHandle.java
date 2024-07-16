import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
//switch between main window and child window(popup)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		/*
		  while(itr.hasNext())
		 {
			String winid=itr.next();
			System.out.println(winid);
		}   
		 */
		String mainwindow=itr.next();
		String childwindow=itr.next();
		driver.switchTo().window(childwindow);
		String childurl=driver.getCurrentUrl();
		System.out.println(childurl);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();   //close child window
		driver.switchTo().window(mainwindow);
		driver.close();  //close mainwindow
		
	}

}
