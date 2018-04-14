package com.bie.qa.stepDefinitions;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.bie.qa.base.TestBase;
import com.bie.qa.pages.InsuredSearchCriteriaPage;
import com.bie.qa.pages.LoginPage;
import com.bie.qa.pages.SelectLineOfBusinessPage;
import com.bie.qa.pages.ServiceMyCustomerPage;
import com.bie.qa.testdata.MysqlDatabase;
import com.bie.qa.testdata.MysqlDatabaseConnect;
import com.bie.qa.util.StringTest;
import com.bie.qa.util.Test;
import com.bie.qa.util.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BieUmbrellaStepDefinition extends TestBase{
	
	LoginPage loginpage = new LoginPage(); 
	ServiceMyCustomerPage serviceMyCustomer = new ServiceMyCustomerPage();
	SelectLineOfBusinessPage selectLineOfBusiness = new SelectLineOfBusinessPage();
	InsuredSearchCriteriaPage insuredSearchCriteria = new InsuredSearchCriteriaPage();
	TestUtil testutil = new TestUtil();
	MysqlDatabaseConnect mysqlDatabaseConnect = new MysqlDatabaseConnect();
/*	Test test = new Test();
	StringTest stringTest = new StringTest();*/ 
	
	@Given("^User launches Browser and opens BIE login Page$")
	public void user_launches_Browser_and_opens_BIE_login_Page() {
	    TestBase.initialization(); // Since this is a Static Class
	}
	
	@Then("^logs in entering \"([^\\\"]*)\" Agent credentials$")
	public void logs_in_entering_State_Agent_credentials(String state) {
		LoginPage loginpage = new LoginPage();
		loginpage.validateLoginPageTitle();
		mysqlDatabaseConnect.setUp();
		mysqlDatabaseConnect.getUserData(state);
		mysqlDatabaseConnect.tearDown();		
	}

	/*@Then("^logs in entering \"([^\"]*)\" and \"([^\"]*)\"$")
	public void logs_in_entering_username_and_password(String username, String password) {
		LoginPage loginpage = new LoginPage();
		loginpage.validateLoginPageTitle();		
		serviceMyCustomer = loginpage.login(username, password); //Example keyword
	}*/

	@Then("^selects Create Quote$")
	public void selects_Create_Quote() {
		serviceMyCustomer.validateUmbServiceMyCustomerPageTitle();
		serviceMyCustomer.createQuote();
	}

	@Then("^selects Umbrella and inputs \"([^\"]*)\"$")
	public void selects_Umbrella_and_inputs_effectiveDate(String enterEffectiveDate) {
		selectLineOfBusiness.validateUmbSelectLineOfBusinessPageTitle();
		selectLineOfBusiness = new SelectLineOfBusinessPage(); // Reinstated again
		insuredSearchCriteria = selectLineOfBusiness.continueQuoteCreation(enterEffectiveDate);		
	}

	@Then("^enters Insured details along with \"([^\"]*)\"$")
	public void enters_Insured_details_along_with_state(String state) throws InvalidFormatException, IOException, SQLException {
		TestUtil.getState(state);
		//String Sheet1 = "Sheet1";
		//StringTest.getTestData(Sheet1);  // Static access
		//Test.searchData();  // Static access
		mysqlDatabaseConnect.setUp();
		mysqlDatabaseConnect.getBusinessAddress();
		mysqlDatabaseConnect.tearDown();		
	}

	@Then("^enters Business information$")
	public void enters_Business_information() {
	}

	@Then("^inputs Underlying policy information$")
	public void inputs_Underlying_policy_information() {
	}

	@Then("^submits the quote for pricing$")
	public void submits_the_quote_for_pricing() {
	}

	@Then("^closes the Browser$")
	public void closes_the_Browser() {
	}
}
