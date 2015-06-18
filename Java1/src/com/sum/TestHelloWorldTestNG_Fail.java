package com.sum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;
import org.testng.Assert;

public class TestHelloWorldTestNG_Fail {
	
	 WebDriver driver;
	 @Test
	 public void helloWorld() throws Exception {        
	 driver = new FirefoxDriver();
	 driver.get("http://www.baidu.com/");
	 driver.manage().window().maximize();
	        
	 WebElement txtbox = driver.findElement(By.name("wd"));
	 txtbox.sendKeys("Glen");
	 WebElement btn = driver.findElement(By.id("su"));
	 btn.click();
	 
	try {                 
			Thread.sleep(8000);             
		} catch (InterruptedException e)
		{                
			e.printStackTrace();           
		} 
	               
	 String expectedTitle = "Glen_百度搜索";
	 String actualTitle = driver.getTitle();
	         
	 Assert.assertEquals(actualTitle,expectedTitle);
	 }
	      
	 @AfterTest
	 public void tearDown(){
	 driver.quit();
	 }

}
