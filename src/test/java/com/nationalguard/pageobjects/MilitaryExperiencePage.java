package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MilitaryExperiencePage {
	
	 public MilitaryExperiencePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='military_1']")
	public WebElement NoButton;
	
	public void clickno() {
		NoButton.click();
	}
	

}
