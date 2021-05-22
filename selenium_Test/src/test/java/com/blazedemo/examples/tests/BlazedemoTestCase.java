package com.blazedemo.examples.tests;

import java.util.logging.Logger;

import com.blazedemo.examples.drivers.ThreadLocalDriver;
import com.blazedemo.examples.pages.blazedemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class BlazedemoTestCase {

    protected ThreadLocalDriver threadLocalDriver;
    protected Logger logger = Logger.getGlobal();

    // Define Page object for site88 web host.
    protected blazedemo loginPage;

    // Define timeout before closing browser after test.
    protected final int BROWSER_WAIT_MILLISECONDS = 4000;

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// TestNG Methods //////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////

    @BeforeMethod
    void setTestConfiguration() {
        logger.info("Setting up blazedemoTests..");
        threadLocalDriver = new ThreadLocalDriver();
        loginPage = new blazedemo(getDriver());
    }

    @AfterMethod
    void closeBrowser() {
        logger.info("Tearing down blazedemoTests..");
        getDriver().quit();
    }

    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////// Generic Methods /////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////

    protected void waitBeforeClosingBrowser() throws InterruptedException {
        Thread.sleep(BROWSER_WAIT_MILLISECONDS);
    }

    protected WebDriver getDriver() {
        return threadLocalDriver.getDriver();
    }
}
