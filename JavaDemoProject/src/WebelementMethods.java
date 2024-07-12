import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
	     System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\JavaDemoProject\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     Thread.sleep(2000);
	     WebElement login=driver.findElement(By.cssSelector("a[title='Login'] span"));
	     login.click();
	     WebElement text1=driver.findElement(By.xpath("//div[@class='EpHS0A']"));
	    String texttt= text1.getText();
	     System.out.println(texttt);
	    // WebElement logwin=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
	    // Dimension size=logwin.getSize();
	   //  System.out.println(size);
	 //  String tag1=  logwin.getTagName();
	 //  System.out.println("Tag name to enter mobile no:"+tag1);
	     //logwin.sendKeys("9766392879");
	   //  WebElement sendOTP=driver.findElement(By.xpath("//button[normalize-space()='Request OTP']"));
	     //sendOTP.click();
	}
	

}
