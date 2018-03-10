package com.bie.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bie.qa.base.TestBase;

public class UmbProductDetailsPage extends TestBase{
	
	//Page Factory -- OR
	
			@FindBy(id="policyLimit")
			WebElement policyLimit;
			
			@FindBy(id="PolicyNumber")
			WebElement policyNumber;
			
			@FindBy(id="NumberOfSwimmingPools")
			WebElement habNumberOfSwimmingPools;
			
			@FindBy(id="NumberOfSpas")
			WebElement habNumberOfSpas;
			
			@FindBy(id="HasSaunas")
			WebElement habHasSaunas;
			
			@FindBy(xpath="//*[@id='CT']/button[1]/div[1]/div[1]/div[1]")
			WebElement nextButton;
			
			//Initializing the Page objects:
			
			public UmbProductDetailsPage(){
				
				PageFactory.initElements(driver, this); // Initializing PageFactory. "this" - current class objects (Above ones will be initialized with "driver")
			  //PageFactory.initElements(driver, LoginPage.class); // Same as above 
			}
			
			    //Actions:
			public String validateUmbProductDetailsPageTitle() { // String because return type of the method is string
					
				return driver.getTitle();
			}
			
			public void addHabUnderlying(String enterHabPolicyNumber, String enterHabNumberOfSwimmingPools, String enterHabNumberOfSpas, String selectHabHasSaunas) {
				/*Select businessEntityDropDown = new Select(businessEntity);
				businessEntityDropDown.selectByVisibleText(selectBusinessType);
				*/
				policyNumber.sendKeys(String.valueOf(enterHabPolicyNumber));
				habNumberOfSwimmingPools.sendKeys(String.valueOf(enterHabNumberOfSwimmingPools));
				habNumberOfSpas.sendKeys(String.valueOf(enterHabNumberOfSpas));
				habHasSaunas.sendKeys(String.valueOf(enterHabNumberOfSpas));
				
				Select HabHasSaunasDropDown = new Select(habHasSaunas);
				HabHasSaunasDropDown.selectByVisibleText(selectHabHasSaunas);
				
			}
			
			public FinishPage navigateToFinishPage() {	
				
				WebElement nextButton = driver.findElement(By.xpath("//*[@id='CT']/button[1]/div[1]/div[1]/div[1]"));
				Actions actions = new Actions(driver);
				actions.moveToElement(nextButton).click().perform();
				
				return new FinishPage();
				
			}
}
