package Reports.ExtendReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	WebDriver driver;
	ExtentReports extent;
	@BeforeMethod
	public void Configuration() 
	{
		//System.out.println(System.getProperty("user.dir"));   //to find your project path
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new  ExtentSparkReporter(path);
		reporter.config().setReportName("Omayotest report");
		reporter.config().setDocumentTitle("Omayo TestReport");
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Operating System", "Windows 10");
		extent.setSystemInfo("Tested By", "Arati k");
	}
@Test
public void TestOne() {
	    ExtentTest etest= extent.createTest("Test One Created");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 etest.info("Chrome browser started");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		 etest.info("Omayo blogspot launched");
		String actualText = driver.findElement(By.id("pah")).getText();
		etest.fail("Test is failed");   //for failing the extent report
		etest.pass("TestOne is pass");
		Assert.assertEquals(actualText, "PracticeAutomationHere");
}
@AfterMethod
public void closure()
{
	driver.close();
	extent.flush();

	}

}
