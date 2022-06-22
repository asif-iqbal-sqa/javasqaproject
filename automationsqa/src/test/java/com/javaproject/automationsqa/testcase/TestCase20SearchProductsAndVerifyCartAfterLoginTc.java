package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase20SearchProductsAndVerifyCartAfterLoginPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestCase20SearchProductsAndVerifyCartAfterLoginTc extends BaseClass{

    @Test
    public void testCase20SearchProductsAndVerifyCartAfterLoginTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase20SearchProductsAndVerifyCartAfterLoginPage tcspavcalp = new TestCase20SearchProductsAndVerifyCartAfterLoginPage(driver);

//        3. Click on 'Products' button
        aelp.productsButton.click();
        sleepTest(1500);

//        4. Verify user is navigated to ALL PRODUCTS page successfully
        String productPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(productPageUrl, Data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println(productPageUrl);

//        5. Enter product name in search input and click search button
        tcspavcalp.searchBox.sendKeys(Data.SEARCH_TEXT_ONE);
        sleepTest(2500);

        tcspavcalp.searchIcon.click();
        sleepTest(1500);

//        6. Verify 'SEARCHED PRODUCTS' is visible

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        sleepTest(5000);

//        WebElement mouseHoverOverSleevelessDressName = driver.findElement(By.xpath("/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='single-products']/div[2]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(mouseHoverOverSleevelessDressName);
//        sleepTest(5000);
//        System.out.println("MOUSE HOVER WORKED");

        // MOUSE HOVER
        // https://stackoverflow.com/questions/17293914/how-to-perform-mouseover-function-in-selenium-webdriver-using-java
        Actions builder = new Actions(driver);
//        WebElement element = tcspavcalp.mouseHoverOverSleevelessDressName;
//        WebElement element = driver.findElement(By.xpath("/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='single-products']/div[2]"));
        builder.moveToElement(tcspavcalp.mouseHoverOverSleevelessDressName).build().perform();
        sleepTest(5000);

        String sleevelessDressTxt = tcspavcalp.mouseHoverSleevelessDressText.getText();
        Assert.assertEquals(sleevelessDressTxt, Data.SEARCH_TEXT_ONE);
        System.out.println(sleevelessDressTxt);
        sleepTest(5000);
        System.out.println("MOUSE HOVER WORKED");

//        7. Verify all the products related to search are visible=> What happened if I search through "top"
//        Multiple tops are appearing & Should I verify them 1 by 1

//        8. Add those products to cart
        tcspavcalp.viewProduct.click();
        sleepTest(1500);

        tcspavcalp.addToCartButton.click();
        sleepTest(1500);

        tcspavcalp.continueShopping.click();
        sleepTest(1500);

//        9. Click 'Cart' button and verify that products are visible in cart
        tcspavcalp.cartButton.click();
        sleepTest(1500);

        String productVisibilityText = tcspavcalp.productVisibility.getText();
        Assert.assertEquals(productVisibilityText, Data.SEARCH_TEXT_ONE);
        sleepTest(1500);
        System.out.println(productVisibilityText + " is displaying.");

//        10. Click 'Signup / Login' button and submit login details
        aelp.signUpLogInButton.click();
        sleepTest(1500);

        aelp.loginEmailAddress.sendKeys(Data.LOGIN_EMAIL_ADDRESS_INPUT);
        sleepTest(1500);

        aelp.loginPassword.sendKeys(Data.LOGIN_PASSWORD_INPUT);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);

//        11. Again, go to Cart page
        aelp.homeCartButton.click();
        sleepTest(1500);

//        12. Verify that those products are visible in cart after login as well
        String productVisibilityText1 = tcspavcalp.productVisibility.getText();
        Assert.assertEquals(productVisibilityText1, Data.SEARCH_TEXT_ONE);
        sleepTest(1500);
        System.out.println(productVisibilityText1 + " is displaying.");
    }
}
