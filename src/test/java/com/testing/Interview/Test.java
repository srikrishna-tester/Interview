package com.testing.Interview;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.navigate().to("http://yahoo.com/");
	    driver.navigate().refresh();
	    driver.navigate().to("http://google.com/");
	    driver.navigate().back();
	    driver.navigate().forward();
	    
	    String random=RandomStringUtils.randomAlphabetic(8);
	    System.out.println(random);
	    
	    String randomm = RandomStringUtils.randomNumeric(13);
	    System.out.println(randomm);
	    
	   
	   
		
		
	}

}
