package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthDatePage {
	
	 public BirthDatePage(WebDriver driver) {
		 
		 PageFactory.initElements(driver, this);
	 
	 }
	
	
	@FindBy(name="get-started_birth_date")
	public WebElement birthdate;
	
	public void enterBirthDate(String dob) {
		birthdate.sendKeys(dob);
	}
}
