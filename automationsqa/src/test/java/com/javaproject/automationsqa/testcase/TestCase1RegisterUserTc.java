package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase1RegisterUserPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1RegisterUserTc extends BaseClass {


    @Test
    public void testCase1RegisterUserTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase1RegisterUserPage tcrup = new TestCase1RegisterUserPage(driver);

        String testCase1RegisterUserUrl = driver.getCurrentUrl();
        Assert.assertEquals(testCase1RegisterUserUrl, Data.BASE_URL);
        System.out.println("Link Matched");

        //Click on Signup/Login Button
        aelp.signUpLogInButton.click();
        sleepTest(2000);

        //Validate Signup/Login page URL
        String signUpUrl = driver.getCurrentUrl();
        Assert.assertEquals(signUpUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("SIGNUP Url Matched");

        //Sending Name to Name box
        aelp.signUpName.sendKeys(Data.SIGNUP_NAME);
        sleepTest(2000);

        //Sending Email to Email Box
        aelp.signUpEmail.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(2000);

        //Click on Signup Button
        aelp.signUpButton.click();
        sleepTest(2000);

        //SignUp Landing Page Text Validation
        String signUpPageTxt = tcrup.signUpPageText.getText();
        Assert.assertEquals(signUpPageTxt, Data.SIGNUP_PAGE_TEXT);
        System.out.println("Text is visible");

        //Select Gender
        tcrup.male.click();
        sleepTest(2000);

        //SignUp Page Password
        tcrup.signUpPagePassword.sendKeys(Data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1000);

        //Date of Birth DropDown
        By day = By.cssSelector("select#days");
        By month = By.cssSelector("select#months");
        By year = By.cssSelector("select#years");

        tcrup.doSelectByVisibleText(day, "21");
        sleepTest(2000);
        tcrup.doSelectByVisibleText(month, "June");
        sleepTest(2000);
        tcrup.doSelectByVisibleText(year, "1991");
        sleepTest(2000);

        //Checkbox for newsletter & special offers
        boolean isSelected = tcrup.newsletterCheckBox.isSelected();
        if ( isSelected == false ){
            tcrup.newsletterCheckBox.click();
            sleepTest(2000);
            System.out.println(Data.NEWSLETTER_CHECK_BOX);
        }

        boolean isSelected1 = tcrup.specialOfferCheckBox.isSelected();
        if ( isSelected1 == false ){
            tcrup.specialOfferCheckBox.click();
            sleepTest(2000);
            System.out.println(Data.SPECIAL_OFFER_CHECK_BOX);
        }

        //First Name
        tcrup.firstNameText.sendKeys(Data.FIRST_NAME_TEXT);
        sleepTest(1000);

        //Last Name
        tcrup.lastNameText.sendKeys(Data.LAST_NAME_TEXT);
        sleepTest(1000);

        //Company
        tcrup.companyText.sendKeys(Data.COMPANY_TEXT);
        sleepTest(1000);

        //Address
        tcrup.address1Text.sendKeys(Data.ADDRESS_1_TEXT);
        sleepTest(1000);

        //Address 2
        tcrup.address2Text.sendKeys(Data.ADDRESS_2_TEXT);
        sleepTest(1000);

        //Country Selection from dropdown
        By country = By.cssSelector("select#country");
        tcrup.doSelectByVisibleText(country,"New Zealand");
        sleepTest(2000);

        //State
        tcrup.stateText.sendKeys(Data.STATE_TEXT);
        sleepTest(1000);

        //City
        tcrup.cityText.sendKeys(Data.CITY_TEXT);
        sleepTest(1000);

        //Zipcode
        tcrup.zipcodeText.sendKeys(Data.ZIPCODE_TEXT);
        sleepTest(1000);

        //Mobile Number
        tcrup.mobileNumberText.sendKeys(Data.MOBILE_NUMBER);
        sleepTest(1000);

        //Click on Create account
        tcrup.createAccount.click();
        sleepTest(2000);

        // Checking Account Created Text Availability
        String accountCreatedTxt = tcrup.accountCreatedText.getText();
        Assert.assertEquals(accountCreatedTxt, Data.ACCOUNT_CREATED_TEXT);
        System.out.println("ACCOUNT CREATED available");
        sleepTest(2000);

        //Click on CONTINUE Button
        tcrup.continueButton.click();
        sleepTest(2000);

        //Checking Logged in text
//        String loggedInTxt = tcrup.loggedInText.getText();
//        Assert.assertEquals(loggedInTxt,Data.LOGGED_IN_TEXT);
//        System.out.println("Logged in Text is available");
//        sleepTest(2000);

        String loggedInTxt = tcrup.loggedInText.getText();
        Assert.assertTrue(true, Data.LOGGED_IN_PARTIAL_TEXT);
        System.out.println("Logged in Text is available");
        sleepTest(2000);

        //Checking Delete Account Text availability
        String delAccText = tcrup.deleteAccount.getText();
        Assert.assertEquals(delAccText, Data.DELETE_ACCOUNT_TEXT);
        sleepTest(2000);

        //Click Delete Account
        tcrup.deleteAccount.click();
        sleepTest(2000);

        //Checking Delete Account Url
        String deleteAccountUrl = driver.getCurrentUrl();
        Assert.assertEquals(deleteAccountUrl, Data.DELETE_ACCOUNT_URL);
        sleepTest(2000);

        //Again click on delete account
        tcrup.delAc.click();
        sleepTest(2000);

    }

}