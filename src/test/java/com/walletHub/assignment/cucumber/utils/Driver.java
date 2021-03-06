package com.walletHub.assignment.cucumber.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	private static WebDriver driver;

	private Driver(){
		
	}
	
	public static WebDriver getChromerDriver(String driverName) {
		if(driver==null){
			if(driverName.equals("chrome")){
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				System.setProperty("webdriver.chrome.driver", "src/main/resource/chromedriver.exe");	     
				driver=new ChromeDriver(options);	
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		}
		return driver;
		 
	}//	public static WebDriver getChromerDriver(String driverName,ChromeOptions options) {
//		if(driver==null){
//			if(driverName.equals("chrome")){
//				System.setProperty("webdriver.chrome.driver", "src/main/resource/chromedriver.exe");	     
//				driver=new ChromeDriver(options);	
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			}
//		}
//		return driver;
//		 
//	}
	}
