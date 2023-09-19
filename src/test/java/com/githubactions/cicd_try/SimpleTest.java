package com.githubactions.cicd_try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;





public class SimpleTest {
	
	@Test
	public void firstcicdTest(){
		WebDriverManager.chromedriver().setup(); 
		//System.setProperty("webdriver.chrome.driver", "G:\\Java_Software_Latest_version\\2.4 chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://google.com/");
	}

}
