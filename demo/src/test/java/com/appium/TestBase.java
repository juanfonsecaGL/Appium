package com.appium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.appium.DriverSessionCreator.DriverType;

import io.appium.java_client.AppiumDriver;

public class TestBase {
    
    AppiumDriver appiumDriver;

    @BeforeMethod()
    public void setUp() throws Exception
    {
        appiumDriver = DriverSessionCreator.getDriver(DriverType.IOS);
    }

    @AfterMethod()
    public void tearDown() throws Exception{
        Thread.sleep(10000);
        appiumDriver.quit();
    }

}
