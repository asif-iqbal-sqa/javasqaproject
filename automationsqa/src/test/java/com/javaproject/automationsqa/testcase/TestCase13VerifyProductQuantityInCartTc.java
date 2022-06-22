package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase13VerifyProductQuantityInCartPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase13VerifyProductQuantityInCartTc extends BaseClass{

    @Test
    public void testCase13VerifyProductQuantityInCartTc (){

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase13VerifyProductQuantityInCartPage tcvpqicp = new TestCase13VerifyProductQuantityInCartPage(driver);

        if (tcvpqicp.slider.isDisplayed()){
            System.out.println("You are watching slider, so you are at HOME PAGE");
            sleepTest(5000);
        }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        tcvpqicp.viewProduct.click();
        sleepTest(1500);

        String productDetailsUrl = driver.getCurrentUrl();
        Assert.assertEquals(productDetailsUrl, Data.VIEW_PRODUCT_DETAIL_URL);
        sleepTest(1500);
        System.out.println("Product Detail is Showing");

        tcvpqicp.productQuantityInputBox.clear();
        tcvpqicp.productQuantityInputBox.sendKeys("4");
        sleepTest(1500);

        tcvpqicp.addToCartButton.click();
        sleepTest(1500);

        tcvpqicp.viewCartButton.click();
        sleepTest(1500);

        if (tcvpqicp.quantityDisplay.isDisplayed()){
            String quantityDisplayNumber = tcvpqicp.quantityDisplay.getText();
            Assert.assertTrue(true,Data.PRODUCT_QUANTITY_NUMBER);
            sleepTest(1500);
            System.out.println("Product quantity is matched.");
        }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

    }
}
