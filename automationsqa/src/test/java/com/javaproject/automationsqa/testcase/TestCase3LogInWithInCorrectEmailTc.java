package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase3LogInWithInCorrectEmailPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3LogInWithInCorrectEmailTc extends BaseClass{

    @Test
    public void testCase3LogInWithInCorrectEmailTc (){

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase3LogInWithInCorrectEmailPage tcliwice = new TestCase3LogInWithInCorrectEmailPage(driver);

        aelp.signUpLogIn.click();
        sleepTest(1000);

        String signUpUrl = driver.getCurrentUrl();
        Assert.assertEquals(signUpUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("URL Matched");
        sleepTest(1500);

        aelp.emailAddress.sendKeys(Data.INCORRECT_EMAIL);
        sleepTest(1500);
        System.out.println("Incorrect Email Wrote");

        aelp.password.sendKeys(Data.INCORRECT_PASSWORD);
        sleepTest(1500);
        System.out.println("Incorrect Password Wrote");

        aelp.loginButton.click();
        sleepTest(1500);
        System.out.println("Login clicked");

        String incorrectMessag = tcliwice.incorrectMessage.getText();
        Assert.assertEquals(incorrectMessag,Data.INCORRECT_TEXT);
        sleepTest(1500);
        System.out.println("Incorrect Message Showed");

    }
}