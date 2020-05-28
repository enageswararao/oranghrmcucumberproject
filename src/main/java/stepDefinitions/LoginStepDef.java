package stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrmapp.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class LoginStepDef {
	final static Logger logger = Logger.getLogger(LoginStepDef.class);
     WebDriver driver=null;
	 LoginPage loginpage=null;
 
	 String username="Admin";
@Before
public void setup() {
    
   logger.info("Click on Login button  ");

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver\\chromedriver.exe");
	logger.info("Chrome Driver exe location:"+System.getProperty("user.dir")+"\\drivers\\chromedriver\\chromedriver.exe");	
	   driver=new ChromeDriver();
		logger.info("Chrome Driver is Opened");
	 
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

	loginpage.getUserNameWebElement().sendKeys("Admin");
	logger.info("Entered user name "+username);

}

@When("^Enter the Password in Password Textbox$")
public void enter_the_Password_in_Password_Textbox()  {
	loginpage.getPasswordWebElement().sendKeys("admin123");
	System.out.println("statement 3..................................");
}

@When("^Click on Login Button$")
public void click_on_Login_Button()   {
	 loginpage.getloginWebElement().click();
	System.out.println("statement 4.................................."); 
}

@SuppressWarnings("deprecation")
@Then("^Verify the message,\"([^\"]*)\"$")
public void verify_the_message(String arg1)   {
		/*
		 * loginpage.getUserName().sendKeys("Admin"); //Assert.assertEquals(username,
		 * profilepage.getText(profilepage.welcometxt));
		 * System.out.println("statement 5..................................");
		 * 
		 * String actualValue=profilepage.getText(profilepage.welcometxt); String []
		 * actualText=actualValue.split(" ");
		 * Assert.assertTrue(profilepage.verifyequalString(username,actualText[0] ));
		 */
	

}

 

}
