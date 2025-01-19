package com.simcore.automation.functions.eodprocess;

import com.simcore.automation.pages.navigations.PG_EOD;
import com.simcore.automation.testbase.TestBase;

public class EODFunction extends TestBase {

    private static EODFunction instance;
    private EODFunction() {
    }
    public static EODFunction getInstance() {
        if (instance == null) {
            synchronized(EODFunction.class){
                if (instance == null){
                    instance = new EODFunction();
                }

            }

        }
        return instance;
    }

//    public void EOD(){
//        navigate(PG_EOD.lo_eod);
//
//    }


}
