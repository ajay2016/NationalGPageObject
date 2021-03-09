package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeightPage {
	
	public WeightPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[@for='weight_1']")
	public WebElement weight;
	
	public void choosweight() {
		weight.click();
		
	}

}
