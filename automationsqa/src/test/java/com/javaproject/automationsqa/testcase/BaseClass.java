package com.javaproject.automationsqa.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void beforeClass(){

//        String baseDir = System.getProperty("user.dir");
//        String chromeDir = baseDir + "/browser/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDir);

        //String firefoxDir = baseDir + "/browser/geckodriver";
        //System.setProperty("webdriver.gecko.driver", firefoxDir);


//        ChromeOptions chromeOptions = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(chromeOptions);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

//        https://www.toolsqa.com/selenium-webdriver/webdrivermanager/
//        A specific browser version? =>
//        ChromeOptions chromeOptions = new ChromeOptions ();
//        WebDriverManager.chromedriver().driverVersion("97.0.4692.71").setup();
//        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to("https://www.automationexercise.com/");
        sleepTest(2000);
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("Method is passing");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    public static void sleepTest(long sleeptime){
        try{Thread.sleep(sleeptime);
        }catch (Exception e){

        }
    }
}