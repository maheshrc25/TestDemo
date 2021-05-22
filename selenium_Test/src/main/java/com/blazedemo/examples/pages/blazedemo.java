package com.blazedemo.examples.pages;

import org.openqa.selenium.WebDriver;

public class blazedemo {

    private static ThreadLocal<HomePage> LoginPage = new ThreadLocal<>();

    public blazedemo(WebDriver driver) {
        LoginPage.set(new HomePage(driver));
    }

    public HomePage getSitePage() {
        return this.LoginPage.get();
    }
}
