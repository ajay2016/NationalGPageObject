package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
	
	 public ReviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name ="get-started_submit")
	public WebElement submitbutton;
	
	public void clickButton() {
		submitbutton.click();
	}

}
