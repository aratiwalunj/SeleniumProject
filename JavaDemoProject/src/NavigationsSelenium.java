import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=null;
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.google.com");
     Thread.sleep(1000);
     driver.navigate().to("https://www.facebook.com");
     Thread.sleep(1000);
    driver.navigate().back();
    Thread.sleep(1000);
    driver.navigate().forward();
    Thread.sleep(1000);
    driver.navigate().refresh();

     
	}
}
