$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Verify Search result display",
  "description": "",
  "id": "login;verify-search-result-display",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Today"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "launch \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Enter XPS in Search field",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify Search result Should display",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 8
    }
  ],
  "location": "HomePageStepDef.launch(String)"
});
formatter.result({
  "duration": 425744200,
  "error_message": "java.lang.NullPointerException: null value in entry: url\u003dnull\r\n\tat com.google.common.collect.CollectPreconditions.checkEntryNotNull(CollectPreconditions.java:32)\r\n\tat com.google.common.collect.SingletonImmutableBiMap.\u003cinit\u003e(SingletonImmutableBiMap.java:42)\r\n\tat com.google.common.collect.ImmutableBiMap.of(ImmutableBiMap.java:72)\r\n\tat com.google.common.collect.ImmutableMap.of(ImmutableMap.java:124)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat com.test.utill.TestBase.getURL(TestBase.java:52)\r\n\tat StepDeff.HomePageStepDef.launch(HomePageStepDef.java:17)\r\n\tat ✽.Given launch \"\u003cURL\u003e\"(HomePage.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageStepDef.enter_XPS_in_Search_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStepDef.click_on_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageStepDef.verify_Search_result_Should_display()"
});
formatter.result({
  "status": "skipped"
});
});