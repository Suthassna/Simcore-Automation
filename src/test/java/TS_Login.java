import com.simcore.automation.functions.login.LoginFunction;
import com.simcore.automation.testbase.TestBase;
import org.testng.annotations.Test;

public class TS_Login extends TestBase {

    @Test
    public void tc_ValidLogin() {
        String url = getURL();
        navigateToURL(url);
        LoginFunction.getInstance().login("Buddhini1", "abc@1234");

}
}
