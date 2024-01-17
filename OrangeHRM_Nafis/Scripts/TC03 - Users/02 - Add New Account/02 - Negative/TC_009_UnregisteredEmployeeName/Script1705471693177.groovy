import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC01 - Login/01_Positive/TC_001_LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/i_-- Select User role'))

WebUI.click(findTestObject('TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/div_Admin'))

WebUI.click(findTestObject('TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/i_-- Select Status'))

WebUI.click(findTestObject('TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/div_Enabled'))

WebUI.setText(findTestObject('TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/input_Employee Name'), 
    employeeName)

WebUI.delay(7)

WebUI.click(findTestObject('TC03 - Users/02 - Add New Account/TC_009_UnregisteredEmployeeName/Page_OrangeHRM/div_No Records Found'))

WebUI.setText(findTestObject('Object Repository/TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 
    password)

WebUI.setEncryptedText(findTestObject('TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 
    passwordConfirmation)

WebUI.click(findTestObject('Object Repository/TC03 - Users/02 - Add New Account/TC_008_AddNewUserSuccess/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('TC03 - Users/02 - Add New Account/TC_009_UnregisteredEmployeeName/Page_OrangeHRM/span_Invalid'))

