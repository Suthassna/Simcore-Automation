package com.simcore.automation.pages.navigations;

public enum PG_EOD {
    lo_eod("//*[@id=\"106\"]/span[2]");
    private final String locator;


    PG_EOD(String locator) {
        this.locator = locator;
    }

    @Override
    public String toString() {
        return locator;
    }
}
