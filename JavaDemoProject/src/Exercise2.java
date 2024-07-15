import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
//go to given website and register urself
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.linkText("New User Register Here")).click();
		String title=driver.getTitle();
		//System.out.println(title);
		if(title.equalsIgnoreCase("Adactin.com - New User Registration"))
		{
			System.out.println("We are in registration page");
		}else
		{
			System.out.println("We are in wrong page");
		}
		driver.findElement(By.id("username")).sendKeys("Aratik123");
		driver.findElement(By.id("password")).sendKeys("Arati@123");
		driver.findElement(By.id("re_password")).sendKeys("Arati@123");
		driver.findElement(By.id("full_name")).sendKeys("Arati karande");
		driver.findElement(By.id("email_add")).sendKeys("arti.walunj93@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(10000);

	}

}
