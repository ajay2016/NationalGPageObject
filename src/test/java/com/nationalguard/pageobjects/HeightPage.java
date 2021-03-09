package com.nationalguard.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HeightPage {
	
	public HeightPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@id='feet']")
	public WebElement feet;
	
	
	@FindBy(xpath ="//*[@id='inches']")
	public WebElement inches;
	
	public void selectfeet(String data) {
		Select s = new Select(feet);
		s.selectByVisibleText(data);
		
	}
	
	public void selectinches(String data) {
		Select s = new Select(inches);
		s.selectByVisibleText(data);
		
	}
	
	public void selectheight(String feetdata, String inchesdata) {
		
		Select s = new Select(feet);
		s.selectByVisibleText(feetdata);
		s= new Select(inches);
		s.selectByVisibleText(inchesdata);
		
		
		
		
	}

}
