package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase22AddToCartFromRecommendedItemsPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase22AddToCartFromRecommendedItemsTc extends BaseClass{

    @Test
    public void TestCase22AddToCartFromRecommendedItemsTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase22AddToCartFromRecommendedItemsPage tcatcfrip = new TestCase22AddToCartFromRecommendedItemsPage(driver);

//        3. Scroll to bottom of page
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,7400)");
        sleepTest(2500);

//        4. Verify 'RECOMMENDED ITEMS' are visible
        String recommendedItemsTxt = tcatcfrip.recommendedItemsText.getText();
        Assert.assertEquals(recommendedItemsTxt, Data.RECOMMENDED_ITEMS_TEXT);
        sleepTest(1500);
        System.out.println();
        System.out.println(recommendedItemsTxt + " is displaying.");

//        5. Click on 'Add To Cart' on Recommended product
        tcatcfrip.stylishDressAddToCartButton.click();
        sleepTest(1500);

//        6. Click on 'View Cart' button
        aelp.viewCart.click();
        sleepTest(1500);

//        7. Verify that product is displayed in cart page
        if (tcatcfrip.stylishDressDisplayText.isDisplayed()) {
            String stylishDressDisplayTxt = tcatcfrip.stylishDressDisplayText.getText();
            Assert.assertEquals(stylishDressDisplayTxt, Data.STYLISH_DRESS_TEXT);
            sleepTest(1500);
            System.out.println();
            System.out.println(stylishDressDisplayTxt + " is showing.");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }
    }
}
