package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollegeDegreePage {
	
	public CollegeDegreePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//label[@for='college_degree_1']")
	public WebElement collegedegree;
	
	public void choosecollegedegree() {
		collegedegree.click();
	}

}
