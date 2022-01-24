package com.bdd.demo.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;

import BasePage.BaseClass;
import ExtentDemo.ExtentReportDemo;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/")
//@CucumberOptions(features="src/test/resources/")
@CucumberOptions(features={"src/test/resources/com.bbd.demo/A_login.feature",
		"src/test/resources/com.bbd.demo/B_contactus.feature"})
public class CucumberRunnerTest {
	static WebDriver driver;
	static ExtentReports reports; 
	@BeforeClass
	public static void setUp() {
		System.out.println("before class ");
		driver = BaseClass.getDriver();
		reports = ExtentReportDemo.getReport();
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions(); 
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		//options.addArguments("--disable-web-security");
		//WebDriver driver = new ChromeDriver(options); 
		//driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ); // Only Reason This CHnages is Selenium  
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		//driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		System.out.println("After class ");
		Thread.sleep(2000); 
		driver.get("C:\\Users\\E Anya\\eclipse-workspace\\CukeProjectLesson1\\ExtentFolder\\index.html"); 
		  driver.navigate().back(); 
		  Thread.sleep(1000); 
		  driver.navigate().forward();
		  Thread.sleep(60000);
		driver.quit();
	}


}
