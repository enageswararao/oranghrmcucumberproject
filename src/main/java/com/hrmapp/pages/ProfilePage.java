package com.hrmapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {
	
	
	//****************************************************************************************
	// Properties or WebLocator for ProfilePage page
	//****************************************************************************************
	public By welcometxt=By.id("welcome");
	
	
	WebDriver driver;
	//****************************************************************************************
	// ProfilePage page construction with driver parameter 
	//****************************************************************************************
	
	public ProfilePage(WebDriver driver ) {  
		super(driver);
	 System.out.println("Login page constructor is called................");
		this.driver=driver;
	}
	
	
	
	
	

}
