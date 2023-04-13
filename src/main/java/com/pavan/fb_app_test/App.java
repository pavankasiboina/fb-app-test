package com.pavan.fb_app_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Facebook Login Test
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chromr.driver","E:\\ChromeDriver");
		ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
        System.out.println( "Selenium test scripts executed started ...." );
        
        
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        
        driver.findElement(By.id("email")).sendKeys("pavan@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("pavankasiboina");
        Thread.sleep(1000);
        driver.findElement(By.id("loginbutton")).click();
        
        Thread.sleep(3000);
        
        driver.quit();
        System.out.println("Scripts Executed Successfully...");
        
        
    }
}
