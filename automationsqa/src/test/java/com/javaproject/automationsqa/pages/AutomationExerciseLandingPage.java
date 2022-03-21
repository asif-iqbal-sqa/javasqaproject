package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExerciseLandingPage extends BasePage{
    public AutomationExerciseLandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/login']")
    public WebElement signUpLogIn;
    public WebElement getSignUpLogIn() {
        return signUpLogIn;
    }
}