package TestCase;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_Facebook;
import Utility.BrowserManager;

public class Facebook_Testcase {
	  WebDriver driver;
	    JSONObject PO_Facebook;
	    
	    
	    @BeforeMethod
	    public void beforeClass()throws Exception
	    {
	    	InputStream datais=null;
	    	try
	    	{
	    		String FileName="Data/Facebook.json";
	    		datais= getClass().getClassLoader().getResourceAsStream(FileName);
	    		JSONTokener tokener=new JSONTokener(datais);
	    		PO_Facebook=new JSONObject(tokener);
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	    @Parameters({"browser","url"})
	    public void setup(String browser, String url)throws InterruptedException {
	        
	        driver = BrowserManager.getDriver(browser);
	        Thread.sleep(3000);
	        driver.get(url);
	        Thread.sleep(3000);

	        
	    }
	    @Test(testName="ValidData",description="testing nopCommerce for successful scenario")
	    public void test_registration_validData()
	    {
	    	PO_Facebook obj=new PO_Facebook(driver);
	    	PageFactory.initElements(driver, obj);
	    	//obj.validData("Sanika", "Chati", "sanikachati5@gmail.com", "sanikachati5@gmail.com", "saniee", "Check_Availablity", "India", "(UTC-09:00) Alaska", "CheckBox", "Sanie@18", "Sanie@18", "I am student", "Register");
	    }
	    public void Valid_Data()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("Valid").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("Valid").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("Valid").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Valid_Data(Email, Password);
	    }
	    
	    public void All_Blank()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("All_Blank").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("All_Blank").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("All_Blank").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Blank(Email, Password);
	    }
	    public void LessChar()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("LessChar").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("LessChar").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("LessChar").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Less_Char(Email, Password);
	    }
	    public void MaxChar()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("MaxChar").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("MaxChar").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("MaxChar").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Max_Char(Email, Password);
	    }
	    public void ComboNumSymbol()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("ComboNumSymbol").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("ComboNumSymbol").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("ComboNumSymbol").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Combo_NumSymbol(Email, Password);
	    }
	    public void onlyNum()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("onlyNum").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("onlyNum").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("onlyNum").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.only_Num(Email, Password);
	    }
	    public void onlySpecSymbol()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("onlySpecSymbol").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("onlySpecSymbol").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("onlySpecSymbol").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.only_SpecSymbol(Email, Password);
	    }
	    public void Double_Space()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("Double_Space").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("Double_Space").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("Double_Space").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.DoubleSpace(Email, Password);
	    }
	    public void Blankpassword()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("Blankpassword").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("Blankpassword").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("Blankpassword").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Blank_password(Email, Password);
	    }
	    public void InvalidUsername()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("InvalidUsername").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("InvalidUsername").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("InvalidUsername").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Invalid_Username(Email, Password);
	    }
	    public void Invalidpassword()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("Invalidpassword").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("Invalidpassword").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("Invalidpassword").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Invalid_password(Email, Password);
	    }
	    public void Blankusername_password()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("Blankusername_password").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("Blankusername_password").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("Blankusername_password").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.Blank_username_password(Email, Password);
	    }
	    public void SpecCharusername()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("SpecCharusername").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("SpecCharusername").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("SpecCharusername").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.SpecChar_username(Email, Password);
	    }
	    public void onlyTwo_Char_In_username()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("onlyTwo_Char_In_username").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("onlyTwo_Char_In_username").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("onlyTwo_Char_In_username").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.only_Two_Char_In_username(Email, Password);
	    }
	    public void HundredDigitID()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("HundredDigitID").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("HundredDigitID").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("HundredDigitID").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.HundredDigit_ID(Email, Password);
	    }
	    public void HundredDigitpassword()
	    {        //po                                                    //json
	    	String Email=PO_Facebook.getJSONObject("HundredDigitpassword").getString("Email");
	    	String Password=PO_Facebook.getJSONObject("HundredDigitpassword").getString("Password");
	    	String Loginbutton=PO_Facebook.getJSONObject("HundredDigitpassword").getString("Loginbutton");
	    	
	    	PO_Facebook obj=PageFactory.initElements(driver, PO_Facebook.class);
	    	obj.HundredDigit_password(Email, Password);
	    }
	    
}
