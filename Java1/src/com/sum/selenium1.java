package com.sum;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium1 {
    public static void main(String[] args) {            
    	WebDriver driver = new FirefoxDriver();  
    	driver.get("http://www.baidu.com");    
    	WebElement element = driver.findElement(By.id("kw"));  
    	element.sendKeys("hello Selenium!");      
    	element.submit();           
    	try {                 
    		Thread.sleep(8000);             
    	} catch (InterruptedException e)
    	{                
    		e.printStackTrace();           
    	}             
    	System.out.println("Page title is: " + driver.getTitle());            driver.quit();        } 

}
