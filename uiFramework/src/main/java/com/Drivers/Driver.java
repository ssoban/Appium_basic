package com.Drivers;

import com.setup.BaseSetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;




public class Driver extends BaseSetup{

   // protected AndroidDriver driver;
	AppiumDriver<MobileElement> driver;
    public Driver() {
        this.driver = (AppiumDriver<MobileElement>) super.getDriver();
    }
}