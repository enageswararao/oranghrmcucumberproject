package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

 

@When("^user enter username$")
public void user_enter_username() throws Throwable {
   System.out.println("user enter username");
}

@When("^user enter password$")
public void user_enter_password() throws Throwable {
	 System.out.println("user enter password");
}

@When("^user click Login button$")
public void user_click_Login_button() throws Throwable {
	 System.out.println("user click Login button");
}

@Then("^verify profile icon$")
public void verify_profile_icon() throws Throwable {
	 System.out.println("verify profile icon");
}

@Given("^user is already on Login page$")
public void user_is_already_on_Login_page() throws Throwable {
	 System.out.println("user is already on Login page");
}



}
