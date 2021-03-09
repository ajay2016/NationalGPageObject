package com.nationalguard.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.nationalguard.base.BaseTest;
import com.nationalguard.pageobjects.BasicInformationPage;
import com.nationalguard.pageobjects.BirthDatePage;
import com.nationalguard.pageobjects.CollegeDegreePage;
import com.nationalguard.pageobjects.CollegePage;
import com.nationalguard.pageobjects.DiplomaPage;
import com.nationalguard.pageobjects.GenderPage;
import com.nationalguard.pageobjects.HeightPage;
import com.nationalguard.pageobjects.LandingPage;
import com.nationalguard.pageobjects.MilitaryExperiencePage;
import com.nationalguard.pageobjects.MotivationPage;
import com.nationalguard.pageobjects.PhoneNumberPage;
import com.nationalguard.pageobjects.RecruiterPage;
import com.nationalguard.pageobjects.ReviewPage;
import com.nationalguard.pageobjects.WeightPage;
import com.nationalguard.utilities.DataUtil;

public class GetStartedFormTestPageObject extends BaseTest {
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "data")
	public void GetStartedForm(Hashtable<String, String> data) throws IOException {
		
		ExtentTest test = BaseTest.getLog();
		//ExtentTest test =ExtentListeners.testReport.get().info("Test Started");
		
		if (!DataUtil.isRunnable("loginValid") || data.get("Runmode").equals("N")) {
			
			
				test.log(Status.SKIP, "Test skipped since rumode is N");
				throw new SkipException("Test skipped since rumode is N");

			}	
		
		test.log(Status.INFO, "Opening a browser "+data.get("Browser"));
		// opening chrome browser
		openBrowser(data.get("Browser"));
		
		// navigate to given url
		test.log(Status.INFO, "Navigate to "+prop.getProperty("appurl"));
		navigate("appurl");
		
		
		// click on the get startd button
		test.log(Status.INFO, "Click on get started");		
		LandingPage p = new LandingPage(driver);
		p.clickButton();
		
		
		// type data to the fields from excel database
		test.log(Status.INFO, "Typing data on fields ");
		
		BasicInformationPage infopage = new BasicInformationPage(driver);
		infopage.enterFirstName(data.get("FirstName"));
		
		infopage.enterLastName(data.get("LastName"));
		
		infopage.enterEmail(data.get("Email"));
	
		infopage.enterPhoneNumber(data.get("PhoneNumber"));
		
		infopage.enterZip(data.get("Zipcode"));
		
		// click common locator
		infopage.clickSubmitButton();
		
		// data input and click
		BirthDatePage date = new BirthDatePage(driver);
		date.enterBirthDate(data.get("Birthdate"));
		infopage.clickSubmitButton();
		
		// phone
		PhoneNumberPage phone = new PhoneNumberPage(driver);
		phone.enterPhoneNumber(data.get("PhoneNumber"));
		infopage.clickSubmitButton();
		
		// gender selection
		GenderPage gender = new GenderPage(driver);
		gender.chooseGender();
		infopage.clickSubmitButton();

		// Military Experience		
		MilitaryExperiencePage exp = new MilitaryExperiencePage(driver);
		exp.clickno();
		infopage.clickSubmitButton();
		
		// diploma
		DiplomaPage dip = new DiplomaPage(driver);
		dip.choosediploma();		
		infopage.clickSubmitButton();
		
		
		// college
		CollegePage col = new CollegePage(driver);
		col.collegeyes();
		infopage.clickSubmitButton();
		
		// college degree
		CollegeDegreePage degree = new CollegeDegreePage(driver);
		degree.choosecollegedegree();
		infopage.clickSubmitButton();
		
		
		// select height
		HeightPage height = new HeightPage(driver);
		height.selectfeet("5");
		height.selectinches("10");
		//height.selectheight("5", "10");
		infopage.clickSubmitButton();
		
		// weight
		WeightPage weigh = new WeightPage(driver);
		weigh.choosweight();
		infopage.clickSubmitButton();
		
		// motivation
		MotivationPage motive = new MotivationPage(driver);
		motive.motivation();
		infopage.clickSubmitButton();
		
		
		// final submit
		test.log(Status.INFO, "Form submitted after review." );
		ReviewPage review = new ReviewPage(driver);
		review.clickButton();
	
		// check recruiter is present and print it with zipcode
		RecruiterPage recruit = new RecruiterPage(driver);
		String recruiterName = recruit.verifytextpresent();
		
		System.out.println("The Recruiter appointed on Zipcode "+data.get("Zipcode")+" is " +recruiterName);

}
}
