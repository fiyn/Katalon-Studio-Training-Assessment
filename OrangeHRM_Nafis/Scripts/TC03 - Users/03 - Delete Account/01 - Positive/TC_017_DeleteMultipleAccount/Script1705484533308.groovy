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

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_017_DeleteMultipleAccount/Page_OrangeHRM/a_Admin'))

WebUI.setText(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    username1)

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/label'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/i_Enabled_oxd-icon bi-trash'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementVisible(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/div_SuccessSuccessfully Deleted Message'))

WebUI.verifyElementVisible(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/div_InfoNo Records Found'))

WebUI.verifyElementVisible(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/span_No Records Found'))

WebUI.sendKeys(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    username2)

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/label'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/i_Enabled_oxd-icon bi-trash'))

WebUI.click(findTestObject('Object Repository/TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/button_Yes, Delete'))

WebUI.verifyElementVisible(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/div_SuccessSuccessfully Deleted Message'))

WebUI.verifyElementVisible(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/div_InfoNo Records Found'))

WebUI.verifyElementVisible(findTestObject('TC03 - Users/03 - Delete Account/TC_016_DeleteAccountSuccess/Page_OrangeHRM/span_No Records Found'))

