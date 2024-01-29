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



class AddCurrency {

	@Given("Users login then navigate to Pay Grade page")
	def navigatePayGrade() {
		WebUI.callTestCase(findTestCase('TC01 - Login/01_Positive/TC_001_LoginSuccess'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='
			, ('urlAddress') : GlobalVariable.urlAddress], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('TC05 - Pay Grades/03 - Delete Currency/TC_029_DeleteACurrency/Page_OrangeHRM/a_Admin'))

		WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/li_Job'))

		WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/li_Pay Grades'))
	}

	@When("Users choose which (.*) to modify")
	def selectPayGrade(String payGradeName) {
		WebUI.click(findTestObject('TC05 - Pay Grades/03 - Delete Currency/TC_029_DeleteACurrency/Page_OrangeHRM/label_Checkbox Pay Grade',
				[('payGradeName') : payGradeName]), FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('TC05 - Pay Grades/04 - Edit Currency/TC_031_EditMinSalary/Page_OrangeHRM/button_Edit Action',
				[('payGradeName') : payGradeName]))
	}

	@And("Users add (.*), (.*) and, (.*)")
	def inputInformation(String currency, String minimumSalary, String maximumSalary) {
		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/02 - Add Currency/TC_026_AddNewCurrency/Page_OrangeHRM/button_Add'))

		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/02 - Add Currency/TC_026_AddNewCurrency/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

		WebUI.click(findTestObject('TC05 - Pay Grades/02 - Add Currency/TC_026_AddNewCurrency/Page_OrangeHRM/div_Currency drop down',
				[('currency') : currency]))

		WebUI.setText(findTestObject('Object Repository/TC05 - Pay Grades/02 - Add Currency/TC_026_AddNewCurrency/Page_OrangeHRM/input_Minimum Salary_oxd-input oxd-input--focus'),
				minimumSalary)

		WebUI.setText(findTestObject('Object Repository/TC05 - Pay Grades/02 - Add Currency/TC_026_AddNewCurrency/Page_OrangeHRM/input_Maximum Salary_oxd-input oxd-input--f_c30d90'),
				maximumSalary)
	}

	@Then("Users click 'Save' button and System displays the confirmation message")
	def saveForm() {
		WebUI.click(findTestObject('Object Repository/TC05 - Pay Grades/02 - Add Currency/TC_026_AddNewCurrency/Page_OrangeHRM/button_Save'))

		WebUI.verifyElementVisible(findTestObject('Object Repository/TC05 - Pay Grades/02 - Add Currency/TC_026_AddNewCurrency/Page_OrangeHRM/div_SuccessSuccessfully Saved'))
		
		WebUI.delay(3)
	}
}