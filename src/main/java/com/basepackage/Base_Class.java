package com.basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class Base_Class {
	
	public WebDriver driver;
	
	
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.dominos.co.in");
		driver.manage().window().maximize();
		
	}
	
	public void browserClose() {
		
		driver.close();
		
	}
	

}
