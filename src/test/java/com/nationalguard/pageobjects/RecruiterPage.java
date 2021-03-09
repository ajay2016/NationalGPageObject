package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruiterPage {
	
	 public RecruiterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class='recruiter-contact']/div/p[1]")
	public WebElement recruitername;
	
	public String verifytextpresent() {
		
		String text =recruitername.getText();
		return text;
	}

}
