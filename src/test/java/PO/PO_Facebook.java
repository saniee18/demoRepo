package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Facebook {

	WebDriver driver;
	public PO_Facebook(	WebDriver driver)
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
	public void Password(String pass)
	{
		Password.sendKeys(pass);
	}
	public void Loginbutton()
	{
		Loginbutton.click();
	}
	
	public void Valid_Data(String email_id,String pass )
	{
		try {
		Email(email_id);
		Password(pass);
		Loginbutton();
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	
	public void Blank(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
		Loginbutton();
	}
	
	public void Less_Char(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void Max_Char(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void Combo_NumSymbol(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void only_Num(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void only_SpecSymbol(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void DoubleSpace(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void Blank_password(String email_id,String pass )
	{try {
		Email(email_id);
		Password(pass);
		Loginbutton();
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	public void Invalid_Username(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void Invalid_password(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void Blank_username_password(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void SpecChar_username(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void only_Two_Char_In_username(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void HundredDigit_ID(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
	public void HundredDigit_password(String email_id,String pass )
	{
		try {
			Email(email_id);
			Password(pass);
			Loginbutton();
			}catch(Exception e)
			{
				e.printStackTrace();

			}
	}
		
		
}
