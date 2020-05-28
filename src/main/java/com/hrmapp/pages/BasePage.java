package com.hrmapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;

	}

	 
	public String getText(By by) {

		return driver.findElement(by).getText();
	}

	public void dropdownByVisibleText(By by,String value) {
		
		Select select=new Select(driver.findElement(by));
		select.selectByVisibleText(value);
		
	}
	public void dropdownByValueText(By by,String value) {
		
		Select select=new Select(driver.findElement(by));
		select.selectByValue(value);
		
	}
	public void dropdownByIndex(By by,int index) {
		
		Select select=new Select(driver.findElement(by));
		select.selectByIndex(index);
		
	}
	
	public boolean verifyequalString(String expectedString,String actualString) {
		
		if(expectedString.equals(actualString)) {
			return true;
		}
		
		return false;
		
	}
	 
	
}
