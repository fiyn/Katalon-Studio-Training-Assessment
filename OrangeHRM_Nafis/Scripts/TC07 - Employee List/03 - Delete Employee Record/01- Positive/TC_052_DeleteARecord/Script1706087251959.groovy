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

WebUI.callTestCase(findTestCase('TC01 - Login/01_Positive/TC_001_LoginSuccess'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='
        , ('urlAddress') : GlobalVariable.urlAddress], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/i_Checkbox Row 0'))

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/button_Delete Row Button'))

WebUI.click(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/button_Yes, Delete confirmation'))

WebUI.verifyElementVisible(findTestObject('TC07 - Employee List/03 - Delete Employee Record/TC_052_DeleteARecord/Page_OrangeHRM/div_SuccessSuccessfully Deleted'))

