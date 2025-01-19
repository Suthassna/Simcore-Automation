package com.simcore.automation.pages.loanmanagemnet;

import com.simcore.automation.functions.BaseFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoanManagementPageBase extends BaseFunction {
    private WebDriverWait wait;

    private final By loanManagement = By.linkText("Loan Management");
    private final By loanCreate = By.xpath("//*[@id=\"navigationDetailsContainer\"]/div[1]/div[2]/div/div[2]/a");

    public LoanManagementPageBase(WebDriver driver) {
        super(driver);
    }

    public void selectLoanManagement(){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Loan Management"))); // Wait for element
        driver.findElement(loanManagement).click();
    }

    public void selectLoanCreate(){

        driver.findElement(loanCreate).click();
    }
}
