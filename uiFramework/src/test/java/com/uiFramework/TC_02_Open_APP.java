package com.uiFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.setup.BaseSetup;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TC_02_Open_APP extends BaseSetup {

	Map<String, String> packageActivityMap = new HashMap<String, String>();

	TC_02_Open_APP() {
		System.out.println("Cponstrctor invoked");
		packageActivityMap.put("com.miui.weather2", "com.miui.weather2.ActivityWeatherMain");
		//packageActivityMap.put("com.android.chrome", "com.google.android.apps.chrome.Main");
		packageActivityMap.put("com.miui.gallery", "com.miui.gallery.activity.HomePageActivity");
		packageActivityMap.put("com.android.camera", "com.android.camera.Camera");
		packageActivityMap.put("com.google.android.gm", "com.google.android.gm.ui.MailActivityGmail");
		packageActivityMap.put("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
		packageActivityMap.put("com.google.android.youtube", "com.google.android.apps.youtube.app.WatchWhileActivity");
		packageActivityMap.put("com.google.android.apps.docs", "com.google.android.apps.docs.drive.startup.StartupActivity");
		packageActivityMap.put("com.google.android.music", "com.android.music.activitymanagement.TopLevelActivity");
		packageActivityMap.put("com.google.android.talk", "com.google.android.talk.SigningInActivity");
		packageActivityMap.put("com.google.android.apps.photos", "com.google.android.apps.photos.home.HomeActivity");
		packageActivityMap.put("com.miui.player", ".ui.MusicBrowserActivity");
		packageActivityMap.put("com.facebook.katana", "com.facebook.katana.LoginActivity");
		//packageActivityMap.put("in.amazon.mShop.android.shopping", "com.amazon.mShop.home.web.MShopWebGatewayActivity");
		//packageActivityMap.put("com.instagram.android", "com.instagram.android.activity.MainTabActivity");
		packageActivityMap.put("com.flipkart.android", "com.flipkart.android.activity.HomeFragmentHolderActivity");
		packageActivityMap.put("com.skype.raider", "com.skype.raider.Main");
		packageActivityMap.put("jp.naver.line.android", "jp.naver.line.android.activity.main.MainActivity");
		packageActivityMap.put("com.toi.reader.activities", "com.toi.reader.activities.NavigationFragmentActivity");
		packageActivityMap.put("com.gaana", "com.gaana.GaanaActivity");
		packageActivityMap.put("com.ubercaby", "com.ubercab.presidio.app.core.root.RootActivit");
		//packageActivityMap.put("com.whatsapp", "com.whatsapp.HomeActivity");
	packageActivityMap.put("com.cleanmaster.mguard", "com.keniu.security.main.MainActivity");
		packageActivityMap.put("com.outfit7.mytalkingtomfree", "com.outfit7.mytalkingtom.MyTalkingTomNativeActivity");
		packageActivityMap.put("com.wego.android", "com.wego.android.features.splash.SplashBaseActivity");
		packageActivityMap.put("com.xiaomi.hm.health", "com.xiaomi.hm.health.activity.StartUpActivity");}
	/*String apppackagenames[] = { "com.miui.weather2", "com.android.chrome", "com.miui.gallery", "com.android.camera",
			"com.google.android.gm", "com.google.android.apps.maps", "com.google.android.youtube",
			"com.google.android.apps.docs", "com.google.android.music", "com.google.android.talk",
			"com.google.android.apps.photos", "com.miui.player", "com.facebook.katana",
			"in.amazon.mShop.android.shopping", "com.instagram.android", "com.flipkart.android", "com.skype.raider",
			"jp.naver.line.android", "com.toi.reader.activities", "com.gaana", "com.ubercaby", "com.whatsapp",
			"com.cleanmaster.mguard", "com.outfit7.mytalkingtomfree", "com.wego.android", "com.xiaomi.hm.health" };
	String appactivitynames[] = { "com.miui.weather2.ActivityWeatherMain", "com.google.android.apps.chrome.Main",	// "org.chromium.chrome.browser.firstrun.FirstRunActivity",
		"com.miui.gallery.activity.HomePageActivity", "com.android.camera.Camera",
			"com.google.android.gm.ui.MailActivityGmail", "com.google.android.maps.MapsActivity",
			"com.google.android.apps.youtube.app.WatchWhileActivity",
			// "com.google.android.apps.docs.doclist.activity.DocListActivity",
			"com.google.android.apps.docs.drive.startup.StartupActivity",
			"com.android.music.activitymanagement.TopLevelActivity", "com.google.android.talk.SigningInActivity",
			"com.google.android.apps.photos.home.HomeActivity", ".ui.MusicBrowserActivity",
			"com.facebook.katana.LoginActivity",
			"com.amazon.mShop.home.web.MShopWebGatewayActivity", "com.instagram.android.activity.MainTabActivity",
			"com.flipkart.android.activity.HomeFragmentHolderActivity", "com.skype.raider.Main",
			"jp.naver.line.android.activity.main.MainActivity", "com.toi.reader.activities.NavigationFragmentActivity",
			"com.gaana.GaanaActivity", "com.ubercab.presidio.app.core.root.RootActivit", "com.whatsapp.HomeActivity",
			"com.keniu.security.main.MainActivity", "com.outfit7.mytalkingtom.MyTalkingTomNativeActivity",
			"com.wego.android.features.splash.SplashBaseActivity", "com.xiaomi.hm.health.activity.LoginActivity" };

	@Test(priority = 1)

	public void open_app() throws InterruptedException, NoSuchElementException {
		for (int i = 0; i <= 26; i++) {

			try {
				((StartsActivity) driver).startActivity(new Activity(apppackagenames[i], appactivitynames[i]));

				System.out.println("App is launched" + apppackagenames[i]);

				Thread.sleep(1000);

			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				System.out.println("Error........" + e);

				// ((StartsActivity) driver).startActivity(new
				// Activity("com.android.packageinstaller",
				// ".permission.ui.GrantPermissionsActivity"));
				MobileElement allowperm = (MobileElement) driver
						.findElementById("com.android.packageinstaller:id/permission_allow_button");
				while (allowperm.isDisplayed() == true) {
					allowperm.click();
				}
			}

		}
	}*/

	// Custom method

	@Test(priority = 1)

	public void open_app() throws InterruptedException, NoSuchElementException {
		try {
			Set<Map.Entry<String, String>> set = packageActivityMap.entrySet();
			for(Map.Entry<String, String> itr : set){
				
				((StartsActivity) driver).startActivity(new Activity(itr.getKey(), itr.getValue()));
				Thread.sleep(5000);
				
			
			
			}
			/* 
			 * 
			 *    
			 *    
     Activity activity = new Activity("app package goes here", "app activity goes here");
     activity.setWaitAppPackage("app wait package goes here");
     activity.setWaitAppActivity("app wait activity goes here");
     driver.startActivity(activity);
*/
			
			

		} catch (WebDriverException e) {
			
				
			System.out.println("Wrong activity" +packageActivityMap);
			
		}

	}
}
