import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise6 {
//open given url enter wrong credentials and verify that error message is display or not and print that error message
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("Aratik12");
		driver.findElement(By.id("password")).sendKeys("Arati@13");
		driver.findElement(By.id("login")).click();
		String message=driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details or Your Password might have ')]")).getText();
		System.out.println("Error message is:" +message);
		boolean invalid= driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details or Your Password might have ')]")).isDisplayed();
		if(invalid==true)
		{
			System.out.println("Invalid login credentials");
		}else
		{
			System.out.println("Not invalid credentials");
		}
		
	}

}
