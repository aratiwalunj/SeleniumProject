package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement emailfield;
	
	@FindBy(id="input-password")
	private WebElement passwordfield;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbutton;    
		public WebElement emailfield()
		{
			return emailfield;
	    }
		public WebElement passwordfield()
		{
			return passwordfield;
		}
		public WebElement loginbutton()
		{
			return loginbutton;
		}
}
