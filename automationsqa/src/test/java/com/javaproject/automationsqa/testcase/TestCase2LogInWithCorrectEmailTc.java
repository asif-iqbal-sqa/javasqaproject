package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase2LogInWithCorrectEmailPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2LogInWithCorrectEmailTc extends BaseClass{

    @Test
    public void testCase2LogInWithCorrectEmailTc(){

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase2LogInWithCorrectEmailPage tcliwcep = new TestCase2LogInWithCorrectEmailPage(driver);

        aelp.signUpLogInButton.click();
        sleepTest(1000);

        String TestCase2LogInWithCorrectEmailPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(TestCase2LogInWithCorrectEmailPageUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("Link matched.");
        sleepTest(1000);

        String loginToYourAccountText = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountText,Data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        sleepTest(1500);
        System.out.println("Login to your account is showing");

        aelp.loginEmailAddress.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(2000);

        aelp.loginPassword.sendKeys(Data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);

//        String loggedInAsTxt = tcliwcep.loggedInAs.getText();
//        Assert.assertTrue(true, Data.LOGGED_IN_PARTIAL_TEXT);
//        sleepTest(1500);
//        System.out.println("You are logged in");

        String loggedInAsTxt = tcliwcep.loggedInAs.getText();
        if (loggedInAsTxt.contains(Data.LOGGED_IN_PARTIAL_TEXT)){
            System.out.println("Yo Man Experiment Works");
            sleepTest(10000);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

    }
}