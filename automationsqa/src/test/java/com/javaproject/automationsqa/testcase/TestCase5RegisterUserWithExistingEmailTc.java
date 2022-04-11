package com.javaproject.automationsqa.testcase;


import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase5RegisterUserWithExistingEmailPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5RegisterUserWithExistingEmailTc extends BaseClass {

    @Test
    public void testCase5RegisterUserWithExistingEmailTc(){

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase5RegisterUserWithExistingEmailPage tcruweep = new TestCase5RegisterUserWithExistingEmailPage(driver);

        aelp.signUpLogIn.click();

        String signupPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(signupPageUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("Valida Url");
        sleepTest(1500);

        String newUserSignupTxt = aelp.newUserSignupText.getText();
        Assert.assertEquals(newUserSignupTxt,Data.NEW_USER_SIGNUP_TEXT);
        System.out.println(newUserSignupTxt + " is showing");
        sleepTest(1500);

        aelp.signUpName.sendKeys(Data.SIGNUP_NAME);
        sleepTest(1500);

        aelp.signUpEmail.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(1500);

        aelp.signUpButton.click();
        sleepTest(1500);

        String emailAddressAlreadyExistTxt = tcruweep.emailAddressAlreadyExistText.getText();
        Assert.assertEquals(emailAddressAlreadyExistTxt,Data.EMAIL_ADDRESS_ALREADY_EXIST_TEXT);
        System.out.println(emailAddressAlreadyExistTxt);
        sleepTest(1500);

    }
}
