import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten password?")).click();
		String actualTitle=driver.getTitle();
		String expectedTitle="Forgotten Password | Can't Log In | Facebook";
		System.out.println("Forgot password page title is:" +actualTitle);
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("We are on ccorrect page");
		}else 
		{
			System.out.println("Wrong page");
		}
		boolean b=driver.findElement(By.id("identify_email")).isDisplayed();
		if(b==true)
		{
			driver.findElement(By.id("identify_email")).sendKeys("artiwalunj2015@gmail.com");
			driver.findElement(By.id("did_submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
		}
		
	}

}
