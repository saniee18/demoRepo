package TestCase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import PO.PO_NOP_Commerce;
import org.testng.annotations.*;
import java.io.InputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Utility.BrowserManager;
import Utility.ExtentReportManager;
public class NOP_Commerce_TestCase {
    WebDriver driver;
    JSONObject NopCommerce;
    ExtentReports extentReport;
    ExtentTest extentTest;
    @BeforeClass
    public void beforeClass()throws Exception
    {
    	InputStream datais=null;
    	try
    	{
    		String FileName="data/NOP_Commerce.json";
    		datais= getClass().getClassLoader().getResourceAsStream(FileName);
    		JSONTokener tokener=new JSONTokener(datais);
    		NopCommerce=new JSONObject(tokener);
    		System.out.println("Data is"+NopCommerce.toString());
    		ExtentReportManager.createReport("Registration_report");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	Date date = new Date();
    	
    	String time=date.getTime()+"";
    	extentReport=new ExtentReports(System.getProperty("user.dir")+"/target/data-output/register_report_"+time+".html");
    }
    
    @BeforeMethod
    @Parameters({"browser","url"})
    public void setup(String browser, String url)throws InterruptedException {
        
        driver = BrowserManager.getDriver(browser);
        Thread.sleep(3000);
        
        driver.get(url);
        Thread.sleep(3000);

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       extentTest=extentReport.startTest("registration_Testcase");
        
    }
    /*@Test(testName="ValidData",description="testing nopCommerce for successful scenario")
    public void test_registration_validData()
    {
    	PO_NOP_Commerce obj=new PO_NOP_Commerce(driver);
    	PageFactory.initElements(driver, obj);
    	//obj.validData("Sanika", "Chati", "sanikachati5@gmail.com", "sanikachati5@gmail.com", "saniee", "Check_Availablity", "India", "(UTC-09:00) Alaska", "CheckBox", "Sanie@18", "Sanie@18", "I am student", "Register");
    }*/
    
    
    @Test(testName="valida_data_registration")
    public void Valid_Data()
    { 
    	String FirstName=NopCommerce.getJSONObject("Valid").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("Valid").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("Valid").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("Valid").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("Valid").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("Valid").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("Valid").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("Valid").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("Valid").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("Valid").getString("Details_CompanyIndustryId");
    	//System.out.println("fount data"+FirstName+" "+LastName);
    	String expctedResult=NopCommerce.getJSONObject("Valid").getString("expctedResult");

    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	obj.validData(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId,expctedResult);
    	
    }
  
    
    @Test
    public void Char_SpecChar()
    {     
    	String FirstName=NopCommerce.getJSONObject("Char_SpecChar").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("Char_SpecChar").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("Char_SpecChar").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("Char_SpecChar").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("Char_SpecChar").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("Char_SpecChar").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("Char_SpecChar").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("Char_SpecChar").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("Char_SpecChar").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("Char_SpecChar").getString("Details_CompanyIndustryId");
    	String expctedResult=NopCommerce.getJSONObject("Valid").getString("expctedResult");

    	//System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	obj.char_Spec_Email(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId,expctedResult);
    
    }
    
   /*
    @Test
    public void AllBlank()
    {     
    	String FirstName=NopCommerce.getJSONObject("Blank").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("Blank").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("Blank").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("Blank").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("Blank").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("Blank").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("Blank").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("Blank").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("Blank").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("Blank").getString("Details_CompanyIndustryId");
    	
    //	System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	extentTest=obj.Blank(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId, extentTest);
    	}
    
     
    @Test
    public void DoubleSpace()
    {
    	String FirstName=NopCommerce.getJSONObject("DoubleSpace").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("DoubleSpace").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("DoubleSpace").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("DoubleSpace").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("DoubleSpace").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("DoubleSpace").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("DoubleSpace").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("DoubleSpace").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("DoubleSpace").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("DoubleSpace").getString("Details_CompanyIndustryId");
    	
    	//System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	extentTest=obj.Less_Char(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId,extentTest);
    }
    
    
    @Test 
    public void LessChar()
    {     
    	String FirstName=NopCommerce.getJSONObject("LessChar").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("LessChar").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("LessChar").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("LessChar").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("LessChar").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("LessChar").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("LessChar").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("LessChar").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("LessChar").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("LessChar").getString("Details_CompanyIndustryId");
    	
    	//System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	obj.
(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId,expctedResult);
    }
    
   
    @Test 
    public void MaxChar()
    {     
    	String FirstName=NopCommerce.getJSONObject("MaxChar").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("MaxChar").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("MaxChar").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("MaxChar").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("MaxChar").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("MaxChar").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("MaxChar").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("MaxChar").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("MaxChar").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("MaxChar").getString("Details_CompanyIndustryId");
    	
    	System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	obj.Max_Char(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId);
    }
    

    @Test 
    public void ComboNumSymbol()
    {     
    	String FirstName=NopCommerce.getJSONObject("ComboNumSymbol").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("ComboNumSymbol").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("ComboNumSymbol").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("ComboNumSymbol").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("ComboNumSymbol").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("ComboNumSymbol").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("ComboNumSymbol").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("ComboNumSymbol").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("ComboNumSymbol").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("ComboNumSymbol").getString("Details_CompanyIndustryId");
    	
    	System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	obj.Combo_NumSymbol(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId);
    }
    
    
    @Test 
    public void OnlyNum()
    {     
    	String FirstName=NopCommerce.getJSONObject("OnlyNum").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("OnlyNum").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("OnlyNum").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("OnlyNum").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("OnlyNum").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("OnlyNum").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("OnlyNum").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("OnlyNum").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("Char_SpecChar").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("Char_SpecChar").getString("Details_CompanyIndustryId");
    	
    	System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	obj.only_Num(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId);
    }  
    @Test    
    
    public void OnlySpecSymbo()
    {     
    	String FirstName=NopCommerce.getJSONObject("OnlySpecSymbol").getString("FirstName");
    	String LastName=NopCommerce.getJSONObject("OnlySpecSymbol").getString("LastName");
    	String EnterEmail=NopCommerce.getJSONObject("OnlySpecSymbol").getString("EnterEmail");
    	String ConfEmail=NopCommerce.getJSONObject("OnlySpecSymbol").getString("ConfEmail");
    	String Username=NopCommerce.getJSONObject("OnlySpecSymbol").getString("Username");
    	String CountryId=NopCommerce.getJSONObject("OnlySpecSymbol").getString("CountryId");
    	String TimeZoneId=NopCommerce.getJSONObject("OnlySpecSymbol").getString("TimeZoneId");
    	String Password=NopCommerce.getJSONObject("OnlySpecSymbol").getString("Password");

    	String ConfirmPassword=NopCommerce.getJSONObject("OnlySpecSymbol").getString("ConfirmPassword");
    	String Details_CompanyIndustryId=NopCommerce.getJSONObject("OnlySpecSymbol").getString("Details_CompanyIndustryId");
    	
    	System.out.println(FirstName);
    	
    	
    	PO_NOP_Commerce obj=PageFactory.initElements(driver, PO_NOP_Commerce.class);
    	obj.only_SpecSymbol(FirstName, LastName, EnterEmail, ConfEmail, Username, CountryId, TimeZoneId, Password, ConfirmPassword, Details_CompanyIndustryId);
    }
    */
    
//    @AfterMethod
//    public void tearDown()
//    {
//    	//driver.quit();
//    }
    @AfterMethod
    public void tearDown()
    {
    	
    	ExtentReportManager.extentReport.endTest(ExtentReportManager.extentTest);
    }
    @AfterClass
    public void StopRreport()
    {
    	ExtentReportManager.extentReport.flush();
    }
    
}