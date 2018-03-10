package com.bie.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bie.qa.base.TestBase;

public class SelectLineOfBusinessPage extends TestBase{
	
	//Page Factory -- OR
	
		@FindBy(xpath = "//input[@value='UMB']")
		WebElement selectUmbrellaRadioButton;
		
		@FindBy(id="effDate")
		WebElement effectiveDate;
		
		@FindBy(xpath="//input[@value='Continue']")
		WebElement continueButton;
		
		
		public SelectLineOfBusinessPage(){
			
			PageFactory.initElements(driver, this); // Initializing PageFactory. "this" - current class objects (Above ones will be initialized with "driver")
		  //PageFactory.initElements(driver, LoginPage.class); // Same as above 
		}
		
		public String validateUmbSelectLineOfBusinessPageTitle() { // String because return type of the method is string
			
			return driver.getTitle();
		}
		
		public InsuredSearchCriteriaPage continueQuoteCreation(String enterEffectiveDate) {
			WebElement selectUmbrellaRadioButton = driver.findElement(By.xpath("//input[@value='UMB']"));
			selectUmbrellaRadioButton.click();
			effectiveDate.sendKeys(enterEffectiveDate);
			WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(continueButton).click().perform();
			return new InsuredSearchCriteriaPage();
		}
}
