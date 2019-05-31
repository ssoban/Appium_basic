package com.uiFramework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.setup.BaseSetup;
import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class TC_04_Open_app_via_playstore extends BaseSetup {
	
	int i;
	String appnames[]={"Hangouts","Gmail","Maps - Navigation & Explore","Google Drive","Google Play Music","Google Chrome:Fast & Secure","Google Photos","Instagram",
			"Skype - Free IM & video calls", "LINE: Free Calls & Messages", "News by The Times of India Newspaper - Latest News",
			"Gaana Music: Bollywood Songs,Radio & MP3 Online" ,"Uber","Flipkart Online Shopping App","WhatsApp Messenger","Facebook",
			"Amazon India Online Shopping","Clean Master- Space Cleaner & Antivirus","My Talking Tom","Wego Flights & Hotels","Mi Fit" , };
	Map<String, String> packageActivityMap = new HashMap<String, String>();
	TC_04_Open_app_via_playstore(){
		
		
		
		packageActivityMap.put("com.miui.weather2", "com.miui.weather2.ActivityWeatherMain");
		packageActivityMap.put("com.miui.gallery", "com.miui.gallery.activity.HomePageActivity");
		packageActivityMap.put("com.android.camera", "com.android.camera.Camera");
		packageActivityMap.put("com.miui.player", ".ui.MusicBrowserActivity");
		packageActivityMap.put("com.google.android.youtube", "com.google.android.apps.youtube.app.WatchWhileActivity");
		
	}
	
	

 @Test(priority = 1)

		public void open_app_via_start_activity() throws InterruptedException, NoSuchElementException 
	 {
			
				Set<Map.Entry<String, String>> set = packageActivityMap.entrySet();
				for(Map.Entry<String, String> itr : set)
				
				{
					
					try {
						((StartsActivity) driver).startActivity(new Activity(itr.getKey(), itr.getValue()));
						Thread.sleep(5000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
	 }
	
	@Test(priority=2)
	
	public void open_app_via_play() throws InterruptedException
	{
	
	
	 for( i=0; i<appnames.length;i++)   
	 {
		 playstore_serach_method();
		/* try
           {
		
		((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));//start activity
		Thread.sleep(2000);
		MobileElement appTitlsearchbox = (MobileElement) driver.findElementById("com.android.vending:id/search_box_idle_text"); //searchching idle box
         
		if(appTitlsearchbox.isDisplayed())
         
	        {
			appTitlsearchbox.click();
            }
		
		
		
          
	          }
		 catch (NoSuchElementException e2)
	          {
	System.out.println("Unable to find search box"   +e2);
	((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));
	
	            }
	
			 
			
	try {
			
	          MobileElement cross = (MobileElement)driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.android.vending:id/action_button' and @content-desc='Clear']");
				cross.click();
			} catch (NoSuchElementException e1)
	           {
				System.out.println("no cross");
			    }
		
	 try {
		 Thread.sleep(2000);
		MobileElement editText = (MobileElement) driver.findElementById("com.android.vending:id/search_box_text_input");
		  
		    
		
		  if(editText.isDisplayed()) {
		    editText.sendKeys(appnames[i]);}
		    
		  
		    ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		    
		    Thread.sleep(3000);
		  
	       } catch (NoSuchElementException e3) {
		
	System.out.println("Unable to find text box or  press keycode " + ".............................due to...................." +e3);
	((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));
	MobileElement editText1 = (MobileElement) driver.findElementById("com.android.vending:id/search_box_active_text_view");
	  editText1.sendKeys(appnames[i]);
	  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	                 }*/




	   // MobileElement suggestedapp = (MobileElement) driver.findElementById("com.android.vending:id/title");
	   // suggestedapp.click();
	   
	
try 

 { 
		List	<MobileElement> suggestedresult= (List <MobileElement>)driver.findElements(By.xpath("//*[@resource-id='com.android.vending:id/li_title']"));
		
		Thread.sleep(3000);
		
		if(suggestedresult.size()>=0)
			{
				
				for (int j=0; j<=suggestedresult.size()-1;j++) 
				{
				
					 if (suggestedresult.get(j).getAttribute("text").equals(appnames[i]))	 
					 {
						 
						 Thread.sleep(3000);
						 suggestedresult.get(j).click();
					           break;
					  }
					     Thread.sleep(2000);
					 
					 
					 }
				
				open_install_update();
				
				
			 }
		else 
		 {  
				Thread.sleep(5000);
				open_install_update();
		 }
	 } 
	 
	 catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	              }
	
	 
	 
	 
	 
		
	 }
	    
 }
	
	
	
	
	
	public void open_install_update() throws InterruptedException{
		
		
		
		
		
		 try
		  
		  {
			  
			  
			 
			 Thread.sleep(3000);  
			  
		List<MobileElement> appfetched= (List<MobileElement>)driver.findElements(By.xpath("//android.widget.Button[@text='OPEN']"));
		Thread.sleep(2000);
			    if(appfetched.size()>0)
	       {
			    	appfetched.get(0).click();
			    	
			    System.out.println(appnames[i]+" App is going to be  open");
			    Thread.sleep(10000);
			                                                                                  }
			    else
		     {Thread.sleep(5000);
		     
			    	List 	<MobileElement> appfetched1= (List<MobileElement>)driver.findElements(By.xpath("//android.widget.Button[@text='UPDATE']"));
			    	if(appfetched1.size()>0)
			    		
		          {     Thread.sleep(2000);                    
			    		appfetched1.get(0).click();
			    	WebDriverWait wait = new WebDriverWait(driver,3600);
			    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='OPEN']"))).click();
			    	 Thread.sleep(10000);
			    	                                        }
			    	
			    	else
		                 {
			    		Thread.sleep(5000);
			    	List	<MobileElement> appfetched2= (List <MobileElement>)driver.findElements(By.xpath("//android.widget.Button[@text='INSTALL']"));
			    	if(appfetched2.size()>0)
		                         {
			    		Thread.sleep(2000);
			    		 appfetched2.get(0).click();
			    		 WebDriverWait wait = new WebDriverWait(driver,3600);
			    		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='OPEN']"))).click();;
			    		 Thread.sleep(10000);
			    	       }
			    	else
			    	{
			    		List 	<MobileElement> warningmessage= (List<MobileElement>)driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.android.vending:id/warning_message' and @text=' Your device isn't compatible with this version.']"));
			    		if(warningmessage.size()>=0)
			    		{
			    			System.out.println(warningmessage.get(0).getText()); 
			    		}
			    		else{
			    			
			    			playstore_serach_method();
					    	WebDriverWait wait = new WebDriverWait(driver,3600);
					    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='OPEN']"))).click();
			    			
			    		    }
			    	}
			    	
			    		
			    	    }
			    	  }
			   }
			    
		       
		  catch (NoSuchElementException e)
		  {
			  System.out.println(appnames[i]+" .........................................................Unable to  installed app due........................ ");
			  System.out.println(e);
		  }
		
		
	}
	
	
	public void playstore_serach_method() throws InterruptedException{


		 try
		           {
				
				((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));//start activity
				Thread.sleep(2000);
				MobileElement appTitlsearchbox = (MobileElement) driver.findElementById("com.android.vending:id/search_box_idle_text"); //searchching idle box
		         
				if(appTitlsearchbox.isDisplayed())
		         
			        {
					appTitlsearchbox.click();
		            }
				
				
				
		          
			          }
				 catch (NoSuchElementException e2)
			          {
			System.out.println("Unable to find search box"   +e2);
			((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));
			
			            }
			
					 
					
			
				
			 try {
				 Thread.sleep(2000);
				MobileElement editText = (MobileElement) driver.findElementById("com.android.vending:id/search_box_text_input");
				  
				    
				
				  if(editText.isDisplayed()) {
				    editText.sendKeys(appnames[i]);}
				    
				  
				    ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
				    
				    Thread.sleep(3000);
				  
			       } catch (NoSuchElementException e3) {
				
			System.out.println("Unable to find text box or  press keycode " + ".............................due to...................." +e3);
			((StartsActivity) driver).startActivity(new Activity("com.android.vending", "com.android.vending.AssetBrowserActivity"));
			MobileElement editText1 = (MobileElement) driver.findElementById("com.android.vending:id/search_box_active_text_view");
			  editText1.sendKeys(appnames[i]);
			  ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
			                 }


		}	

	 
	
	
	
	
	 
	 
	 
}

		

	

