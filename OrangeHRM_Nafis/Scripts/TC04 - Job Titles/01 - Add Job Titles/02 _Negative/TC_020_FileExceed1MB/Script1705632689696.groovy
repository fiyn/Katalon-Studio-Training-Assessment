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

WebUI.click(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/li_Job Titles'))

WebUI.click(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), 
    jobTitle)

WebUI.setText(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/textarea_a_oxd-textarea oxd-textarea--focus_c902e1'), 
    titleDescription)

WebUI.uploadFile(findTestObject('TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/input_file'), 
    file)

WebUI.setText(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/textarea_c_oxd-textarea oxd-textarea--focus_a65e5c'), 
    note)

WebUI.click(findTestObject('Object Repository/TC04 - Job Titles/01 - Add Job Titles/TC_018_AddNewJobTitle/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('TC04 - Job Titles/01 - Add Job Titles/TC_020_FileExceed1MB/Page_OrangeHRM/span_Attachment Size Exceeded'))

