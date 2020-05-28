package com.hrmapp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

 

public class LoginPage extends BasePage{
	
	final static Logger logger = Logger.getLogger(LoginPage.class);
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
		logger.info("Login page constructor is called  ");	
		this.driver=driver;
	}

	//****************************************************************************************
	// Login page actions or methods 
	//****************************************************************************************
	
	public WebElement getUserNameWebElement() {
		return driver.findElement(userName);
	}
	
	
	public WebElement getPasswordWebElement() {
		return driver.findElement(password);
	}
	
	
	public WebElement getloginWebElement() {
		return driver.findElement(login);
	}
	
	
	public void loginSuccess(){
		
 		driver.findElement(userName).sendKeys("Admin");
	    driver.findElement(password).sendKeys("admin123");
	    getloginWebElement().click();     
		logger.info("Click on Login button  ");	
			 
	}
 
 
	
	
 

  
	 
	
}
