package com.bdd.demo.stepdef;

import java.io.File;
import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BasePage.BaseClass;
import ExtentDemo.ExtentReportDemo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;




public class ContactUsTest {

	WebDriver driver;
	WebElement slider;
	ExtentTest test;
	ExtentReports reports;


	
 /**@Before(order=1) 
	  public void setUp() { // reports = ExtentReportDemo.getReport("ExtentFolder"); 
		 // reports = ExtentReportDemo.getReport();
	    //  test = reports.createTest("ContactUsTest");
	  WebDriverManager.chromedriver().setup(); 
	  ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.addArguments("--disable-web-security");
	  driver = new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ); 
	  // Only Reason This CHnages is Selenium 
	  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  driver.manage().window().maximize(); 
 
	 // File reader = new File(".//src/");
	 // System.out.println(reader); 
	  }
 

    @After(order=1) 
	  public void tearDown() throws InterruptedException {
	  Thread.sleep(1000); 
	//  reports.flush(); 
	  Thread.sleep(2000); 
	//  driver.get("C:\\Users\\E Anya\\eclipse-workspace\\CukeProjectLesson1\\ExtentFolder\\index.html"); 
	  driver.navigate().back(); 
	  Thread.sleep(1000); 
	  driver.navigate().forward();
	  Thread.sleep(6000); 
	  driver.close(); 
	  } ***/
	
