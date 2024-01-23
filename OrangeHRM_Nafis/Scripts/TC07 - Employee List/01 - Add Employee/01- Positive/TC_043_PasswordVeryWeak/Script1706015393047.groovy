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

WebUI.click(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee FirstName'), 
    empFirstName)

WebUI.setText(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee MiddleName'), 
    empMidName)

WebUI.setText(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee LastName'), 
    empLastName)

WebUI.sendKeys(findTestObject('TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee Id'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee Id'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee Id'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee Id'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Employee Id'), 
    empID)

WebUI.uploadFile(findTestObject('TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/Image File Upload'), 
    file)

WebUI.click(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/span_Create Login Details toggle'))

WebUI.setText(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    empUsername)

CustomKeywords.'addNewEmployee.SetEmployeeStatus.setEmpStatus'(status)

WebUI.setEncryptedText(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 
    empPassword)

WebUI.setEncryptedText(findTestObject('TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 
    empPasswordConfirmaton)

WebUI.click(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('TC07 - Employee List/01 - Add Employee/TC_043_PasswordVeryWeak/Page_OrangeHRM/span_Very Weak'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC07 - Employee List/01 - Add Employee/TC_038_AddEmployee/Page_OrangeHRM/div_SuccessSuccessfully Saved'))

WebUI.delay(3)

