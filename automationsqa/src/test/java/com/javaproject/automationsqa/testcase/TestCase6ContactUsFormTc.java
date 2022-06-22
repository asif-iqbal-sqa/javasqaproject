package com.javaproject.automationsqa.testcase;

import com.javaproject.automationsqa.pages.AutomationExerciseLandingPage;
import com.javaproject.automationsqa.pages.TestCase6ContactUsFormPage;
import com.javaproject.automationsqa.utility.Data;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6ContactUsFormTc extends BaseClass{

    @Test
    public void testCase6ContactUsFormTc (){

        AutomationExerciseLandingPage aelp = new AutomationExerciseLandingPage(driver);
        TestCase6ContactUsFormPage tccufp = new TestCase6ContactUsFormPage(driver);

        aelp.contactUsButton.click();

        String contctUsUrl = driver.getCurrentUrl();
        Assert.assertEquals(contctUsUrl, Data.CONTACT_US_URL);
        sleepTest(1500);
        System.out.println(contctUsUrl + " url matched");

        String contctUsTxt = tccufp.contactUsGetInTouchText.getText();
        Assert.assertEquals(contctUsTxt, Data.CONTACT_US_TEXT);
        sleepTest(1500);
        System.out.println(contctUsTxt + " text is available");

        tccufp.contactUsName.sendKeys(Data.CONTACT_US_NAME);
        tccufp.contactUsEmail.sendKeys(Data.CONTACT_US_EMAIL);
        tccufp.contactUsSubject.sendKeys(Data.CONTACT_US_SUBJECT);
        tccufp.contactUsMessage.sendKeys(Data.CONTACT_US_MESSAGE);
        sleepTest(1500);

        tccufp.contactUsChooseFile.sendKeys("C:\\Users\\User\\Desktop\\jd.pdf");
        sleepTest(1500);

        tccufp.contactUsSubmit.click();
        sleepTest(1500);

        Alert alertBox = driver.switchTo().alert();
        System.out.println(alertBox.getText());
        sleepTest(1500);

        alertBox.accept();
        sleepTest(1500);

        String successTxt = tccufp.successText.getText();
        Assert.assertEquals(successTxt, Data.CONTACT_US_SUCCESS_MESSAGE);
        sleepTest(1500);
        System.out.println(successTxt + " is showing.");

        tccufp.homeButton.click();
        sleepTest(1500);

        String featuresItemsTxt = tccufp.featuresItems.getText();
        Assert.assertEquals(featuresItemsTxt, Data.FEATURES_ITEMS_TEXT);
        sleepTest(1500);
        System.out.println("You are at HOME page.");

    }

}
