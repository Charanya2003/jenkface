$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login functionality of facebook app",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninSteps.the_user_should_be_in_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality with invalid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user has to fill username and password",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.the_user_has_to_fill_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "SigninSteps.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be in invalid page",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.user_should_be_in_invalid_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninSteps.the_user_should_be_in_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the registration functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user has to fill firstname and lastname",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.the_user_has_to_fill_firstname_and_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the signup button",
  "keyword": "And "
});
formatter.match({
  "location": "SigninSteps.the_user_should_click_the_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.the_user_successfully_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "SigninSteps.the_user_should_be_in_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality1 with invalid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@retest"
    }
  ]
});
formatter.step({
  "name": "The user has to fill username \"vijay\" and password \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.the_user_has_to_fill_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be in invalid page again",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.user_should_be_in_invalid_page_again()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});