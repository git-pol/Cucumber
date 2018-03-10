package com.bie.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bie.qa.base.TestBase;
import com.bie.qa.util.TestUtil;

public class ServiceMyCustomerPage extends TestBase{
	
	//Page Factory -- OR
	
	@FindBy(id="createquote")
	WebElement createQuoteRadioButton;  // Bottom again
	
	@FindBy(id="quotesubmit")
	WebElement submitButton;
	
	
	public ServiceMyCustomerPage(){
		
		PageFactory.initElements(driver, this); // Initializing PageFactory. "this" - current class objects (Above ones will be initialized with "driver")
	  //PageFactory.initElements(driver, LoginPage.class); // Same as above 
	}
	
	//Actions:
	public String validateUmbServiceMyCustomerPageTitle() { // String because return type of the method is string
			
		return driver.getTitle();
	}
	
	public SelectLineOfBusinessPage createQuote() {
		WebElement createQuoteRadioButton = driver.findElement(By.id("createquote"));
		createQuoteRadioButton.click();		
		WebElement submitButton = driver.findElement(By.id("quotesubmit"));
		Actions actions = new Actions(driver);
		actions.moveToElement(submitButton).click().perform();
		TestUtil.switchWindow();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return new SelectLineOfBusinessPage();
	}

}
	