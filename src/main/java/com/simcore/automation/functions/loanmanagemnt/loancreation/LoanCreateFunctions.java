package com.simcore.automation.functions.loanmanagemnt.loancreation;

import com.simcore.automation.pages.loanmanagemnet.loancreation.LoanCreatePage;
import com.simcore.automation.testbase.TestBase;

public class LoanCreateFunctions extends TestBase {


    private static final LoanCreatePage loanCreatePage = new LoanCreatePage(driver);

    public static void typeOnCustomerNumber(String value){
        loanCreatePage.typeOnCustomerNumber(value);
    }



}
