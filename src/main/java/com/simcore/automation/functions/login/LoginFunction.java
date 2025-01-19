package com.simcore.automation.functions.login;

import com.simcore.automation.pages.navigations.PG_Login;
import com.simcore.automation.testbase.TestBase;

public class LoginFunction extends TestBase {

    private  static LoginFunction instance;
    private LoginFunction() {
    }

    public static LoginFunction getInstance() {
        if (instance == null) {
            synchronized(LoginFunction.class){
                if (instance == null){
                    instance = new LoginFunction();
                }

            }

        }
        return instance;
    }

    public void login(String uname, String pwd){
        type(PG_Login.tf_UserName, uname);
        type(PG_Login.tf_Password, pwd);


    }
}

