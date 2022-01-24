package com.bdd.demo.stepdef;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bdd.demo.pages.LoginPage;

import BasePage.BaseClass;
import ExtentDemo.ExtentReportDemo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
 

//public class LoginTest extends BaseClass {
	
public class LoginTest {	
	static WebDriver driver;
	//WebDriver driver;
	ExtentTest test;
	ExtentReports reports;
	LoginPage lp;
	
/**	@Before(order=0)
	public void setUp() {
		//reports = ExtentReportDemo.getReport();
		//test = reports.createTest("LoginTest");
		//driver = BaseClass.getDriver();
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.addArguments("--disable-web-security");
		//WebDriver driver = new ChromeDriver(options); 
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ); // Only Reason This CHnages is Selenium  
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		driver.manage().window().maximize();
		//File reader = new File(".//src/");
		//System.out.println(reader);		
		
	}
	
 
	  @After(order=0) 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(1000); 
	 // reports.flush(); 
	  Thread.sleep(2000); 
	 // driver.get("C:\\Users\\E Anya\\eclipse-workspace\\CukeProjectLesson1\\ExtentFolder\\index.html"); 
	  driver.navigate().back(); 
	  Thread.sleep(1000); 
	  driver.navigate().forward();
	  Thread.sleep(2000); 
	  driver.quit();
	  
	  
	  }**/
	
	
	@Before
	public void setUp() {
		driver = BaseClass.getDriver();
		reports = ExtentReportDemo.getReport();
		test = reports.createTest("LoginTest");
	} 
	@After
	public void tearDown() {
		reports.flush(); 
	}
	
	@Given("^The Login form is open$")
	public void loginform() {
		//driver = BaseClass.getDriver();
		test.log(Status.INFO,"LoginTest Started");
		test.log(Status.INFO,"Navigating to LoginPage");
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions(); 
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		//options.addArguments("--disable-web-security");
		//WebDriver driver = new ChromeDriver(options); 
		//driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ); // Only Reason This CHnages is Selenium  
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		//driver.manage().window().maximize();
		driver.get("file:///C:/CODE/apache-tomcat-8.5.73/webapps/Myapps/index.html");
		test.log(Status.INFO,"Exiting from LoginPage");
		
		
	}
	
	
	
	  @When("^I enter ([^\"]*),([^\"]*)$") 
	  public void enterCredentials(String username, String password) throws InterruptedException {
	test.log(Status.INFO,"Enter Credentials (username and password Started");
	  System.out.println("printing username and password " + username +"*****" + password);
	  
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#usrnme")).sendKeys(username);
	  
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#pwd")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#loginbt")).click();
	  Thread.sleep(2000);
	 test.log(Status.INFO,"Exiting LoginPage");
	  
	  }
	 
	
	
	//  @Then("^I should see the (\\d+) message on screen$")
	  @Then("^I should see the ([^\"]*) message on screen$") 
	  public void  seeMessage(String message) throws InterruptedException 
	  { 
		 test.log(Status.INFO," Verifying Error Message or WelcomePage Title"); 
		  lp = new LoginPage(driver);
		  if(!StringUtils.isBlank(message)) {
			boolean result =  lp.getLoginError(message);
		   Assert.assertTrue(result);
		 test.log(Status.PASS," Verifying Error Message "); 
		  }else {
			    Assert.assertEquals(driver.getTitle(),"Welcome to EA ANIMAL ADOPTION"); 
		 test.log(Status.PASS," Verifying WelcomePage title ");
		  }
		  
	  
		  Thread.sleep(1000); 
			 // reports.flush(); 
			  Thread.sleep(2000); 
			 // driver.get("C:\\Users\\E Anya\\eclipse-workspace\\CukeProjectLesson1\\ExtentFolder\\index.html"); 
			  driver.navigate().back(); 
			  Thread.sleep(1000); 
			  driver.navigate().forward();
			  Thread.sleep(2000); 
			//  driver.quit();
	  
	  
	  } 
    
    

}
