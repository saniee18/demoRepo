package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductStore {

	WebDriver driver;
	public ProductStore(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	WebElement Loginbutton;
	
	public void Email(String email_id)
	{
		Email.sendKeys(email_id);
	}
}
