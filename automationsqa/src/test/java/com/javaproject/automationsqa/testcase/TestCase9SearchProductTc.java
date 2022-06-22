package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase8VerifyAllProductsAndProductDetailPage;
import com.javaproject.automationsqa.pages.TestCase9SearchProductPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase9SearchProductTc extends BaseClass{

    @Test
    public void testCase9SearchProductTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase9SearchProductPage tcspp = new  TestCase9SearchProductPage (driver);

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

        tcspp.searchBox.sendKeys(Data.SEARCH_TEXT);
        sleepTest(1500);

        tcspp.searchButton.click();
        sleepTest(1500);

        String searchProductsTxt = tcspp.searchProductsText.getText();
        Assert.assertTrue(true,Data.SEARCH_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(searchProductsTxt+" is showing");

        String productNameTxt = tcspp.productNameText.getText();
        Assert.assertTrue(true, Data.PRODUCT_NAME_TEXT);
        sleepTest(1500);
        System.out.println(productNameTxt + " is showing");

    }
}
