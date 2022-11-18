package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentReportManager;

public class PO_NOP_Commerce {
	WebDriver driver;
	public PO_NOP_Commerce(	WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li)[3]")
	WebElement userIcon;
	
	@FindBy(how=How.XPATH,using="//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]")
	WebElement registerlink;
	
	@FindBy(how=How.XPATH,using="//input[@id='FirstName']")
	WebElement FirstName;
	
	@FindBy(how=How.XPATH,using="//input[@id='LastName']")
	WebElement LastName;
	
	@FindBy(how=How.XPATH,using="//input[@id='Email']")
	WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@id='ConfirmEmail']")
	WebElement ConfEmail;
	
	@FindBy(how=How.XPATH,using="//input[@id='Username']")
	WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@id='check-availability-button']")
	WebElement Check_Availiblity;
	
	@FindBy(how=How.XPATH,using="//select[@name='CountryId']")
	WebElement CountryId;
	
	@FindBy(how=How.XPATH,using="//select[@id='TimeZoneId']")
	WebElement TimeZoneId;
	
	@FindBy(how=How.XPATH,using="//label[@for='Newsletter']")
	WebElement CheckBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='Password']")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@id='ConfirmPassword']")
	WebElement ConfirmPassword;
	
	@FindBy(how=How.XPATH,using="//select[@id='Details_CompanyIndustryId']")
	WebElement Details_CompanyIndustryId;
	
	/*@FindBy(how=How.XPATH,using="//select[@id='Details_CompanySizeId']")
	WebElement Details_CompanySizeId;
	
	@FindBy(how=How.XPATH,using="//select[@id='Details_CompanyRoleId']")
	WebElement Details_CompanyRoleId;
	
	@FindBy(how=How.XPATH,using="//input[@id='Details_CompanyWebsiteUrl']")
	WebElement Company_website;*/
	
	@FindBy(how=How.XPATH,using="//input[@id='register-button']")
	WebElement register_button;
	
	@FindBy(how=How.XPATH,using="//div[@class='sub-title']/h2")
	WebElement successMessage;
	
	@FindBy(how=How.XPATH,using="//span[@id='Email-error']")
	WebElement emailError;
	
	public void Action() 
	{
		Actions action=new Actions(driver);
		action.moveToElement(userIcon);
		//Thread.sleep(3000);
		action.click(registerlink).build().perform();


	}
	public void FirstName(String FName)
	{
		FirstName.sendKeys(FName);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering first name", "First name used"+FName);

	}
	public void LastName(String LName)
	{
		LastName.sendKeys(LName);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering last name", "Last name used"+LName);

	}

	public void EnterEmail(String email_id)
	{
		Email.sendKeys(email_id);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering email id", "Email used"+email_id);

	}
	public void ConfEmail(String CEmail)
	{
		ConfEmail.sendKeys(CEmail);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering confirmation email id", "Confirmation Email used"+CEmail);

	}
	public void Username(String UName)
	{
		Username.sendKeys(UName);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering user name", "User name used"+UName);

	}
	
	public void Check_Availiblity()
	{
		Check_Availiblity.click();
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicking on Check Availiblity button", "Check Availiblity used"); 

	}
	public void CountryId(String CntId)
	{
		Select select=new Select(CountryId);
		select.selectByVisibleText(CntId);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering country id", "country  used"+CntId);

	}
	public void TimeZoneId(String TZ)
	{
		Select select=new Select(TimeZoneId);
		select.selectByVisibleText(TZ);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering time zone", "time zone  used"+TZ);

	}
	public void CheckBox()
	{
		CheckBox.click();
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicking on checkbox", "Clicked on checkbox");

	}
	public void Password(String Pass)
	{
		Password.sendKeys(Pass);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering password", "Password used"+Pass);

	}
	public void ConfirmPassword(String confPass)
	{
		ConfirmPassword.sendKeys(confPass);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering Confirm password", " Confirm Password used"+confPass);

	}
	public void Details_CompanyIndustryId(String DCI)
	{
		Select select=new Select(Details_CompanyIndustryId);
		select.selectByVisibleText(DCI);
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Entering Details CompanyIndustry Id", "Details CompanyIndustry Id"+DCI);

	}
	/*public void Details_CompanySizeId(String DCS)
	{
		Select select=new Select(Details_CompanyIndustryId);
		select.selectByVisibleText(DCS);
	}
	public void Details_CompanyRoleId(String DCR)
	{
		Select select=new Select(Details_CompanyIndustryId);
		select.selectByVisibleText( DCR);
	}
	public void Company_website(String CW)
	{
		Select select=new Select(Company_website);
		select.selectByVisibleText( CW);
		}*/
	
	public void register_button()
	{
		register_button.click();
		ExtentReportManager.extentTest.log(LogStatus.INFO, "Clicking on regidter button", "Register ");

	}
	
	/*
	ExtentReportManager.extentTest.log(LogStatus.INFO,"Expcted Result:"+expctedResult,"Actual Result:"+actualResult);
	if(expctedResult.equals(successMessage.getText().toString().trim())) {
		ExtentReportManager.extentTest.log(LogStatus.PASS, "Test Status:", "Test Passed");
	}
	else
	{
		
	}
*/
	//************* valid data ******************
	public void validData(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI,String expctedResult)
	{
		try 
		{
			//Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			register_button();
			
			
			ExtentReportManager.extentTest.log(LogStatus.INFO,"Expcted Result:"+expctedResult,"Actual Result:"+successMessage.getText());
			if(expctedResult.equals(successMessage.getText().toString().trim())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "Test Status:", "Test Passed");
			}
			else
			{
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "Test Status:", "Test Failed");

			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			ExtentReportManager.extentTest.log(LogStatus.FAIL,"Expection:",e.getMessage());
		}
		//return extentTest;
	}
	public void char_Spec_Email(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI,String extentTest )
	{
		try 
		{
			//Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();
			
			/*ExtentReportManager.extentTest.log(LogStatus.INFO,"Expcted Result:"+expctedResult,"Actual Result:"+successMessage.getText());
			if(expctedResult.equals(successMessage.getText().toString().trim())) {
				ExtentReportManager.extentTest.log(LogStatus.PASS, "Test Status:", "Test Passed");
			}
			else
			{
				ExtentReportManager.extentTest.log(LogStatus.FAIL, "Test Status:", "Test Failed");

			}*/

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
/*	
public void Blank(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI,String expctedresult )
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);

			Check_Availiblity();
			CountryId(CntId);

			TimeZoneId(TZ);

			CheckBox();

			Password(Pass);

			ConfirmPassword(confPass);

			Details_CompanyIndustryId(DCI);

			
			register_button();


		}catch(Exception e)
		{
			e.printStackTrace();
		}
		//return extentTest;
	}*/
/*public ExtentTest DoubleSpace(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI, ExtentTest extentTest)
{
	try 
	{
		//Action();
		//Action();
		FirstName(FName);
		extentTest.log(LogStatus.INFO, "Entering first name", "First name used"+FName);
		LastName(LName);
		extentTest.log(LogStatus.INFO, "Entering last name", "Last name used"+LName);
		EnterEmail(email_id);
		extentTest.log(LogStatus.INFO, "Entering email id", "Email used"+email_id);
		ConfEmail(CEmail);
		extentTest.log(LogStatus.INFO, "Entering confirmation email id", "Confirmation Email used"+CEmail);
		Username(UName);
		extentTest.log(LogStatus.INFO, "Entering user name", "User name used"+UName);

		Check_Availiblity();
		extentTest.log(LogStatus.INFO, "Clicking on Check Availiblity button", "Check Availiblity used"); 
		CountryId(CntId);
		extentTest.log(LogStatus.INFO, "Entering country id", "country  used"+CntId);

		TimeZoneId(TZ);
		extentTest.log(LogStatus.INFO, "Entering time zone", "time zone  used"+TZ);

		CheckBox();
		extentTest.log(LogStatus.INFO, "Clicking on checkbox", "Clicked on checkbox");

		Password(Pass);
		extentTest.log(LogStatus.INFO, "Entering password", "Password used"+Pass);

		ConfirmPassword(confPass);
		extentTest.log(LogStatus.INFO, "Entering Confirm password", " Confirm Password used"+confPass);

		Details_CompanyIndustryId(DCI);
		extentTest.log(LogStatus.INFO, "Entering Details CompanyIndustry Id", "Details CompanyIndustry Id"+DCI);

		
		register_button();
		extentTest.log(LogStatus.INFO, "Clicking on regidter button", "Register ");
		


	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return extentTest;
}
public void Less_Char(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI,ExtentTest extentTest)
{
	try 
	{
		//Action();
		FirstName(FName);
		extentTest.log(LogStatus.INFO, "Entering first name", "First name used"+FName);
		LastName(LName);
		extentTest.log(LogStatus.INFO, "Entering last name", "Last name used"+LName);
		EnterEmail(email_id);
		extentTest.log(LogStatus.INFO, "Entering email id", "Email used"+email_id);
		ConfEmail(CEmail);
		extentTest.log(LogStatus.INFO, "Entering confirmation email id", "Confirmation Email used"+CEmail);
		Username(UName);
		extentTest.log(LogStatus.INFO, "Entering user name", "User name used"+UName);

		Check_Availiblity();
		extentTest.log(LogStatus.INFO, "Clicking on Check Availiblity button", "Check Availiblity used"); 
		CountryId(CntId);
		extentTest.log(LogStatus.INFO, "Entering country id", "country  used"+CntId);

		TimeZoneId(TZ);
		extentTest.log(LogStatus.INFO, "Entering time zone", "time zone  used"+TZ);

		CheckBox();
		extentTest.log(LogStatus.INFO, "Clicking on checkbox", "Clicked on checkbox");

		Password(Pass);
		extentTest.log(LogStatus.INFO, "Entering password", "Password used"+Pass);

		ConfirmPassword(confPass);
		extentTest.log(LogStatus.INFO, "Entering Confirm password", " Confirm Password used"+confPass);

		Details_CompanyIndustryId(DCI);
		extentTest.log(LogStatus.INFO, "Entering Details CompanyIndustry Id", "Details CompanyIndustry Id"+DCI);

		
		register_button();
		extentTest.log(LogStatus.INFO, "Clicking on regidter button", "Register ");
		

	}catch(Exception e)
	{
		e.printStackTrace();
	}
	//return extentTest;
}
public void Max_Char(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
{
	try 
	{
		//Action();
		FirstName(FName);
		LastName(LName);
		EnterEmail(email_id);
		ConfEmail(CEmail);
		Username(UName);
		Check_Availiblity();
		CountryId(CntId);
		TimeZoneId(TZ);
		CheckBox();
		Password(Pass);
		ConfirmPassword(confPass);
		Details_CompanyIndustryId(DCI);
		
		register_button();

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void Combo_NumSymbol(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
{
	try 
	{
		//Action();
		FirstName(FName);
		LastName(LName);
		EnterEmail(email_id);
		ConfEmail(CEmail);
		Username(UName);
		Check_Availiblity();
		CountryId(CntId);
		TimeZoneId(TZ);
		CheckBox();
		Password(Pass);
		ConfirmPassword(confPass);
		Details_CompanyIndustryId(DCI);
		
		register_button();

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void only_Num(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
{
	try 
	{
		//Action();
		FirstName(FName);
		LastName(LName);
		EnterEmail(email_id);
		ConfEmail(CEmail);
		Username(UName);
		Check_Availiblity();
		CountryId(CntId);
		TimeZoneId(TZ);
		CheckBox();
		Password(Pass);
		ConfirmPassword(confPass);
		Details_CompanyIndustryId(DCI);
		
		register_button();

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}*/


/*	
public void only_SpecSymbol(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
{
	try 
	{
		//Action();
		FirstName(FName);
		LastName(LName);
		EnterEmail(email_id);
		ConfEmail(CEmail);
		Username(UName);
		Check_Availiblity();
		CountryId(CntId);
		TimeZoneId(TZ);
		CheckBox();
		Password(Pass);
		ConfirmPassword(confPass);
		Details_CompanyIndustryId(DCI);
		
		register_button();

	}catch(Exception e)
	{
		e.printStackTrace();
	}
}*/
		/*public void Blank_password(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void Invalid_Username(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void Blank_username(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void Invalid_password(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void SpecChar_username(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/
	/*public void Numeric_valuein_username(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void only_Two_Char_In_username(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void HundredDigit_ID(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void HundredDigit_password(String FName,String LName,String email_id,String CEmail,String UName,String CntId,String TZ,String Pass,String confPass,String DCI)
	{
		try 
		{
			Action();
			FirstName(FName);
			LastName(LName);
			EnterEmail(email_id);
			ConfEmail(CEmail);
			Username(UName);
			Check_Availiblity();
			CountryId(CntId);
			TimeZoneId(TZ);
			CheckBox();
			Password(Pass);
			ConfirmPassword(confPass);
			Details_CompanyIndustryId(DCI);
			
			register_button();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/
}

