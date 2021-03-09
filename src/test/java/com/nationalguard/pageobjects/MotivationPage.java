package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotivationPage {
	
	 public MotivationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[@for='motivation_1']")
	public WebElement motive;
	
	public void motivation() {
		motive.click();
	}

}
