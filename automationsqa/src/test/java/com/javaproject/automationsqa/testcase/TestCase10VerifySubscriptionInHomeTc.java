package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase10VerifySubscriptionInHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestCase10VerifySubscriptionInHomeTc extends BaseClass{

    @Test
    public void testCase10VerifySubscriptionInHomeTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase10VerifySubscriptionInHomePage tcvsihp = new TestCase10VerifySubscriptionInHomePage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)");
        sleepTest(2000);

    }

}