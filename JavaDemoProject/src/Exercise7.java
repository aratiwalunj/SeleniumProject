import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		boolean logo=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		if(logo==true)
		{
			System.out.println("logo is available");
		}else
		{
			System.out.println("logo not available");
		}
		
		
		//img[@alt='Google']
	}

}
