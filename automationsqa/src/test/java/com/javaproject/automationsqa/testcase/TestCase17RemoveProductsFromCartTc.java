package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase17RemoveProductsFromCartPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase17RemoveProductsFromCartTc extends BaseClass{

    @Test
    public void TestCase17RemoveProductsFromCartTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase17RemoveProductsFromCartPage tcrpfcp = new TestCase17RemoveProductsFromCartPage(driver);

//        3. Verify that home page is visible successfully
        if (tcrpfcp.homePageSlider.isDisplayed()) {
            System.out.println("You are at home page.");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        if (tcrpfcp.homePageSlider.isDisplayed()) {
            String homePageUrl = driver.getCurrentUrl();
            Assert.assertEquals(homePageUrl, Data.BASE_URL);
            System.out.println(homePageUrl + " You are watching home page url. ");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy (0,1000)");

        tcrpfcp.viewProductButton.click();
        sleepTest(2500);

//        4. Add products to cart
        tcrpfcp.addToCartButton.click();
        sleepTest(1500);
        tcrpfcp.addToCartPageContinueShopping.click();
        sleepTest(1500);

//        5. Click 'Cart' button
        tcrpfcp.cartButton.click();
        sleepTest(1500);

//        6. Verify that cart page is displayed
        if (tcrpfcp.shoppingCartText.isDisplayed()) {
            System.out.println("You are at " + Data.SHOPPING_CART_PAGE_TEXT + " page");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        String shoppingCartPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(shoppingCartPageUrl,Data.SHOPPING_CART_PAGE_URL);
        System.out.println("As URL match, so you are at " + Data.SHOPPING_CART_PAGE_TEXT);
        sleepTest(1500);

//        7. Click 'X' button corresponding to particular product
        tcrpfcp.productRemoveButton.click();
        sleepTest(1500);

//        8. Verify that product is removed from the cart
        String  productRemovedTxt = tcrpfcp.productRemovedText.getText();
        Assert.assertEquals(productRemovedTxt, Data.PRODUCT_REMOVED_TEXT);
        System.out.println(productRemovedTxt);
        sleepTest(2500);

    }
}
