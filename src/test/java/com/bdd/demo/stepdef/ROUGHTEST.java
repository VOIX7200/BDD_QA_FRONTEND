package com.bdd.demo.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ROUGHTEST {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ); // Only Reason This CHnages is Selenium  
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/CODE/apache-tomcat-8.5.73/webapps/Myapps/index_ERR.html");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#usrnme")).sendKeys("Bigdog");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#pwd")).sendKeys("Opendoor1");
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#loginbt")).click();
		  Thread.sleep(2000);
		 

	}

}
