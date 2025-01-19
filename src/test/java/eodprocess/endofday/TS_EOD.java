package eodprocess.endofday;

import com.simcore.automation.functions.login.LoginFunction;
import org.testng.annotations.BeforeTest;

public class TS_EOD {

    @BeforeTest
    public void login() throws InterruptedException {
        LoginFunction.getInstance().login("Buddhini", "Test@1234");

    }
}