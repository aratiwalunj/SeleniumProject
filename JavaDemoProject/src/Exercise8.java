import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise8 {
	//gmail login

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.co.in%2F&ec=GAZAmgQ&hl=en&ifkv=AdF4I74F29ndksTvj-nca7sLV9JapzdTUiAibnN2BJZhokr-Wl1K7YeYGiLEiFBE-JrvG-bbrWIeYA&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-352219599%3A1721043366598437&ddm=0");
	driver.findElement(By.id("identifierId")).sendKeys("arti.walunj93@gmail.com");
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	driver.findElement(By.name("Passwd")).sendKeys("Passw@rd123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	Thread.sleep(3000);

	
	}

}
