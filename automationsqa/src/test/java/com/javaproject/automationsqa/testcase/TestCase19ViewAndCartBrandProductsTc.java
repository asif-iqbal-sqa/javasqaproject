package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase19ViewAndCartBrandProductsPage;
import com.javaproject.automationsqa.utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase19ViewAndCartBrandProductsTc extends BaseClass{

    @Test
    public void testCase19ViewAndCartBrandProductsTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase19ViewAndCartBrandProductsPage tcvacbpp = new TestCase19ViewAndCartBrandProductsPage(driver);

        String homePageUrl = driver.getCurrentUrl();
        Assert.assertEquals(homePageUrl, Data.BASE_URL);
        sleepTest(2500);
        System.out.println(homePageUrl + "\n");
        System.out.println("You are at home page.");

        tcvacbpp.productsButton.click();
        sleepTest(2500);

//        5. Click on any brand name
        tcvacbpp.poloBrandButton.click();
        sleepTest(1500);

//        6. Verify that user is navigated to brand page and brand products are displayed
        String poloProductsPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(poloProductsPageUrl, Data.POLO_BRAND_PAGE_URL);
        sleepTest(1500);
        System.out.println(poloProductsPageUrl + "\n");

        String poloProductsTxt = tcvacbpp.poloBrandProductsText.getText();
        Assert.assertEquals(poloProductsTxt, Data.POLO_BRAND_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(poloProductsTxt + "\n");
        System.out.println("You are watching " + poloProductsTxt + "\n");

//        7. On left side bar, click on any other brand link
        tcvacbpp.madameBrandButton.click();
        sleepTest(1500);

//        8. Verify that user is navigated to that brand page and can see products
        String madameProductsPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(madameProductsPageUrl, Data.MADAME_BRAND_PAGE_URL);
        sleepTest(1500);
        System.out.println(madameProductsPageUrl + "\n");

        String madameProductsTxt = tcvacbpp.madameBrandsProductsText.getText();
        Assert.assertEquals(madameProductsTxt, Data.MADAME_BRAND_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(madameProductsTxt + "\n");
        System.out.println("You are watching " + madameProductsTxt + "\n");
    }
}
