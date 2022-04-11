package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase2LogInWithCorrectEmailPage extends BasePage{
    public TestCase2LogInWithCorrectEmailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[9]/a" )
    public WebElement loggedInAs;

    public WebElement getLoggedInAs() {
        return loggedInAs;
    }
}