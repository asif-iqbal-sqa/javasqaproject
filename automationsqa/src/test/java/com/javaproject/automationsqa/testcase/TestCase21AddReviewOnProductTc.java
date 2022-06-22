package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase21AddReviewOnProductPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase21AddReviewOnProductTc extends BaseClass{

    @Test
    public void TestCase21AddReviewOnProductTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase21AddReviewOnProductPage tcaropp = new TestCase21AddReviewOnProductPage (driver);

//        3. Click on 'Products' button
        aelp.productsButton.click();
        sleepTest(1500);

//        4. Verify user is navigated to ALL PRODUCTS page successfully
        String allProductsTxt = tcaropp.allProductsText.getText();
        Assert.assertEquals(allProductsTxt, Data.ALL_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println();
        System.out.println(allProductsTxt + " is displaying");
        System.out.println();

//        5. Click on 'View Product' button
        aelp.viewProduct.click();
        sleepTest(1500);

//        6. Verify 'Write Your Review' is visible
        String writeYourReviewTxt = tcaropp.writeYourReviewText.getText();
        Assert.assertEquals(writeYourReviewTxt, Data.WRITE_YOUR_REVIEW_TEXT);
        sleepTest(1500);
        System.out.println();
        System.out.println(writeYourReviewTxt + " is displaying");
        System.out.println();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,5000)");
        sleepTest(5000);

//        7. Enter name, email and review
        tcaropp.writeYourReviewTextNameInput.sendKeys(Data.WRITE_YOUR_REVIEW_TEXT_NAME_INPUT);
        sleepTest(1500);

        if (tcaropp.writeYourReviewTextEmailAddressInput.isDisplayed()) {
            tcaropp.writeYourReviewTextEmailAddressInput.sendKeys(Data.WRITE_YOUR_REVIEW_TEXT_WRONG_EMAIL_ADDRESS_INPUT);
            sleepTest(2500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        tcaropp.writeYourReviewTextInput.sendKeys(Data.WRITE_YOUR_REVIEW_TEXT_INPUT);
        sleepTest(1500);

        tcaropp.writeYourReviewTextSubmit.click();
        sleepTest(1500);



        tcaropp.writeYourReviewTextNameInput.clear();
        sleepTest(2500);
        tcaropp.writeYourReviewTextNameInput.sendKeys(Data.WRITE_YOUR_REVIEW_TEXT_NAME_INPUT);
        sleepTest(1500);

        if (tcaropp.writeYourReviewTextEmailAddressInput.isDisplayed()) {
            tcaropp.writeYourReviewTextEmailAddressInput.clear();
            sleepTest(2500);
            tcaropp.writeYourReviewTextEmailAddressInput.sendKeys(Data.WRITE_YOUR_REVIEW_TEXT_EMAIL_ADDRESS_INPUT);
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        tcaropp.writeYourReviewTextInput.clear();
        sleepTest(2500);
        tcaropp.writeYourReviewTextInput.sendKeys(Data.WRITE_YOUR_REVIEW_TEXT_INPUT);
        sleepTest(1500);

//        8. Click 'Submit' button
        tcaropp.writeYourReviewTextSubmit.click();
        sleepTest(1500);

//        9. Verify success message 'Thank you for your review.'
//        AS ALERT IS DISAPPEARING FAST, AVOID THIS.

    }
}
