package com.setup;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class BaseSetup {

      
        public AppiumDriver<MobileElement> driver=null;

        protected String appiumPort="4723";
        protected String serverIp="0.0.0.0";

        @BeforeClass
        public void setup(){
            initDriver();
        }

        public AppiumDriver<MobileElement> getDriver() {
            return driver;
        }

        public void initDriver(){
            System.out.println("Inside initDriver method");

            DesiredCapabilities cap = new DesiredCapabilities();
         
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
            cap.setCapability(MobileCapabilityType.ACCEPT_INSECURE_CERTS,true);
            
         // cap.setCapability(MobileCapabilityType.APP, "c://apks//listviewsample.apk");
          //cap.setCapability("appPackage", "com.miui.home");
  		//cap.setCapability("appActivity", "com.miui.home.launcher.Launcher");
            cap.setCapability("appPackage", "com.android.vending");
         // This package name of your app (you can get it from apk info app)
 cap.setCapability("appActivity","com.android.vending.AssetBrowserActivity");
         	//cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "your.package.name.*");
     	//cap.setCapability("autoGrantPermissions", true);
     //   cap.setCapability("appWaitPackage", "com.android.packageinstaller");
       //  	cap.setCapability("appWaitActivity", ".permission.ui.GrantPermissionsActivity");

//cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, “.permission.ui.GrantPermissionsActivity”);
  		//cap.setCapability("noReset", true);
            String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";


            try
            {
                System.out.println("Argument to driver object : " + serverUrl);
                driver = new AndroidDriver<MobileElement>(new URL(serverUrl), cap);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            }
            catch (NullPointerException | MalformedURLException ex) {
                throw new RuntimeException("appium driver could not be initialised for device ");
            }
            System.out.println("Driver in initdriver is : "+driver);

        }

        @AfterClass
        public void tearDown(){
        	driver.quit();
        	
        }

    }