package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase12AddProductsInCartPage extends BasePage{
    public TestCase12AddProductsInCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "/html//div[@id='accordian']//a[@href='#Kids']")
    public WebElement viewKids;

    public WebElement getViewKids() {
        return viewKids;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='features_items']/div[2]/div[@class='product-image-wrapper']/div[@class='single-products']/div[2]" )
    public WebElement overProduct;

    public WebElement getOverProduct() {
        return overProduct;
    }

    @FindBy (xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div/div[2]/div[@class='product-image-wrapper']/div[@class='single-products']/div[2]/div/a")
    public WebElement addToCart;

    public WebElement getAddToCart() {
        return addToCart;
    }

    @FindBy (xpath = "//u [text () = 'View Cart']")
    public WebElement viewCart;

    public WebElement getViewCart() {
        return viewCart;
    }

}
