package com.javaproject.automationsqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase20SearchProductsAndVerifyCartAfterLoginPage extends BasePage{
    public TestCase20SearchProductsAndVerifyCartAfterLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy ( xpath = "/html//input[@id='search_product']" )
    public WebElement searchBox;

    public WebElement getSearchBox() {
        return searchBox;
    }

    @FindBy ( xpath = "//button[@id='submit_search']/i[@class='fa fa-search']" )
    public WebElement searchIcon;

    public WebElement getSearchIcon() {
        return searchIcon;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='single-products']/div[2]" )
    public WebElement mouseHoverOverSleevelessDressName;

    public WebElement getMouseHoverOverSleevelessDressName() {
        return mouseHoverOverSleevelessDressName;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']//div[@class='single-products']/div[2]/div/p[.='Sleeveless Dress']" )
    public WebElement mouseHoverSleevelessDressName;

    public WebElement getMouseHoverSleevelessDressName() {
        return mouseHoverSleevelessDressName;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']//div[@class='single-products']/div[2]/div/p[.='Sleeveless Dress']" )
    public WebElement mouseHoverSleevelessDressText;

    public WebElement getMouseHoverSleevelessDressText() {
        return mouseHoverSleevelessDressText;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='choose']/ul//a[@href='/product_details/3']" )
    public WebElement viewProduct;

    public WebElement getViewProduct() {
        return viewProduct;
    }

    @FindBy ( xpath = "/html/body/section/div[@class='container']/div[@class='row']//button[@type='button']" )
    public WebElement addToCartButton;

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    @FindBy ( xpath = "/html//div[@id='cartModal']//button[.='Continue Shopping']" )
    public WebElement continueShopping;

    public WebElement getContinueShopping() {
        return continueShopping;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/view_cart']" )
    public WebElement cartButton;

    public WebElement getCartButton() {
        return cartButton;
    }

    @FindBy ( xpath = "/html//tr[@id='product-3']//a[@href='/product_details/3']" )
    public WebElement productVisibility;

    public WebElement getProductVisibility() {
        return productVisibility;
    }
}
