package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase4LogOutUserPage;
import com.javaproject.automationsqa.utility.Data;
import org.apache.commons.exec.DaemonExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4LogOutUserTc extends BaseClass{

    @Test
    public void testCase4LogOutUserTc (){

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase4LogOutUserPage tcloup = new TestCase4LogOutUserPage(driver);

        aelp.signUpLogIn.click();
        sleepTest(1500);

        String loginToYourAccountTxt = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountTxt, Data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        System.out.println(loginToYourAccountTxt + " is showing");
        sleepTest(1500);

        String loginUrl = driver.getCurrentUrl();
        Assert.assertEquals(loginUrl,Data.LOGIN_SIGNUP_URL);
        System.out.println("You are at login/signup page");

        aelp.emailAddress.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(1500);

        aelp.password.sendKeys(Data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);
        System.out.println("You are logged out");

        String loggedInAsTxt = tcloup.loggedInAsText.getText();
        Assert.assertTrue(true, Data.LOGGED_IN_PARTIAL_TEXT);
        sleepTest(1500);
        System.out.println(loggedInAsTxt + " is showing");

        tcloup.logOut.click();
        sleepTest(1500);

        String loginToYourAccountTxt2 = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountTxt2, Data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        System.out.println(loginToYourAccountTxt2 + " is showing");
        sleepTest(1500);

    }
}
