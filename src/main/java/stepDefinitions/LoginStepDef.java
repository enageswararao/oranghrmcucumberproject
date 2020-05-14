package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrmapp.pages.LoginPage;
import com.hrmapp.pages.ProfilePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {

     WebDriver driver=null;
	 LoginPage loginpage=null;
	 ProfilePage profilepage=null;
	 String username="Admin";
@Before
public void setup() {
	System.out.println("@Before method .................................");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver\\chromedriver.exe");
	   driver=new ChromeDriver();
	 
}



@After
public void  teardown() {
	driver.close();
	System.out.println("@After method .................................");
}
  
@Given("^load the Orange HRM application url$")
public void load_the_Orange_HRM_application_url()   {
	 driver.get("https://opensource-demo.orangehrmlive.com/");
}

@When("^Enter the user name in Username textbox$")
public void enter_the_user_name_in_Username_textbox()   {
	loginpage=new LoginPage(driver); 
	loginpage.inputText(loginpage.userName, "Admin");  

}

@When("^Enter the Password in Password Textbox$")
public void enter_the_Password_in_Password_Textbox()  {
	loginpage.inputText(loginpage.password, "admin123"); 
	System.out.println("statement 3..................................");
}

@When("^Click on Login Button$")
public void click_on_Login_Button()   {
	profilepage=loginpage.clickOnLogin(loginpage.login);
	System.out.println("statement 4.................................."); 
}

@SuppressWarnings("deprecation")
@Then("^Verify the message,\"([^\"]*)\"$")
public void verify_the_message(String arg1)   {
	
	//Assert.assertEquals(username, profilepage.getText(profilepage.welcometxt));
	System.out.println("statement 5..................................");
	
	String actualValue=profilepage.getText(profilepage.welcometxt);
	String [] actualText=actualValue.split(" ");
	Assert.assertTrue(profilepage.verifyequalString(username,actualText[0] ));
	

}

 

}
