package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase7VerifyTestCasesPage extends BasePage{
    public TestCase7VerifyTestCasesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//b[.='Test Cases']" )
    public WebElement testCasesText;

    public WebElement getTestCasesText() {
        return testCasesText;
    }
}