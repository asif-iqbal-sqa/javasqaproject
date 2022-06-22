package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage extends BasePage{
    public TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//a[@id='scrollUp']" )
    public WebElement scrollUpButton;

    public WebElement getScrollUpButton() {
        return scrollUpButton;
    }
}
