import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjForLinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
	     System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTraining\\JavaDemoProject\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://adactinhotelapp.com/");
	    //WebElement forgotpwd=driver.findElement(By.linkText("Forgot Password?"));
	    //forgotpwd.click();
	    WebElement newReg=driver.findElement(By.partialLinkText("User Register"));
	    newReg.click();
	}

}
