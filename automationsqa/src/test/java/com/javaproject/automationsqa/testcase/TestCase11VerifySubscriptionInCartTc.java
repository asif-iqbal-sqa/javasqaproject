package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase11VerifySubscriptionInCartPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase11VerifySubscriptionInCartTc extends BaseClass{

    @Test
    public void testCase11VerifySubscriptionInCartTc () {

        AutomationExerciseLandingPage aelp = new  AutomationExerciseLandingPage (driver);
        TestCase11VerifySubscriptionInCartPage tcvsicp = new TestCase11VerifySubscriptionInCartPage(driver);

        aelp.cartButton.click();
        sleepTest(1500);

        String cartUrl = driver.getCurrentUrl();
        Assert.assertEquals(cartUrl, Data.CART_URL);
        sleepTest(1500);
        System.out.println("");
        System.out.println(cartUrl);
        System.out.println("");


        if ( tcvsicp.cartText.isDisplayed()  ){
            String cartTxt = tcvsicp.cartText.getText();
            Assert.assertEquals(cartTxt, Data.CART_TEXT);
            sleepTest(1500);
            System.out.println("");
            System.out.println(cartTxt + " is showing");
            System.out.println("");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        tcvsicp.cartEmailInputBox.sendKeys(Data.SUBSCRIPTION_US_EMAIL);
        sleepTest(2500);

        tcvsicp.cartEmailInputBoxSubmit.click();
        sleepTest(1500);

    }
}
