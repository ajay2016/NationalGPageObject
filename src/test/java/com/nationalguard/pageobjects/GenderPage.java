package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenderPage {
	
	
	
	public GenderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//label[@for='gender_1']")
	public WebElement gender;
	
	public void chooseGender() {
		gender.click();
	}

}
