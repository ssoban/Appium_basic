package com.uiFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.setup.BaseSetup;
import com.uiFramework.Googleplay;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;


import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;


public class TC_01_Google_play_settings extends BaseSetup {
	
	Googleplay oogleplay;
	
	//@Test(priority=1)
	public void testGooglePlayApp() throws InterruptedException {
		
		((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));
	
		oogleplay = new Googleplay((AndroidDriver<MobileElement>) driver);
		
		oogleplay.naviigationmenu();
		oogleplay.scrolling();
		oogleplay.playprotectscreen();
		
		
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	
@Test(priority=2)
	
	public void install_app() throws InterruptedException
	{
	 for(int i=0;i<=14;i++)   
	 {
		 String appnames[]={"Instagram" , "Skype", "LINE: Free Calls & Messages", "Times Of India", "Gaana Music" ,"Uber","Flipart","WhatsApp Messenger","Facebook", "Amazon Shopping","Clean master","My Talking Tom","Wego Flights & Hotels","MiFit" , "hangout"};
	
	try {
		Thread.sleep(1000);
		
		MobileElement appTitlsearchbox = (MobileElement) driver.findElementById("com.android.vending:id/search_box_idle_text"); 
	
		
		if(appTitlsearchbox.isDisplayed())
	         
        {
		appTitlsearchbox.click();
        }
	else{
		MobileElement appTitlsearchbox1 = (MobileElement) driver.findElementById("com.android.vending:id/text_container"); 
		appTitlsearchbox1.click();
	}
      
	} 
	catch (NoSuchElementException e2) {
	System.out.println("Unable to find  idle search box");
	//((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));
	}
	
			 
			// 
	try {
			
				 MobileElement cross = (MobileElement)driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.android.vending:id/action_button' and @content-desc='Clear']");
				cross.click();
			} catch (NoSuchElementException e1) {
				System.out.println("no cross");
			}
		
	 try {
		MobileElement editText = (MobileElement) driver.findElementById("com.android.vending:id/search_box_text_input");
		  
		    
		    
		   
		    editText.sendKeys(appnames[i]);
		    ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		    
		    Thread.sleep(2000);
		    
		   // AppiumDriver.pressKeyCode(AndroidKeyCode.SPACE, AndroidKeyMetastate.META_SHIFT_ON);
			  /*pressKey(new KeyEvent(AndroidKey.ENTER)
		              .withFlag(KeyEventFlag.SOFT_KEYBOARD)
		              .withFlag(KeyEventFlag.KEEP_TOUCH_MODE)
		              .withFlag(KeyEventFlag.EDITOR_ACTION));*/
	} catch (NoSuchElementException e3) {
		// TODO Auto-generated catch block
	System.out.println("Unable to press ");
	}




	   // MobileElement suggestedapp = (MobileElement) driver.findElementById("com.android.vending:id/title");
	   // suggestedapp.click();
	   
	
	  try {
		  
		MobileElement appfetched= (MobileElement)driver.findElement(By.xpath("//android.widget.Button[@text='INSTALL']"));
		    if(appfetched.isDisplayed())
		    {
		    	appfetched.click();
		    	Thread.sleep(2000);
		    System.out.println(appnames[i]+" App is going to be  installed");}
		    
		   
		    
	} catch (NoSuchElementException e) {
		System.out.println(appnames[i]+" App is already installed");
	}
	  driver.navigate().back();
	 }
	
	 
}


/*private void pressKey(KeyEvent withFlag) {
	// TODO Auto-generated method stub
	
}
*/


}

	
	

 


