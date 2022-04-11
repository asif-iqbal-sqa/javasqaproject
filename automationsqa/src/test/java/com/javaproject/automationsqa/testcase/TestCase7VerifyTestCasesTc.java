package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase7VerifyTestCasesPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7VerifyTestCasesTc extends BaseClass{

    @Test
    public void testCase7VerifyTestCases () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase7VerifyTestCasesPage tcvtcp = new TestCase7VerifyTestCasesPage(driver);

        aelp.testCases.click();
        sleepTest(1500);

        String testCaseUrl = driver.getCurrentUrl();
        Assert.assertEquals(testCaseUrl,Data.TEST_CASES_URL);
        sleepTest(1500);
        System.out.println("URL Matched");

        String testCaseTxt = tcvtcp.testCasesText.getText();
        Assert.assertEquals(testCaseTxt, Data.TEST_CASES_TEXT);
        sleepTest(1500);
        System.out.println(testCaseTxt + " is showing.");

    }
}
