package com.bie.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bie.qa.base.TestBase;

public class UmbBusinessInfoPage extends TestBase{
	
	//Page Factory -- OR
	
		@FindBy(id="BusinessEntity")
		WebElement businessEntity;
		
		@FindBy(id="FEIN")
		WebElement feiNumber;
		
		@FindBy(id="dsQuoteSource")
		WebElement typeOfQuote;
		
		//Initializing the Page objects:
		
		public UmbBusinessInfoPage(){
			
			PageFactory.initElements(driver, this); // Initializing PageFactory. "this" - current class objects (Above ones will be initialized with "driver")
		  //PageFactory.initElements(driver, LoginPage.class); // Same as above 
		}
		
		    //Actions:
		public String validateUmbBusinessInfoPageTitle() { // String because return type of the method is string
				
			return driver.getTitle();
		}
		
		public UmbProductDetailsPage navigateToProductDetailsPage(String selectBusinessType, String enterFeiNumber, String selectTypeOfQuote) {
			Select businessEntityDropDown = new Select(businessEntity);
			businessEntityDropDown.selectByVisibleText(selectBusinessType);
			
			feiNumber.sendKeys(String.valueOf(enterFeiNumber));
			
			Select typeOfQuoteDropDown = new Select(typeOfQuote);
			typeOfQuoteDropDown.selectByVisibleText(selectTypeOfQuote);
			
			WebElement nextButton = driver.findElement(By.xpath("//*[@id='CT']/button[1]/div[1]/div[1]/div[1]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(nextButton).click().perform();
			
			return new UmbProductDetailsPage();
			
		}

}