	@Before
	public void setUp() {
		driver = BaseClass.getDriver();
		reports = ExtentReportDemo.getReport();
	    test = reports.createTest("ContactUsTest");
	}
	@After
	public void tearDown() {
		reports.flush();	 
	}
	 

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws InterruptedException {
		
		test.log(Status.INFO,"ContactUs Started");
		test.log(Status.INFO,"Navigating to homePage");
	//	WebDriverManager.chromedriver().setup(); 
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//driver = BaseClass.getDriver();
		  // Only Reason This CHnages is Selenium 
		  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//driver.manage().window().maximize(); 
		
		//====================================================
		
		//WebDriverManager.chromedriver().setup(); 
		 // ChromeOptions options = new ChromeOptions(); 
			//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			//options.addArguments("--disable-web-security");
		 // driver = new ChromeDriver(options);
		 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS ); 
		  // Only Reason This CHnages is Selenium 
		  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 // driver.manage().window().maximize(); 
      //=================================================================
		driver.get("file:///C:/CODE/apache-tomcat-8.5.73/webapps/Myapps/index.html");
		test.log(Status.INFO,"Exiting from homePage");
		Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#usrnme")).sendKeys("Bigdog");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#pwd")).sendKeys("Opendoor1");
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#loginbt")).click();
		  Thread.sleep(2000);
	}
	@When("I navigate to contact page")
	public void i_navigate_to_contact_page() {
		test.log(Status.INFO,"Navigating to ContactPage");
		driver.findElement(By.id("contact_link")).click();
	}

	@When("I fill in form with data")
	public void i_feel_in_form_with_data() throws InterruptedException {
		test.log(Status.INFO,"Fill ContactPage Data");
		// driver.findElement(By.name("")).sendKeys("");
		// driver.findElement(By.name("")).sendKeys("");
		//  driver.findElement(By.name("")).sendKeys("");
		//  driver.findElement(By.name("")).sendKeys("");




		//=======SLIDER SECTION ====================================//
		/*
		 * Thread.sleep(1000); driver.navigate().back(); Thread.sleep(1000);
		 * driver.navigate().forward();
		 */
		//System.out.println("back and forward done");
		/*
		 * try { WebDriverWait wait = new WebDriverWait(driver, 10); slider =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * cssSelector("#slider-1 a")));
		 * 
		 * // slider = driver.findElement(By.cssSelector("#slider-1 a")); } catch
		 * (NoSuchElementException e) { System.out.println("isEnabled " +
		 * !!slider.isEnabled()); System.out.println("isDisplayed " +
		 * !slider.isDisplayed()); if(!slider.isEnabled()) { while (!slider.isEnabled())
		 * { System.out.println("in the loop"); Thread.sleep(1000);
		 * //driver.navigate().back();
		 * driver.findElement(By.xpath("//body")).sendKeys(Keys.F5); Thread.sleep(1000);
		 * //driver.navigate().forward(); //slider =
		 * driver.findElement(By.cssSelector("#slider-1 a")); } 
		 * }
		 */
		/**	Wait wait = new FluentWait(driver)
			    .withTimeout(Duration.ofSeconds(40))

			    .pollingEvery(Duration.ofSeconds(40))

			    .ignoring(NoSuchElementException.class);
		//wait.until(null)

		slider= wait.until(new Function<WebDriver, WebElement>(){

			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.cssSelector("#slider-1 a"));
			}
		});**/
		/*
		 * for(int i=0; i<5; i++) { Thread.sleep(1000); driver.navigate().back();
		 * Thread.sleep(1000); driver.navigate().forward(); slider =
		 * driver.findElement(By.cssSelector("#slider-1 a")); if(slider.isDisplayed()) {
		 * break; }
		 * 
		 * }
		 */
		try {


			for(int i =0; i<5;i++)	{
				//System.out.println("in fluent wait function");
				Thread.sleep(1000);
				driver.navigate().back(); 
				Thread.sleep(1000);
				driver.navigate().forward();
				new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#slider-1 a")));
				/*
				 * if(!slider.isDisplayed()) { driver.navigate().back();
				 * driver.navigate().forward(); }
				 */

				slider = driver.findElement(By.cssSelector("#slider-1 a"));
				if(slider.isDisplayed()) {
					break;
				}
			}	


			Actions action  = new Actions(driver);
			action.click(slider).build().perform();		
			Thread.sleep(1000);
			for(int i =0; i<15; i++) {			
				action.sendKeys(Keys.ARROW_RIGHT).build().perform();
				Thread.sleep(1000);
			}

		} catch (TimeoutException e) {
			//if(!slider.isDisplayed()) {
			for(int i =0; i<5;i++)	{
				//System.out.println("in fluent wait function");
				Thread.sleep(1000);
				driver.navigate().back(); 
				Thread.sleep(1000);
				driver.navigate().forward();
				new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#slider-1 a")));
				/*
				 * if(!slider.isDisplayed()) { driver.navigate().back();
				 * driver.navigate().forward(); }
				 */

				slider = driver.findElement(By.cssSelector("#slider-1 a"));
				if(slider.isDisplayed()) {
					break;
				}
			}	


			Actions action  = new Actions(driver);
			action.click(slider).build().perform();		
			Thread.sleep(1000);
			for(int i =0; i<15; i++) {			
				action.sendKeys(Keys.ARROW_RIGHT).build().perform();
				Thread.sleep(1000);
			}

			//	}

		}	

		//===========================END OF SLIDER SECTION =============================//	

		driver.findElement(By.name("name_field")).sendKeys("luhas");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rdona")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("address_field")).sendKeys("65 Mash Lane Brix CIty");
		Thread.sleep(1000);
		driver.findElement(By.name("postcode_field")).sendKeys("NE34 Ohy");
		Thread.sleep(1000);
		driver.findElement(By.name("email_field")).sendKeys("test@animal.com");

		Thread.sleep(3000);
		test.log(Status.INFO,"Fill ContactPage Data Completed");
	}

	@When("I submit my information")
	public void i_submit_my_information() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("submit_message")).click();
		test.log(Status.INFO,"Submit ContactPage Data completed");
	}

	@Then("I get confirmation message")
	public void i_get_confirmation_message() throws InterruptedException {
		test.log(Status.INFO,"Navigating to Confirmation Message Page ");
		Thread.sleep(3000);
		String confirm_message = driver.findElement(By.tagName("p")).getText();
		try {
			Assert.assertTrue(confirm_message.contains("Many thanks for your message"));
			test.log(Status.PASS,"confirmation message captured");
		} catch (AssertionError e) {
			test.log(Status.FAIL," confirmation message not captured ");
		}
		
		
		Thread.sleep(1000); 
		//  reports.flush(); 
		  Thread.sleep(2000); 
		//  driver.get("C:\\Users\\E Anya\\eclipse-workspace\\CukeProjectLesson1\\ExtentFolder\\index.html"); 
		  driver.navigate().back(); 
		  Thread.sleep(1000); 
		  driver.navigate().forward();
		  Thread.sleep(6000); 
		//  driver.close(); 
		

	}

}
