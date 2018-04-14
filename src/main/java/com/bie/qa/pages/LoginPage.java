package com.bie.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bie.qa.base.TestBase;
import com.bie.qa.pages.ServiceMyCustomerPage;
import com.bie.qa.util.TestUtil;

public class LoginPage extends TestBase{
	
	//Page Factory -- OR
	
	@FindBy(name="USERNAME")
	WebElement username;
	
	@FindBy(name="PASSWORD")
	WebElement password;
	
	//@FindBy(xpath="//input[@type='submit']")
	//WebElement loginbutton;
	
	//Initializing the Page objects:
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this); // Initializing PageFactory. "this" - current class objects (Above ones will be initialized with "driver")
	  //PageFactory.initElements(driver, LoginPage.class); // Same as above 
	}
	
	    //Actions:
	public String validateLoginPageTitle() { // String because return type of the method is string
			
		return driver.getTitle();
	}
	
	public ServiceMyCustomerPage login(String un, String pwd) {
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		username.sendKeys(un);  // Local variable
		password.sendKeys(pwd);
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(loginbutton).click().perform();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		return new ServiceMyCustomerPage();
	}

}
