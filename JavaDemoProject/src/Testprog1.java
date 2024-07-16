import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testprog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        
        //set size of window
        Dimension d = new Dimension(1005,550);
        driver.manage().window().setSize(d);
        
        //set position of window
        Point p=new Point(0,350);
        driver.manage().window().setPosition(p);
        
        driver.navigate().refresh();
        
        //driver.manage().deleteAllCookies();
	}

}
