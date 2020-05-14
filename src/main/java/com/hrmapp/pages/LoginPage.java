package com.hrmapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	
	//****************************************************************************************
	// Properties or WebLocator for Login page
	//****************************************************************************************
	public By userName=By.id("txtUsername");
	public	By password=By.id("txtPassword");
	public By login=By.id("btnLogin");
	
	WebDriver driver;
	//****************************************************************************************
	// Login page construction with driver parameter 
	//****************************************************************************************
	
	public LoginPage(WebDriver driver ) {  
		super(driver);
	 System.out.println("Login page constructor is called................");
		this.driver=driver;
	}

	//****************************************************************************************
	// Login page actions or methods 
	//****************************************************************************************
	
	public void loginSuccess(){
		
 		driver.findElement(userName).sendKeys("Admin");
	    driver.findElement(password).sendKeys("admin123");
	    driver.findElement(login).click();      
			 
	}
	
	public ProfilePage clickOnLogin(By by) {
		
		     click(by);
		     
		return new ProfilePage(driver);
		
	}
	 
	
}
