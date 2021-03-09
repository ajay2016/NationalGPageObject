package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicInformationPage {
	
	 public BasicInformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="get-started_first_name")
	public WebElement firstname;
	
	@FindBy(name="get-started_last_name")
	public WebElement lastname;
	
	@FindBy(name="get-started_email")
	public WebElement email;
	
	@FindBy(name="get-started_phone")
	public WebElement phone;
	
	@FindBy(name="get-started_zip")
	public WebElement zip;
	
	@FindBy(name="get-started_submit")
	public WebElement submit;
	
	//Filling up form
	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void enterEmail(String emailadd) {
		email.sendKeys(emailadd);
	}
	
	public void enterPhoneNumber(String phonenum) {
		phone.sendKeys(phonenum);
	}
	
	public void enterZip(String zipcode) {
		zip.sendKeys(zipcode);
	}
	
	public void clickSubmitButton() {
		submit.click();
	}
	
	

}
