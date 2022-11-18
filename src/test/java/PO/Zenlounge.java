package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//import junit.framework.Assert;

public class Zenlounge {
	WebDriver driver;
	public Zenlounge(	WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@name='submit']")
	WebElement submit;
	
	@FindBy(how=How.XPATH,using="//a[@class='forgot-link']")
	WebElement forgotLink;
	
	public void username(String UserName)
	{
		username.sendKeys(UserName);


	}

	public void password(String Pass)
	{
		password.sendKeys(Pass);
	}
	public void submit()
	{
		submit.click();
		//Assert.assertEquals(true, submit.isDisplayed());

	}
	
	public void forgotLink()
	{
		forgotLink.click();
	}

	
	//***************** valid scenario*******************
	
	public void validData(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_Username(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_Blank_password(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_Blank_username(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_password(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_Blank_username_password(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_SpecChar_username(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_Numeric_valuein_username(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_only_Two_Char_In_pasword(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_HundredDigit_ID(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
	public void Invalid_only_Two_Char_In_username(String UserName,String Pass)
	{
		try 
		{
			username(UserName);
			password(Pass);
			submit();
			forgotLink();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
}