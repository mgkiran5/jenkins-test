package com.example.selenium.selenium_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tests {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("--headless=new");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	}
	
	@Test
	public void firstTest() throws InterruptedException {
		
		driver.get("https://qatesthub.online/");
		
		AssertJUnit.assertEquals("QA Test Hub", driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
