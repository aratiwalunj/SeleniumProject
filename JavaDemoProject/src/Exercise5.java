import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		boolean logo=ele.isDisplayed();
		if(logo==true)
		{
			System.out.println("Facebook logo available");
		}else
		{
			System.out.println("Facebook logo not available");
		}
		
		
	}

}
