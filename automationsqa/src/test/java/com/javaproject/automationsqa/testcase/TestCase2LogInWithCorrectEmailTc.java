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

        aelp.signUpLogIn.click();
        sleepTest(1000);

        String TestCase2LogInWithCorrectEmailPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(TestCase2LogInWithCorrectEmailPageUrl, Data.SIGNUP_URL);
        System.out.println("Link matched.");
        sleepTest(1000);

        tcliwcep.emailAddress.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(2000);

        tcliwcep.password.sendKeys(Data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        tcliwcep.logInButton.click();
        sleepTest(1500);

        String loggedInAsTxt = tcliwcep.loggedInAs.getText();
        Assert.assertTrue(true, Data.LOGGED_IN_PARTIAL_TEXT);
        sleepTest(1500);
        System.out.println("You are logged in");

    }
}