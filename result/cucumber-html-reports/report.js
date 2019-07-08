$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Register/Register.feature");
formatter.feature({
  "name": "As a user, I want to register Facebook using Automation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.scenario({
  "name": "Register Facebook",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "name": "I open \"https://www.facebook.com/\" in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStep.i_open_in_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"Mohamad\" in Nama depan text field",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStep.i_input_in_as_Nama_depan_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"Romli\" in Nama belakang text field",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_input_in_as_Nama_belakang_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"MohamadRomli@gmail.com\" in Email text field",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_input_in_as_Email_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"MohamadRomli@gmail.com\" in re-Enter Email text field",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_input_in_as_re_Enter_Email_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"IniP@ssw0rd\" in password text field",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_input_in_text_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"13\" in day dropdown list",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_select_in_day_dropdown_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Okt\" in month dropdown list",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_select_in_month_dropdown_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"1988\" in year dropdown list",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_select_in_year_dropdown_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Khusus\" as Laki-laki radio button",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.i_click_as_Laki_laki_radio_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Daftar\" as Daftar button",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStep.i_click_as_Daftar_button(String)"
});
formatter.result({
  "status": "passed"
});
});