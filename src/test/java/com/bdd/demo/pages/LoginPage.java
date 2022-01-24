package com.bdd.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public  Boolean getLoginError(String errorMsg) {
	
		String errorText = driver.findElement(By.id("error")).getText();
		
		if(errorText.equals(errorMsg)) {
			return true;	
		}else {
			return false;
		}		
	}

}
