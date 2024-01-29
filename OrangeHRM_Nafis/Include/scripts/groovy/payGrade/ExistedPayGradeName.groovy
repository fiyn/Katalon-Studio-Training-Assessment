package payGrade
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ExistedPayGradeName {

	@Given("Users navigate to Pay Grade page and click 'Add' button")
	def navigateToPayGrade() {
		WebUI.callTestCase(findTestCase('TC01 - Login/01_Positive/TC_001_LoginSuccess'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='
			, ('urlAddress') : GlobalVariable.urlAddress], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/01 - Add Pay Grade/TC_024_AddPayGrade/Page_OrangeHRM/a_Admin'))

		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/01 - Add Pay Grade/TC_024_AddPayGrade/Page_OrangeHRM/i_Job_oxd-icon bi-chevron-down'))

		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/01 - Add Pay Grade/TC_024_AddPayGrade/Page_OrangeHRM/a_Pay Grades'))

		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/01 - Add Pay Grade/TC_024_AddPayGrade/Page_OrangeHRM/button_Add'))
	}

	@When("Users enter registered Pay Grade (.*) into input box")
	def inputRegisteredName(String payGradeName) {
		WebUI.setText(findTestObject('Object Repository/TC05 - Pay Grades/01 - Add Pay Grade/TC_024_AddPayGrade/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'),
				payGradeName)
	}

	@And("Users click the 'Save' button")
	def clickSave() {
		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/01 - Add Pay Grade/TC_024_AddPayGrade/Page_OrangeHRM/button_Save'))
	}

	@Then("System displays an error message 'Name Already Exists'")
	def displayErrorMessage() {
		WebUI.verifyElementVisible(findTestObject('TC05 - Pay Grades/01 - Add Pay Grade/TC_025_RegisteredPayGrade/Page_OrangeHRM/span_Already exists'))
	}
}