package com.testing.Interview;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.firefox.driver","E:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	   String baseUrl = "https://www.google.com/";
		//String baseUrl = "https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=ecobx&nui=5&btmpl=mobile&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	    driver.get(baseUrl);
	   // driver.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?btmpl=mobile&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&osid=1&service=mail&ltmpl=ecobx&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    //driver.findElement(By.linkText("Gmail")).click();
	   // driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[2]/div[2]")).click();
	    
	   // driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='gb']/div[@id='gbw']/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
	    
	    //driver.findElement(By.linkText("Sign in")).click();
	    //driver.findElement(By.cssSelector("#identifierId")).click();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("maheshbabu",Keys.ENTER);
	    driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[10]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/h3[1]/span[1]")).click();
	    
	    //driver.findElement(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendkeys(Keys.ENTER);
	    //driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(Keys.ENTER);
	    //driver.findElement(By.id("identifierId")).sendKeys("srikrishna.c4@gmail.com");
	   // driver.findElement(By.linkText("Email or phone")).sendKeys("srikrishna.c4@gmail.com");//sendKeys("srikrishna.c4@gmail.com");
	    
	   // driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
		
	}
	
}

