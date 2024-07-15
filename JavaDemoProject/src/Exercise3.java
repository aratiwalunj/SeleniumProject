import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
//Go to website,giver username and password and print that username and pasword
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("Aratik123");
		driver.findElement(By.id("password")).sendKeys("Arati@123");
		String username=driver.findElement(By.id("username")).getAttribute("value");
		String password=driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(username);
		System.out.println(password);
	
	}

}
