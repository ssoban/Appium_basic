package com.uiFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.Drivers.Driver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Googleplay extends Driver 
{

	protected AndroidDriver<MobileElement> driver;
    
	public Googleplay()
	{
    }
    public Googleplay(AndroidDriver<MobileElement> driver) 
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    
    
    @AndroidFindBy(id = "com.android.vending:id/navigation_button")
    public MobileElement navigationbutton;
    
    @AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Play Protect\"))")
	public MobileElement scrollToText;
    
    
   
    @AndroidFindBy(xpath="//android.widget.Switch[@resource-id='com.google.android.gms:id/toggle'  and @text='ON']")
    public MobileElement playprotecttoggle;
    
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")
	public MobileElement popupok;
	 
	@AndroidFindBy(id="com.android.vending:id/search_box_idle_text") 
	public MobileElement appTitlsearchbox;	
	
		
	
	
	
	
	
	
	
	
	
	public void naviigationmenu()
	{
		   if(navigationbutton.isDisplayed())
		   {
			   navigationbutton.click();
		   }
		   
	}
	public void scrolling()
	{
		
		 scrollToText.click();
	}
	
	public boolean playprotectscreen() throws InterruptedException
	{
	try{
		  if(playprotecttoggle.isDisplayed()==false)
		  {
			System.out.println("Already toggle off");
		   }
		else
		  {
			
		 playprotecttoggle.click();
		 if(popupok.isDisplayed())
		     {
			 popupok.click();
			 
		     }
		 }
	
		 
	} 
	catch (NoSuchElementException e1) {
		
			System.out.println(" already toggle off ");
			driver.navigate().back();
			Thread.sleep(10000);
		
	    }
		
	return false;
	}
	
	public void idle_serachbox(){
	try {
		
   appTitlsearchbox.click();
	}
	catch (NoSuchElementException e2) {
	System.out.println("Unable to find search box");
	}}
	
	
}