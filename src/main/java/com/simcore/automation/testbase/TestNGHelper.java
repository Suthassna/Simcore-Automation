package com.simcore.automation.testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TestNGHelper {
    public static WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

    @BeforeSuite
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void teardownDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
    @BeforeSuite
    public void beforeSuite(){

    }

    @BeforeTest
    public void beforeTest(){

    }

    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod
    public void beforeMethod(){

    }

    @AfterSuite
    public void afterSuite(){

    }

    @AfterTest
    public void afterTest(){

    }

    @AfterClass
    public void afterClass(){

    }

    @AfterMethod
    public void afterMethod(){
        browserFactory.quitDriver();
    }


}
