import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh\\git\\SeleniumAutomation\\JavaDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("alert1")).click();
		//handling alert
		driver.switchTo().alert();
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		System.out.println(alerttext);
		alert.accept();
//handling dropdown
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select select=new Select(dropdown);
		//select.selectByIndex(2);
		select.selectByVisibleText("doc 4");
		//select.selectByValue("jkl");
		//Multiselect dropdown
		
		WebElement multiselect = driver.findElement(By.id("multiselect1"));
		Select select2=new Select(multiselect);
		select2.selectByIndex(2);
		select2.selectByVisibleText("Audi");
		select2.deselectByIndex(2);
        //select2.deselectAll();
		
		
	}

}
