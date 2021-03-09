package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneNumberPage {	
	
	
	public PhoneNumberPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name="get-started_phone")
	public WebElement phonenumber;

	public void enterPhoneNumber(String phonenum) {
		phonenumber.sendKeys(phonenum);
	}
}
