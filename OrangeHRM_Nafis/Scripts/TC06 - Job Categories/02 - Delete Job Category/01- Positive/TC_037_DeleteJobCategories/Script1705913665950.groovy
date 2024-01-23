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

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/i_Job_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/li_Job Categories'))

WebUI.click(findTestObject('TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/i_Barber Checkbox row 1'))

WebUI.click(findTestObject('TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/i_Education Checkbox Row 3'))

WebUI.click(findTestObject('TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/i_Health care Checkbox Row 4'))

WebUI.click(findTestObject('TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/i_IT Checkbox Row 5'))

WebUI.click(findTestObject('TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/i_Painter Checkbox Row 11'))

WebUI.scrollToElement(findTestObject('TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/button_Delete Selected'), 
    2)

WebUI.click(findTestObject('Object Repository/TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/button_Delete Selected'))

WebUI.click(findTestObject('TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/button_Delete Confirmation'))

WebUI.verifyElementVisible(findTestObject('Object Repository/TC06 - Job Categories/02 - Delete Job Category/TC_037_DeleteJobCategories/Page_OrangeHRM/div_SuccessSuccessfully Deleted'))

