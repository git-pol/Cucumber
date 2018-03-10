package com.bie.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bie.qa.base.TestBase;
import com.bie.qa.util.TestUtil;

public class InsuredSearchCriteriaPage extends TestBase{
	
		//Page Factory -- OR
	
		@FindBy(id="CompanyName")
		WebElement companyName;
		
		@FindBy(id="Address")
		WebElement address;
		
		@FindBy(id="City")
		WebElement city;
		
		@FindBy(id="ZipCode")
		WebElement zipCode;
		
		@FindBy(className="pzhc")
		WebElement useInfoFromAboveButton;		
		
		public InsuredSearchCriteriaPage(){
			
			PageFactory.initElements(driver, this); // Initializing PageFactory. "this" - current class objects (Above ones will be initialized with "driver")
		  //PageFactory.initElements(driver, LoginPage.class); // Same as above 
		}
		
		    //Actions:
		public String validateUmbInsuredSearchCriteriaPageTitle() { // String because return type of the method is string
				
			return driver.getTitle();
		}
		
		public UmbBusinessInfoPage lookupCompany() {
			companyName.sendKeys("Test");
			address.sendKeys("Test");
			city.sendKeys("Test");
			zipCode.sendKeys("91911");
			WebElement lookupCompanyButton = driver.findElement(By.xpath("//*[@id='RULE_KEY']/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/button[1]"));
			Actions lookupCompanyActions = new Actions(driver);
			lookupCompanyActions.moveToElement(lookupCompanyButton).click().perform();
			
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			WebElement useInfoFromAboveButton = driver.findElement(By.xpath("//*[@id='RULE_KEY']/table[3]/tbody[1]/tr[3]/td[1]/nobr[1]/button[1]/div[1]/div[1]/div[1]\r\n" + 
					"\r\n" + 
					""));
			Actions useInfoFromAboveActions = new Actions(driver);
			useInfoFromAboveActions.moveToElement(useInfoFromAboveButton).click().perform();
			
			return new UmbBusinessInfoPage();
			
		}

}
