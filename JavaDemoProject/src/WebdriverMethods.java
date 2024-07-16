import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        System.out.println("Browser Url is:"+url);
        String title=driver.getTitle();
        System.out.println("Webpage title is:" +title);
        //String pageSource=driver.getPageSource();
        //System.out.println("Page source is:"+pageSource);
        driver.navigate().to("https://www.flipkart.com");
       // driver.navigate().forward();
       // driver.close();
       // driver.quit();
        
      
	}

}
