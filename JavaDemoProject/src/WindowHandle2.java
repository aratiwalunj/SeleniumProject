import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {
//switch between 2 main window and one child window
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();		
		driver.findElement(By.linkText("Open a popup window")).click(); //first child window open
		Thread.sleep(1000);
		driver.findElement(By.linkText("Blogger")).click();   //second child window open in new tab
		Set<String> windowids = driver.getWindowHandles();    //store windowid in random order
		Iterator<String> itr = windowids.iterator();
		String winurl=null;
		
		while(itr.hasNext())
		{
			String winid=itr.next();
			driver.switchTo().window(winid);
			if(driver.getTitle().equals("New Window"))
			{
				winurl=driver.getCurrentUrl();
			}
			/*
			else if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily."))
			{
				winurl=driver.getCurrentUrl();
			}    */
		}
		System.out.println(winurl);
	}

}
