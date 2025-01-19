package com.simcore.automation.pages.navigations;

public enum PG_Login {
    tf_UserName("//*[@id=\"UserName\"]"),
    tf_Password("//*[@id=\"UserPassword\"]");


    private final String locator;

    PG_Login(String locator) {
        this.locator = locator;
    }

    @Override
    public String toString() {
        return locator;
    }
}

