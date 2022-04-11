package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase3LogInWithInCorrectEmailPage extends BasePage{
    public TestCase3LogInWithInCorrectEmailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/p[.='Your email or password is incorrect!']")
    public WebElement incorrectMessage;

    public WebElement getIncorrectMessage() {
        return incorrectMessage;
    }
}
