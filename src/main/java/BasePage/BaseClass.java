package BasePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
 public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			driver.manage().window().maximize();
			//return driver;
		}	
		
		return driver;	
		
	}
	

}
