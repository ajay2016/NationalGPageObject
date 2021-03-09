package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiplomaPage {
	
	 public DiplomaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='high_school_0']")
	public WebElement diplomayes;
	
	public void choosediploma() {
		diplomayes.click();
	}

}
