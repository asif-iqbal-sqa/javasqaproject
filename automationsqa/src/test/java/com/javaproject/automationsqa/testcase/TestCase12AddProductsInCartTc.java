package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase12AddProductsInCartPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase12AddProductsInCartTc extends BaseClass{

    @Test
    public void testCase12AddProductsInCart () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase12AddProductsInCartPage tcapicp = new TestCase12AddProductsInCartPage(driver);

        aelp.productsButton.click();

        String productsUrl = driver.getCurrentUrl();
        Assert.assertEquals(productsUrl, Data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println("Products URL Matched");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        sleepTest(5000);


//        https://stackoverflow.com/questions/35942196/how-to-mouse-hover-and-click-on-element-in-webdriver
//        Move the mouse to appear the HOAVER MENU
        Actions actions = new Actions(driver);
        actions.moveToElement(tcapicp.overProduct).perform();
        sleepTest(5000);

//        Move the mouse to appear the HOAVER MENU & then click the element on HOAVER MENU
        actions.moveToElement(tcapicp.addToCart);
        actions.click().build().perform();

        tcapicp.viewCart.click();
        sleepTest(1500);

        String viewCartUrl = driver.getCurrentUrl();
        Assert.assertEquals(viewCartUrl,Data.CART_URL);
        sleepTest(1500);
        System.out.println("View Cart Url Matched");
    }
}
