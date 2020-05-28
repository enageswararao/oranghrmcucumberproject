package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrmapp.pages.UserManagementPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;

public class UserManagementStepDef {
WebDriver driver=null;
UserManagementPage usermanagementpage=null;
	@Before
	public void setup() {
	    
	 

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver\\chromedriver.exe");
		 
		   driver=new ChromeDriver();
		 
		 
	}


@After
public void  teardown() {
	driver.close();
	System.out.println("@After method .................................");
}
  
@When("^user click on admin link$")
public void user_click_on_admin_link()  {
	usermanagementpage=new UserManagementPage(driver);
	usermanagementpage.getadminLinkElement().click();
}

@When("^user on add user button$")
public void user_on_add_user_button() {
  
}

@When("^use select the user as \"([^\"]*)\"$")
public void use_select_the_user_as(String arg1) {
   
}

@When("^use enters the employee name as \"([^\"]*)\"$")
public void use_enters_the_employee_name_as(String arg1)  {
    
}

@When("^user enters the user name as \"([^\"]*)\"$")
public void user_enters_the_user_name_as(String arg1) {
   
}

@When("^user enters the password as \"([^\"]*)\"$")
public void user_enters_the_password_as(String arg1)  {
    
}

@When("^user enters the confirm password as \"([^\"]*)\"$")
public void user_enters_the_confirm_password_as(String arg1) {
   
}

@When("^user click on save button$")
public void user_click_on_save_button()  {
   
}

  
	
	
	
	
	
	
	
	
}
