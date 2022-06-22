package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase8VerifyAllProductsAndProductDetailPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase8VerifyAllProductsAndProductDetailTc extends BaseClass{

    @Test
    public void testCase8VerifyAllProductsAndProductDetailTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase8VerifyAllProductsAndProductDetailPage tcvapapdp = new  TestCase8VerifyAllProductsAndProductDetailPage (driver);

        aelp.productsButton.click();
        sleepTest(1500);

        String productsPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(productsPageUrl, Data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println("Product Page URL Matched");

        String productsTxt = aelp.productsButton.getText();
        Assert.assertTrue(true, Data.PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(productsTxt + " is showing.");

        tcvapapdp.viewProductFirst.click();
        sleepTest(1500);

        String productNameTxt = tcvapapdp.productName.getText();
        Assert.assertTrue(true, Data.PRODUCT_NAME_TEXT);
        sleepTest(1500);
        System.out.println(productNameTxt + " is showing.");

        String productCategoryTxt = tcvapapdp.productCategory.getText();
        Assert.assertTrue(true, Data.PRODUCT_CATEGORY_TEXT);
        sleepTest(1500);
        System.out.println(productCategoryTxt + " is showing.");

        String productPriceTxt = tcvapapdp.productPrice.getText();
        Assert.assertTrue(true, Data.PRODUCT_PRICE_TEXT);
        sleepTest(1500);
        System.out.println(productPriceTxt + " is showing.");

        String productAvailabilityTxt = tcvapapdp.productAvailability.getText();
        Assert.assertTrue(true, Data.PRODUCT_AVAILABILITY_TEXT);
        sleepTest(1500);
        System.out.println(productAvailabilityTxt + " is showing.");

        String productConditionTxt = tcvapapdp.productCondition.getText();
        Assert.assertTrue(true, Data.PRODUCT_CONDITION_TEXT);
        sleepTest(1500);
        System.out.println(productConditionTxt + " is showing.");

        String productBrandTxt = tcvapapdp.productBrand.getText();
        Assert.assertTrue(true, Data.PRODUCT_BRAND_TEXT);
        sleepTest(1500);
        System.out.println(productBrandTxt + " is showing.");

    }
}