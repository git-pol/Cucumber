$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Dev/Eclipse/BddBieAutomation/src/main/java/com/bie/qa/features/umbrella.feature");
formatter.feature({
  "line": 1,
  "name": "BIE Login Feature",
  "description": "",
  "id": "bie-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Without Examples keyword"
    },
    {
      "line": 5,
      "value": "#Scenario: BIE Login Test Scenario"
    },
    {
      "line": 7,
      "value": "#Given User is already on Login Page"
    },
    {
      "line": 8,
      "value": "#When Title of Login page is Farmers Network"
    },
    {
      "line": 9,
      "value": "#Then User enters \"Neill899\" and \"test11\""
    },
    {
      "line": 10,
      "value": "#Then User clicks on Login Button"
    },
    {
      "line": 11,
      "value": "#Then User is on UmbServiceMyCustomerPage"
    },
    {
      "line": 14,
      "value": "#With Examples keyword"
    },
    {
      "line": 16,
      "value": "#Scenario Outline: Login with valid credentials"
    },
    {
      "line": 17,
      "value": "#"
    },
    {
      "line": 18,
      "value": "#Given User is already on Login Page"
    },
    {
      "line": 19,
      "value": "#When Title of Login page is Farmers Network"
    },
    {
      "line": 20,
      "value": "#Then User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\""
    },
    {
      "line": 21,
      "value": "#Then User clicks on Login Button"
    },
    {
      "line": 22,
      "value": "#Then User is on ServiceMyCustomerPage"
    },
    {
      "line": 23,
      "value": "#Then Close the Browser"
    },
    {
      "line": 24,
      "value": "#Examples:"
    },
    {
      "line": 25,
      "value": "#\t|\tusername\t|\tpassword\t|"
    },
    {
      "line": 26,
      "value": "#\t|\tNeil899\t\t|\ttest11\t\t|"
    },
    {
      "line": 27,
      "value": "#\t|\tNelm843\t\t|\tAdmin2016\t|"
    }
  ],
  "line": 29,
  "name": "Launch Browser and create an Umbrella policy",
  "description": "",
  "id": "bie-login-feature;launch-browser-and-create-an-umbrella-policy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 31,
  "name": "User launches Browser and opens BIE login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "logs in entering \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "selects Create Quote",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "selects Umbrella and inputs \"\u003ceffective date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "enters Insured details along with \"\u003cstate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "enters Business information",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "inputs Underlying policy information",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "submits the quote for pricing",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "closes the Browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "bie-login-feature;launch-browser-and-create-an-umbrella-policy;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "effective date",
        "state"
      ],
      "line": 41,
      "id": "bie-login-feature;launch-browser-and-create-an-umbrella-policy;;1"
    },
    {
      "cells": [
        "Neil899",
        "test11",
        "05-01-2018",
        "CA"
      ],
      "line": 42,
      "id": "bie-login-feature;launch-browser-and-create-an-umbrella-policy;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 42,
  "name": "Launch Browser and create an Umbrella policy",
  "description": "",
  "id": "bie-login-feature;launch-browser-and-create-an-umbrella-policy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 31,
  "name": "User launches Browser and opens BIE login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "logs in entering \"Neil899\" and \"test11\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "selects Create Quote",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "selects Umbrella and inputs \"05-01-2018\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "enters Insured details along with \"CA\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "enters Business information",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "inputs Underlying policy information",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "submits the quote for pricing",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "closes the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BieUmbrellaStepDefinition.user_launches_Browser_and_opens_BIE_login_Page()"
});
formatter.result({
  "duration": 5705194614,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "BieUmbrellaStepDefinition.selects_Create_Quote()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "05-01-2018",
      "offset": 29
    }
  ],
  "location": "BieUmbrellaStepDefinition.selects_Umbrella_and_inputs_effectiveDate(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CA",
      "offset": 35
    }
  ],
  "location": "BieUmbrellaStepDefinition.enters_Insured_details_along_with_state(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BieUmbrellaStepDefinition.enters_Business_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BieUmbrellaStepDefinition.inputs_Underlying_policy_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BieUmbrellaStepDefinition.submits_the_quote_for_pricing()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BieUmbrellaStepDefinition.closes_the_Browser()"
});
formatter.result({
  "status": "skipped"
});
});