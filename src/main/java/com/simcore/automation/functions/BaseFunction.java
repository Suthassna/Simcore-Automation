package com.simcore.automation.functions;

import com.simcore.automation.pages.loanmanagemnet.loancreation.LoanCreatePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseFunction {
    protected WebDriver driver;



    public BaseFunction(WebDriver driver){
        this.driver=driver;

    }

    public LoanCreatePage initApp(){
        // Open the website

        driver.get("https://simpex-frontend-web-uat.azurewebsites.net");

        // Login
        WebElement username = driver.findElement(By.id("UserName"));
        WebElement password = driver.findElement(By.id("UserPassword"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));

        username.sendKeys("admin");
        password.sendKeys("snsQA@123");
        loginButton.click();

        return PageFactory.initElements(driver, LoanCreatePage.class);

    }

    public void type(By locator, String value){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    public void navigate(By locator){
        driver.findElement(locator).click();
    }




}

