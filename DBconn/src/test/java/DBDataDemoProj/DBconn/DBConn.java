package DBDataDemoProj.DBconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DBConn {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// connect to mysql database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "root");
//get data from database
		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("Select * from logincredentials");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		while (resultSet.next()) {
			driver.findElement(By.id("input-email")).sendKeys(resultSet.getString("Username"));
			driver.findElement(By.id("input-password")).sendKeys(resultSet.getString("Password"));
		}
		driver.findElement(By.xpath("//input[@value='Login']")).click();	
	}
}
