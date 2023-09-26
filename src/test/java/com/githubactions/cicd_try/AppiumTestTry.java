package com.githubactions.cicd_try;

import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class AppiumTestTry {

  @Test
  public void cicdAppiumTry(){
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName","Android");
    capabilities.setCapability("appWaitDuration","20000");
    capabilities.setCapability("deviceName","Android Emulator");
    capabilities.setCapability("appPackage","com.android.chrome");
    capabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
    capabilities.setCapability("browsername", "chrome");
    capabilities.setCapability("automationName", "UiAutomator2");
    capabilities.setCapability("avdArgs", "-no-window");

    AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
    driver.get("https://amazon.in/");
    System.out.println("Amazon title: " +driver.getTitle());
    
  }
}
