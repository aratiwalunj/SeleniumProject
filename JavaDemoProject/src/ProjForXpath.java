import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjForXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     String url=driver.getCurrentUrl();
	     System.out.println(url);
	     String title=driver.getTitle();
	     System.out.println(title);
	}

}
