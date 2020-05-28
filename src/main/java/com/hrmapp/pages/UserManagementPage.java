package com.hrmapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserManagementPage extends BasePage {
	
	//****************************************************************************************
		// Properties or WebLocator for User Management
		//****************************************************************************************
//	public By userName=By.id("txtUsername");
	
	public By adminLink=By.id("menu_admin_viewAdminModule");
	public By adduserBtn=By.className("btnAdd");
	public By employeeName=By.id("systemUser_employeeName_empName");
	public By userName=By.className("systemUser[userName]");
	public By pwd=By.id("systemUser_password");
	public By cofrmnPwd=By.id("systemUser_confirmPassword");
	public By saveBtn=By.id("btnSave");
	
	

	
	WebDriver driver;
	//****************************************************************************************
		//  User Management construction with driver parameter 
		//****************************************************************************************
	public UserManagementPage(WebDriver driver ) {  
		super(driver);	
		this.driver=driver;
	}
	
	
	//****************************************************************************************
		//  User Management actions or methods 
		//****************************************************************************************

	public WebElement getadminLinkElement() {
		return driver.findElement(adminLink);
		
	}		
	
	public WebElement getaddUserBtnElement() {
		WebElement adduserElement= driver.findElement(adduserBtn);
		return adduserElement;
	}
	
	public WebElement getemployeeNameElement() {
		return driver.findElement(employeeName);
	}
	
	public WebElement getuserNameElement() {
		return driver.findElement(userName);
	}
	
	public WebElement getpwdElement() {
		return driver.findElement(pwd);
	}
	
	public WebElement getconfirmPwdElement() {
		return driver.findElement(cofrmnPwd);
	}
	
	public WebElement getsaveBtnElement() {
		return driver.findElement(saveBtn);
	}
	
	
	
		
	}
	



 