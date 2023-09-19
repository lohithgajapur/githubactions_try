package com.githubactions.cicd_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;





public class SimpleTest {
	
	@Test
	public void firstcicdTest(){
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions oc = new ChromeOptions(); 
		oc.addArguments("--headless");
		//System.setProperty("webdriver.chrome.driver", "G:\\Java_Software_Latest_version\\2.4 chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(oc); 
		driver.get("https://google.com/");
	}

}
