package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase18ViewCategoryProductsPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase18ViewCategoryProductsTc extends BaseClass{

    @Test
    public void TestCase18ViewCategoryProductsTc () {

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase18ViewCategoryProductsPage tcvcpp = new TestCase18ViewCategoryProductsPage(driver);

        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy (0,700)");

//        3. Verify that categories are visible on left side bar
        if (tcvcpp.categoryText.isDisplayed()) {
            String categoryTxt = tcvcpp.categoryText.getText();
            Assert.assertEquals(categoryTxt, Data.CATEGORY_TEXT);
            System.out.println("\n"+categoryTxt+"\n");
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

//        4. Click on 'Women' category
        tcvcpp.womenCategory.click();
        sleepTest(1500);

//        5. Click on any category link under 'Women' category, for example: Dress
        tcvcpp.womenCategorySubCategoryTops.click();
        sleepTest(1500);

//        6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'

        if (tcvcpp.womenTopsProductsText.isDisplayed()){
            String womenTopsProductsTxt = tcvcpp.womenTopsProductsText.getText();
            Assert.assertEquals(womenTopsProductsTxt, Data.WOMEN_TOPS_PRODUCTS_TEXT);
            System.out.println(womenTopsProductsTxt+"\n");
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

//        7. On left side bar, click on any sub-category link of 'Men' category

        tcvcpp.menCategory.click();
        sleepTest(1500);

//        8. Verify that user is navigated to that category page
        tcvcpp.menCategorySubCategoryJeans.click();
        sleepTest(1500);

        if (tcvcpp.menJeansProductsText.isDisplayed()){
            String menJeansProductsTxt = tcvcpp.menJeansProductsText.getText();
            Assert.assertEquals(menJeansProductsTxt, Data.MEN_JEANS_PRODUCTS_TEXT);
            System.out.println(menJeansProductsTxt+"\n");
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

    }
}
