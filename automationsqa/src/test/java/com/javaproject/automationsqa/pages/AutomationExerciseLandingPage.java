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

    @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//h2[.='Login to your account']" )
    public WebElement loginToYourAccountText;

    public WebElement getLoginToYourAccountText() {
        return loginToYourAccountText;
    }

    @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//h2[.='New User Signup!']" )
    public WebElement newUserSignupText;

    public WebElement getNewUserSignupText() {
        return newUserSignupText;
    }

    @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/input[@name='email']")
    public WebElement emailAddress;

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/input[@name='password']")
    public WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/button[@type='submit']")
    public WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }


    @FindBy (xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='name']")
    public WebElement signUpName;

    public WebElement getSignUpName() {
        return signUpName;
    }

    @FindBy (xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='email']")
    public WebElement signUpEmail;

    public WebElement getSignUpEmail() {
        return signUpEmail;
    }

    @FindBy (xpath = "/html//section[@id='form']//form[@action='/signup']/button[@type='submit']")
    public WebElement signUpButton;

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[7]" )
    public WebElement contactUsButton;

    public WebElement getContactUsButton() {
        return contactUsButton;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/test_cases']" )
    public WebElement testCases;

    public WebElement getTestCases() {
        return testCases;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/products']" )
    public WebElement productsButton;

    public WebElement getProductsButton() {
        return productsButton;
    }
}