package com.uiFramework;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.setup.BaseSetup;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.StartsActivity;

public class TC_03_Set_Permisssion extends BaseSetup {

	@Test(priority=2)
	public void allowpermission() throws InterruptedException
	{
	((StartsActivity) driver).startActivity(new Activity("com.android.settings", ".MiuiSettings"));
	Thread.sleep(2000);
	 
	MobileElement scrollToText = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Installed apps\"));"));
	 scrollToText.click();
	 
	 Thread.sleep(2000);
	 
	 for(int i=0;i<=26;i++)   
	 {
		 String appnames[]={"Camera","Gallery","Music","Weather", "Gmail","Maps","YouTube","Drive","Google Play Music","Chrome","Photos","Instagram" , "Skype", "LINE", "TOI", "Gaana" ,"Uber","Flipkart","WhatsApp","Facebook", "Amazon Shopping","Clean master","My Talking Tom","Wego","MiFit" , "hangouts"};
	 MobileElement appsearchbox = (MobileElement) driver.findElementById("android:id/input"); 
	 appsearchbox.clear();
	 appsearchbox.sendKeys(appnames[i]);
	 Thread.sleep(2000);
	 
 List <MobileElement> searchresultlist = (List<MobileElement>) driver.findElementsByClassName("android.widget.TextView"); 
	 for (MobileElement element : searchresultlist) {
		 if (appnames[i].equalsIgnoreCase(element.getText())) {
		  element.click();
		   break;
		  }
		 }
	 Thread.sleep(2000);
	 MobileElement apppermission = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='com.miui.securitycenter:id/tv_title' and @text='App permissions']");
	 apppermission.click();
	 
	 List <MobileElement> togglebutton = (List<MobileElement>) driver.findElementsByClassName("android.widget.Switch"); 
	 for (MobileElement element : togglebutton) {
		 if (element.getAttribute("text").equals("OFF")) {
		  element.click();
		  
		  }
		 }
	 Thread.sleep(2000);
	 MobileElement navigateback = (MobileElement)driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']");
	 navigateback.click();
	 MobileElement navigateback1 = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='com.miui.securitycenter:id/app_manager_details_back' and @content-desc='Back']");
	 navigateback1.click();
	 MobileElement navigateback2 = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='miui:id/search_btn_cancel' and @content-desc='Back']");
	 navigateback2.click();
	 
	 }
	}
	
	@Test(priority=1)
	public void update_setting() throws InterruptedException{
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", ".MiuiSettings"));
		
		MobileElement aboutphone = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/title' and @text='About phone']");
		aboutphone.click();
		Thread.sleep(2000);
		MobileElement systemupdate = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/title' and @text='System update']");
		Thread.sleep(2000);
		systemupdate.click();
		
		//android:id/button2 android.widget.Button No
MobileElement more = (MobileElement)driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.android.updater:id/more_btn']");
Thread.sleep(2000);
		more.click();
		Thread.sleep(2000);
		//com.android.updater:id/more_btn  android.widget.ImageView
		 List <MobileElement> updatesettings = (List<MobileElement>) driver.findElementsById("android:id/text1"); 
		 Thread.sleep(2000);
		 for (MobileElement element : updatesettings) {
			 if (element.getAttribute("text").equals("Auto updates")) {
				 Thread.sleep(2000);
			  element.click();
			  break;
			  }
			 }

List <MobileElement> checkboxoff = (List<MobileElement>)driver.findElementsByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox' and @checked ='true']");
if(checkboxoff.size()>0){
	Thread.sleep(2000);
	for (MobileElement element1 : checkboxoff) {
		 if (element1.getAttribute("checked").equals("true")) {
			 Thread.sleep(2000);
		  element1.click();
		  
		  }
		 }
}
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	}
	
	@Test(priority=3)
	public void update_system_app_setting() throws InterruptedException{
		
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", ".MiuiSettings"));
		MobileElement systemupdater1 = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/title' and @text='System apps updater']");
		systemupdater1.click();
		Thread.sleep(2000);
		MobileElement settingicon = (MobileElement)driver.findElementByXPath("//android.widget.ImageView[@resource-id='android:id/input']");
		Thread.sleep(2000);
		settingicon.click();
		
		Thread.sleep(2000);
		MobileElement systemupdater2 = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/title' and @text='Auto updates']");
		Thread.sleep(2000);
		systemupdater2.click();
		
	
		
		List <MobileElement> dontupdate1 = (List<MobileElement>) driver.findElementsByXPath("//android.widget.CheckedTextView[@resource-id='android:id/text1']");
		Thread.sleep(2000); 
		for (MobileElement element : dontupdate1) {
			 if (element.equals("Don't update")) {
					
				 element.click();
				 Thread.sleep(2000);
			  break;
			  }
			 }
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}
	@Test(priority=4)
	public void miaccount() throws InterruptedException{
		((StartsActivity) driver).startActivity(new Activity("com.android.settings", ".MiuiSettings"));
		
		MobileElement scrollToText1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Mi Account\"));"));
		Thread.sleep(2000);
		 scrollToText1.click();
		 Thread.sleep(2000);
String userid="1631226210";
		 
		 Thread.sleep(2000);
		MobileElement miaccountid = (MobileElement) driver.findElementById("com.xiaomi.account:id/user_id");
		Thread.sleep(2000);
		 Assert.assertTrue(userid.equals(miaccountid.getText().trim()));
		 
		MobileElement micloud = (MobileElement)driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/title' and @text='Mi Cloud']");
		 Thread.sleep(2000);
		 micloud.click();
		 Thread.sleep(10000);
		 
		 
		 
		
	}
	
	
}
