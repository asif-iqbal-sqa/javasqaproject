package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase6ContactUsFormPage extends BasePage{
    public TestCase6ContactUsFormPage(WebDriver driver) {
        super(driver);
    }


    @FindBy ( xpath = "/html//div[@id='contact-page']/div[@class='bg']//h2[.='Get In Touch']" )
    public WebElement contactUsGetInTouchText;

    public WebElement getContactUsGetInTouchText() {
        return contactUsGetInTouchText;
    }

    @FindBy ( xpath = "//form[@id='contact-us-form']//input[@name='name']" )
    public WebElement contactUsName;

    public WebElement getContactUsName() {
        return contactUsName;
    }

    @FindBy ( xpath = "//form[@id='contact-us-form']//input[@name='email']" )
    public WebElement contactUsEmail;

    public WebElement getContactUsEmail() {
        return contactUsEmail;
    }

    @FindBy ( xpath = "//form[@id='contact-us-form']//input[@name='subject']" )
    public WebElement contactUsSubject;

    public WebElement getContactUsSubject() {
        return contactUsSubject;
    }

    @FindBy ( xpath = "/html//textarea[@id='message']" )
    public WebElement contactUsMessage;

    public WebElement getContactUsMessage() {
        return contactUsMessage;
    }

    @FindBy ( xpath = "//form[@id='contact-us-form']//input[@name='upload_file']" )
    public WebElement contactUsChooseFile;

    public WebElement getContactUsChooseFile() {
        return contactUsChooseFile;
    }

    @FindBy ( xpath = "//form[@id='contact-us-form']//input[@name='submit']" )
    public WebElement contactUsSubmit;

    public WebElement getContactUsSubmit() {
        return contactUsSubmit;
    }

    @FindBy ( xpath = "/html//div[@id='contact-page']/div[@class='bg']//div[.='Success! Your details have been submitted successfully.']" )
    public WebElement successText;

    public WebElement getSuccessText() {
        return successText;
    }

    @FindBy ( xpath = "//div[@id='form-section']/a[@href='/']" )
    public WebElement homeButton;

    public WebElement getHomeButton() {
        return homeButton;
    }

    @FindBy ( xpath = "/html/body/section[2]//h2[.='Features Items']" )
    public WebElement featuresItems;

    public WebElement getFeaturesItems() {
        return featuresItems;
    }
}
