package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.PendingException
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import org.openqa.selenium.support.ui.Select

public class RegisterStep {

	@Given("I open {string} in browser")
	public void i_open_in_browser(String string) {
		WebUI.openBrowser(string)
	}

	@When("I input {string} in Nama depan text field")
	public void i_input_in_as_Nama_depan_text_field(String value) {
		WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/TxtNamaDepan'), value)
	}

	@When("I input {string} in Nama belakang text field")
	public void i_input_in_as_Nama_belakang_text_field(String value) {
		WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/TxtNamaBelakang'), value)
	}

	@When("I input {string} in Email text field")
	public void i_input_in_as_Email_text_field(String value) {
		WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/TxtEmail'), value)
	}

	@When("I input {string} in re-Enter Email text field")
	public void i_input_in_as_re_Enter_Email_text_field(String value) {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/TxtEmail2'), 3)
		WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/TxtEmail2'), value)
	}

	@When("I input {string} in password text field")
	public void i_input_in_text_field(String value) {
		WebUI.setText(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/PassPassword'), value)
	}

	@When("I select {string} in day dropdown list")
	public void i_select_in_day_dropdown_list(String string) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/SelectTanggal'), string, false)
	}

	@When("I select {string} in month dropdown list")
	public void i_select_in_month_dropdown_list(String string) {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/SelectBulan'), string, false)
	}

	@When("I select {string} in year dropdown list")
	public void i_select_in_year_dropdown_list(String string) {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/SelectTahun'), string, false)
	}

	@When("I click {string} as Laki-laki radio button")
	public void i_click_as_Laki_laki_radio_button(String value) {
		WebUI.click(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/LabelLaki'))
	}

	@When("I click {string} as Daftar button")
	public void i_click_as_Daftar_button(String string) {
		WebUI.click(findTestObject('Object Repository/Page_Facebook - Masuk atau Daftar/ButtonDaftar'))
	}

	@Then("I verify Register successful is shown")
	public void i_verify_Register_successful_is_shown() {
		WebUI.verifyElementAttributeValue(null, null, null, 0)
	}
}
