package com.githubactions.cicd_try;

import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import java.net.URL;
import java.net.MalformedURLException;

public class AppiumTestTry {

  @Test
  public void cicdAppiumTry() throws Exception {
    System.out.println("Hello Lohith!!!");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName","Android");
    capabilities.setCapability("appWaitDuration","2000");
    capabilities.setCapability("deviceName","emulator-5554");
    capabilities.setCapability("appPackage","com.android.messaging");
    capabilities.setCapability("appActivity","com.android.messaging.ui.conversation.ConversationActivity");
    //capabilities.setCapability("browsername", "chrome");
    capabilities.setCapability("automationName", "UiAutomator2");
    capabilities.setCapability("avdArgs", "-no-window");

    AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    //driver.get("https://amazon.in/");
     System.out.println("All most at the end");
    System.out.println("Amazon title: " +driver.getTitle());
    
  }
}
