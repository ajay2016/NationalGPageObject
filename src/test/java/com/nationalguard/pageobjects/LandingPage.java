package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage  {
	
	

	// constructor

	public LandingPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "button")
	public WebElement getStartedbutton;

	public void clickButton() {
		
		 getStartedbutton.click();
	}

}
