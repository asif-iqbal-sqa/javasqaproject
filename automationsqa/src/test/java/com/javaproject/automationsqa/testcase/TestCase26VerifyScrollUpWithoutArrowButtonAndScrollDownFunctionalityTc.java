package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityTc extends BaseClass{

    @Test
    public void TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPage tcvsuwabasdfp = new TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPage(driver);

//        3. Verify that home page is visible successfully
        if (aelp.homeSlider.isDisplayed()){
            System.out.println("you are at homepage");
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

//        4. Scroll down page to bottom
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,8000)");
        sleepTest(2500);

//        5. Verify 'SUBSCRIPTION' is visible
        if (aelp.subscriptionText.isDisplayed()) {
            System.out.println(aelp.subscriptionText);
            sleepTest(1500);
        }

//        6. Scroll up page to top
        JavascriptExecutor jseUp = (JavascriptExecutor) driver;
        jseUp.executeScript("window.scrollBy(0,-8000)");
        sleepTest(2500);

//        7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        if (aelp.sliderText.isDisplayed()){
            String sliderTxt = aelp.sliderText.getText();
            Assert.assertEquals(sliderTxt,Data.SLIDER_TEXT);
            System.out.println();
            System.out.println(sliderTxt);
            System.out.println();
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

    }

}