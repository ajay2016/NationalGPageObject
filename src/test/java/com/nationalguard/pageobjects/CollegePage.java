package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollegePage {
	
	public CollegePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//label[@for='college_0']")
	public WebElement collegetime;
	
	public void collegeyes() {
		collegetime.click();
	}

}
