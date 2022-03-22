package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase2LogInWithCorrectEmailPage extends BasePage{
    public TestCase2LogInWithCorrectEmailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//h2[.='Login to your account']" )
    public WebElement loginToYourAccountText;

    public WebElement getLoginToYourAccountText() {
        return loginToYourAccountText;
    }

    @FindBy ( xpath = "/html//section[@id='form']//form[@action='/login']/input[@name='email']" )
    public WebElement emailAddress;

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    @FindBy ( xpath = "/html//section[@id='form']//form[@action='/login']/input[@name='password']" )
    public WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy ( xpath = "/html//section[@id='form']//form[@action='/login']/button[@type='submit']" )
    public WebElement logInButton;

    public WebElement getLogInButton() {
        return logInButton;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[9]/a" )
    public WebElement loggedInAs;

    public WebElement getLoggedInAs() {
        return loggedInAs;
    }
}