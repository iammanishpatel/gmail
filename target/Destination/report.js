$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/feature/feature.feature");
formatter.feature({
  "name": "Mail Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser initiated and user is on Sign In Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.browser_initiated_and_user_is_on_Sign_In_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Sign In button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_Click_on_Sign_In_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_enters_UserName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Next button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_Click_on_Next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_enters_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Next button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_clicks_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Google app icon",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.click_on_Google_app_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Gmail icon in popUp menu",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.Click_on_Gmail_icon_in_popUp_menu()"
});
formatter.result({
  "status": "passed"
});
});