import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjForIDLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
	     System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\JavaDemoProject\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://adactinhotelapp.com/");
	     WebElement Username=driver.findElement(By.id("username"));
	     Username.sendKeys("vengatram");
	     WebElement Password=driver.findElement(By.name("password"));
	     Password.sendKeys("vengat@123445");
	     driver.findElement(By.className("login_button")).click();

	}

}
