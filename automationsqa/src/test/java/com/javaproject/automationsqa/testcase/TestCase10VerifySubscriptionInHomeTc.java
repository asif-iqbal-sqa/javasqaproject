package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase10VerifySubscriptionInHomePage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase10VerifySubscriptionInHomeTc extends BaseClass{

    @Test
    public void testCase10VerifySubscriptionInHomeTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase10VerifySubscriptionInHomePage tcvsihp = new TestCase10VerifySubscriptionInHomePage(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;



//        Scroll by PIXEL
//        js.executeScript("window.scrollBy(0,500)");
//        sleepTest(5000);

//        Scroll by Element Locator/XPATH
        //WebElement subscription = driver.findElement(By.xpath("//h2[text()='Subscription']"));
        js.executeScript("arguments[0].scrollIntoView(true);", tcvsihp.subscription);
        sleepTest(5000);

        tcvsihp.subscriptionEmailInputBox().sendKeys(Data.SUBSCRIPTION_US_EMAIL);
        sleepTest(1500);

        tcvsihp.arrowButton.click();
        sleepTest(1500);

//        String successAlertTxt = tcvsihp.successAlert.getText();
//        Assert.assertEquals(successAlertTxt,Data.SUCCESS_ALERT_TEXT);
//        sleepTest(1500);
//        System.out.println(successAlertTxt);

    }
}