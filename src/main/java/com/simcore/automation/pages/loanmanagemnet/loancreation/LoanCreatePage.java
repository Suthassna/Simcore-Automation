package com.simcore.automation.pages.loanmanagemnet.loancreation;

import com.simcore.automation.pages.loanmanagemnet.LoanManagementPageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoanCreatePage extends LoanManagementPageBase {
    private WebDriverWait wait;


    private final By customerNumber = By.id("txtCustomerNumber");
    private final By loanProduct = By.xpath("//*[@id=\"ddlProduct\"]");
    private final By loanAmount = By.xpath("//*[@id='txtFacilityAmount']");



    public LoanCreatePage(WebDriver driver) {
        super(driver);
    }


    public void typeOnCustomerNumber(String value){
        type(customerNumber, value);
        driver.findElement(customerNumber).sendKeys(Keys.ENTER);

    }

//    public void selectLoanProduct(String visibleText){
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ddlProduct\"]"))); // Wait for loanProduct element to be present
//        new Select(loanProduct).selectByVisibleText(visibleText);
//
//
//    }
//
//    public void typeLoanAmount(double value) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='txtFacilityAmount']")));
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].value='" + value + "';", loanAmount); // Set the field value directly
//        System.out.println("Successfully entered loan amount using JavaScript");
//    }
}
