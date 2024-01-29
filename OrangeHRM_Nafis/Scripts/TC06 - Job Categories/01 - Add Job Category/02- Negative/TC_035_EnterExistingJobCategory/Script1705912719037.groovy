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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('TC01 - Login/01_Positive/TC_001_LoginSuccess'), [('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='
        , ('urlAddress') : GlobalVariable.urlAddress], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/01 - Add Job Category/TC_034_AddNewJobCategory/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/01 - Add Job Category/TC_034_AddNewJobCategory/Page_OrangeHRM/i_Job_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/01 - Add Job Category/TC_034_AddNewJobCategory/Page_OrangeHRM/li_Job Categories'))

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/01 - Add Job Category/TC_034_AddNewJobCategory/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/TC06 - Job Categories/01 - Add Job Category/TC_034_AddNewJobCategory/Page_OrangeHRM/input_Name_oxd-input oxd-input--focus'), 
    jobCategoryName)

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/01 - Add Job Category/TC_034_AddNewJobCategory/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('TC06 - Job Categories/01 - Add Job Category/TC_035_EnterExistingJobCategory/Page_OrangeHRM/span_Already exists'))

WebUI.delay(2)

