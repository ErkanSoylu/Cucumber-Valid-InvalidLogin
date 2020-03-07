$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonLogin.feature");
formatter.feature({
  "line": 1,
  "name": "SuccessfulLogin",
  "description": "",
  "id": "successfullogin",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Valid login",
  "description": "",
  "id": "successfullogin;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am a user of amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I log in using valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonPage.givenPage()"
});
formatter.result({
  "duration": 21657884600,
  "status": "passed"
});
formatter.match({
  "location": "AmazonPage.whenPage()"
});
formatter.result({
  "duration": 4010702000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonPage.thenPage()"
});
formatter.result({
  "duration": 2967000000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Invalid login",
  "description": "",
  "id": "successfullogin;ınvalid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I am a user of amazon.com",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I log in using invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I should not be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonPage.givenPage()"
});
formatter.result({
  "duration": 17801941600,
  "status": "passed"
});
formatter.match({
  "location": "AmazonPage.whenFalsePage()"
});
formatter.result({
  "duration": 4462919200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonPage.thenInvalidPage()"
});
formatter.result({
  "duration": 2009789200,
  "status": "passed"
});
});