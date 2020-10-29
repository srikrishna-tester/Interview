package com.testing.Interview;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateChooser {
	
	public static void main(String[] args) throws InterruptedException {
		
	String month = "March, 2022";
	String day = "20";
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://phptravels.net/");
	//input[@id='checkin']
	driver.findElement(By.xpath("//input[@id='checkin']")).clear();
	
	driver.findElement(By.xpath("//input[@id='checkin']")).sendKeys("02/11/2021");
	Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='checkout']")).clear();
	
	driver.findElement(By.xpath("//input[@id='checkout']")).sendKeys("04/11/2021");
	while(true){
		
		String text = driver.findElement(By.xpath("//body/div[@id='datepickers-container']/div[1]/nav[1]/div[2]")).getText();
		
		if(text.equals(month))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//body[1]/div[2]/div[1]/nav[1]/div[3]/svg[1]")).click();
		}
	}
	
   
}
}
