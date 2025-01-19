package loanmanagement.loancreation;

import com.simcore.automation.functions.loanmanagemnt.loancreation.LoanCreateFunctions;
import org.testng.annotations.Test;

public class TS_LoanCreate {

    @Test
    public void createLoan(){
        LoanCreateFunctions.typeOnCustomerNumber("value");
    }
}
