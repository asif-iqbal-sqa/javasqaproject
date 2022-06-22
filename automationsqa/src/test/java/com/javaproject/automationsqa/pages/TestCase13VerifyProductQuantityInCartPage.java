package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase13VerifyProductQuantityInCartPage extends BasePage{
    public TestCase13VerifyProductQuantityInCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "//div[@id='slider-carousel']/div[@class='carousel-inner']" )
    public WebElement slider;

    public WebElement getSlider() {
        return slider;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='features_items']/div[2]/div[@class='product-image-wrapper']/div[@class='choose']/ul//a[@href='/product_details/1']" )
    public WebElement viewProduct;

    public WebElement getViewProduct() {
        return viewProduct;
    }

    @FindBy ( xpath = "/html//input[@id='quantity']" )
    public WebElement productQuantityInputBox;

    public WebElement getProductQuantityInputBox() {
        return productQuantityInputBox;
    }

    @FindBy ( xpath = "/html/body/section/div[@class='container']/div[@class='row']//button[@type='button']" )
    public WebElement addToCartButton;

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    @FindBy ( xpath = "/html//div[@id='cartModal']//a[@href='/view_cart']/u[.='View Cart']" )
    public WebElement viewCartButton;

    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    @FindBy ( xpath = "//tr[@id='product-1']//button[@class='disabled']" )
    public WebElement quantityDisplay;

    public WebElement getQuantityDisplay() {
        return quantityDisplay;
    }
}
