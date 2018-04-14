package com.bie.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bie.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;  // why here? Can be used in all child classes. Public since it can be used in child classes.
	public static Properties prop;   // can be used inside initialization method since global. Public since it can be used in child classes.
		
	
	public TestBase() {  // This is Constructor
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/bie/qa/config/config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Azeez\\Dev\\Drivers\\chromedriver.exe");	
			driver = new ChromeDriver(); // Driver variable will be initialized	
	}
		
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D:\\Azeez\\Dev\\Drivers\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}
	
	// For Git
}
